package fr.naruse.spleef.v1_13.api.event.cancellable.game;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;
import fr.naruse.spleef.v1_13.game.spleef.Spleef;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;

@SpleefCancellable
public class SpleefBreakSnowEvent extends SpleefCancellableEvent {
    private final Spleef spleef;
    private final Player player;
    private final Block block;

    public SpleefBreakSnowEvent(SpleefPluginV1_13 pl, Spleef spleef, Player p, Block block) {
        super(pl, "SpleefBreakSnowEvent");
        this.spleef = spleef;
        this.player = p;
        this.block = block;
    }

    public Spleef getSpleef() {
        return spleef;
    }

    public Player getPlayer() {
        return player;
    }

    public Block getBlock() {
        return block;
    }
}
