package fr.naruse.spleef.v1_13.util.board;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import com.google.common.collect.Lists;
import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.SpleefAPIEventInvoker;
import fr.naruse.spleef.v1_13.api.event.cancellable.game.SpleefHologramsUpdateEvent;
import fr.naruse.spleef.v1_13.util.Message;
import fr.naruse.spleef.v1_13.util.SpleefPlayerStatistics;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public class Holograms extends BukkitRunnable {
    private final SpleefPluginV1_13 pl;
    private final HashMap<OfflinePlayer, Long> playerPoints = new HashMap<>();
    private final List<Long> intList = Lists.newArrayList();
    private final List<String> nameUsed = Lists.newArrayList();
    private final HashMap<OfflinePlayer, SpleefPlayerStatistics> spleefPlayerHashMap = new HashMap<>();
    private Hologram hologram;
    private boolean isRunning = false;

    public Holograms(SpleefPluginV1_13 spleefPlugin) {
        this.pl = spleefPlugin;
        if (Bukkit.getVersion().contains("1.13") || Bukkit.getVersion().contains("1.14")) {
            return;
        }
        if (pl.getConfig().getString("holograms.location.x") == null) {
            return;
        }
        if (!pl.getConfig().getBoolean("holograms.enable")) {
            return;
        }
        Location location = new Location(Bukkit.getWorld(Objects.requireNonNull(pl.getConfig().getString("holograms.location.world"))), pl.getConfig().getDouble("holograms.location.x"),
                pl.getConfig().getDouble("holograms.location.y"), pl.getConfig().getDouble("holograms.location.z"));
        if (!pl.otherPluginSupport.getHolographicDisplaysPlugin().isPresent()) {
            Bukkit.getConsoleSender().sendMessage(Message.SPLEEF.getMessage() + " §cWhere is HolographicDisplays ?");
            return;
        }
        this.hologram = HologramsAPI.createHologram(pl.getSpleefPlugin(), location);
        for (int i = 0; i != 6; i++) {
            hologram.appendTextLine("");
        }
        for (OfflinePlayer p : Bukkit.getOfflinePlayers()) {
            if (pl.getConfig().getString(p.getUniqueId().toString()) != null) {
                long points = pl.getConfig().getInt(p.getUniqueId().toString());
                playerPoints.put(p, points);
            }
        }
        hologram.insertTextLine(0, "§6" + Message.SPLEEF_PLAYER_RANKING.getMessage() + "§c§c§l");
        this.runTaskTimer(pl.getSpleefPlugin(), 20 * 5, 20 * 5);
        this.run();
        this.isRunning = true;
    }

    @Override
    public void run() {
        addPlayers();
        HashMap<Long, List<OfflinePlayer>> placeAndPlayer = getLeaderBoard();
        int count = 1, count2 = 5;
        for (int o = placeAndPlayer.size() - 1; o >= 0; o--) {
            StringBuilder name = new StringBuilder("§d-§6" + count + ":,");
            long i = intList.get(o);
            if (placeAndPlayer.containsKey(i)) {
                for (OfflinePlayer p : placeAndPlayer.get(i)) {
                    if (p != null) {
                        name.append(", §a").append(p.getName()).append(" §e(§6Wins: ").append(getSpleefPlayer(p).getWins()).append("§e, §6Loses: ").append(getSpleefPlayer(p).getLoses()).append("§e)");
                    }
                }
                name = new StringBuilder(name.toString().replace(",,", ""));
                SpleefHologramsUpdateEvent shue = new SpleefHologramsUpdateEvent(pl, name.toString(), this);
                if (!new SpleefAPIEventInvoker(shue).isCancelled()) {
                    name = new StringBuilder(shue.getLine());
                    hologram.removeLine(count);
                    hologram.insertTextLine(count, name.toString());
                }
                if (count == 5 || count2 == 1) {
                    break;
                }
                count++;
                count2--;
            }
        }
        intList.clear();
    }

    private HashMap<Long, List<OfflinePlayer>> getLeaderBoard() {
        HashMap<Long, List<OfflinePlayer>> pAndP = new HashMap<>();
        for (OfflinePlayer p : playerPoints.keySet()) {
            if (!nameUsed.contains(p.getName())) {
                long lives = playerPoints.get(p);
                intList.add(lives);
                if (!pAndP.containsKey(lives)) {
                    pAndP.put(lives, Lists.newArrayList());
                }
                pAndP.get(lives).add(p);
                nameUsed.add(p.getName());
            }
        }
        Collections.sort(intList);
        nameUsed.clear();
        HashMap<Long, List<OfflinePlayer>> placeAndPlayer = new HashMap<>();
        for (long i : intList) {
            placeAndPlayer.put(i, pAndP.get(i));
        }
        return placeAndPlayer;
    }

    public void removeLeaderBoard() {
        if (isRunning) {
            this.cancel();
        }
        if (hologram != null) {
            hologram.delete();
        }
    }

    public void addPlayers() {
        for (OfflinePlayer p : Bukkit.getOfflinePlayers()) {
            if (getSpleefPlayer(p).getWins() != 0) {
                addPlayerPoints(p, getSpleefPlayer(p).getWins());
            }
        }
    }

    public void addPlayerPoints(OfflinePlayer p, long points) {
        playerPoints.remove(p);
        playerPoints.put(p, points);
    }

    private SpleefPlayerStatistics getSpleefPlayer(OfflinePlayer p) {
        if (spleefPlayerHashMap.containsKey(p)) {
            spleefPlayerHashMap.get(p).refreshStatisticFromConfig();
            return spleefPlayerHashMap.get(p);
        }
        SpleefPlayerStatistics spleefPlayerStatistics = new SpleefPlayerStatistics(pl, p.getName());
        spleefPlayerHashMap.put(p, spleefPlayerStatistics);
        return spleefPlayerStatistics;
    }
}
