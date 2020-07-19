package fr.naruse.spleef.v1_13.game.wager;

import com.google.common.collect.Lists;
import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.SpleefAPIEventInvoker;
import fr.naruse.spleef.v1_13.api.event.cancellable.wager.SpleefWagerDeleteEvent;
import fr.naruse.spleef.v1_13.api.event.cancellable.wager.SpleefWagerInviteEvent;
import fr.naruse.spleef.v1_13.api.event.cancellable.wager.SpleefWagerLoseEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;

public class Wagers {
    private final SpleefPluginV1_13 pl;
    private final List<Wager> wagers = Lists.newArrayList();
    private final HashMap<Player, Wager> wagerOfPlayer = new HashMap<>();

    public Wagers(SpleefPluginV1_13 pl) {
        this.pl = pl;
    }

    public boolean createWager(Player p, Player p2) {
        if (wagerOfPlayer.containsKey(p) || wagerOfPlayer.containsKey(p2)) {
            return false;
        }
        Wager wager = new Wager(pl, p, p2);
        if (new SpleefAPIEventInvoker(new SpleefWagerInviteEvent.Pre(pl, p, p2, wager)).isCancelled()) {
            return false;
        }
        wagers.add(wager);
        wagerOfPlayer.put(p, wager);
        wagerOfPlayer.put(p2, wager);
        Bukkit.getPluginManager().registerEvents(wager, pl.getSpleefPlugin());
        new SpleefAPIEventInvoker(new SpleefWagerInviteEvent.Post(pl, p, p2, wager));
        return true;
    }

    public void deleteWager(Wager wager) {
        if (!wagers.contains(wager)) {
            return;
        }
        if (new SpleefAPIEventInvoker(new SpleefWagerDeleteEvent.Pre(pl, wager)).isCancelled()) {
            return;
        }
        wager.stop();
        wagers.remove(wager);
        new SpleefAPIEventInvoker(new SpleefWagerDeleteEvent.Post(pl, wager));
    }

    public void loseWager(Player p) {
        if (!wagerOfPlayer.containsKey(p)) {
            return;
        }
        Wager wager = wagerOfPlayer.get(p);
        if (new SpleefAPIEventInvoker(new SpleefWagerLoseEvent.Pre(pl, p, wager)).isCancelled()) {
            return;
        }
        if (wager.getLost() == null) {
            wager.setLost(p);
        } else {
            wager.win(p);
        }
        new SpleefAPIEventInvoker(new SpleefWagerLoseEvent.Pre(pl, p, wager));
    }

    public void disable() {
        for (Wager wager : wagers) {
            wager.decline();
        }
    }

    public boolean hasWager(Player p) {
        return wagerOfPlayer.containsKey(p);
    }

    public HashMap<Player, Wager> getWagerOfPlayer() {
        return wagerOfPlayer;
    }

    public List<Wager> getWagers() {
        return wagers;
    }

}
