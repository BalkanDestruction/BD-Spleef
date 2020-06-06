package fr.naruse.spleef.v1_13.api.event.cancellable.game;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;
import fr.naruse.spleef.v1_13.game.spleef.Spleef;
import org.bukkit.block.Sign;

@SpleefCancellable
public class SpleefRegisteringSignEvent extends SpleefCancellableEvent {
    private final Spleef spleef;
    private final Sign sign;

    public SpleefRegisteringSignEvent(SpleefPluginV1_13 pl, Spleef spleef, Sign sign) {
        super(pl, "SpleefRegisteringSignEvent");
        this.spleef = spleef;
        this.sign = sign;
    }

    public Spleef getSpleef() {
        return spleef;
    }

    public Sign getSign() {
        return sign;
    }
}
