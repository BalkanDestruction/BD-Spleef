package fr.naruse.spleef.v1_13.api.event.cancellable.game;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;
import fr.naruse.spleef.v1_13.game.spleef.Spleef;
import org.bukkit.entity.Player;

import java.util.List;

@SpleefCancellable
public class SpleefGivingStuffEvent extends SpleefCancellableEvent {
    private final Spleef spleef;
    private final List<Player> players;

    public SpleefGivingStuffEvent(SpleefPluginV1_13 pl, Spleef spleef, List<Player> playerList) {
        super(pl, "SpleefGivingStuffEvent");
        this.spleef = spleef;
        this.players = playerList;
    }

    public Spleef getSpleef() {
        return spleef;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
