package fr.naruse.spleef.v1_13.api.event.cancellable.game;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;
import fr.naruse.spleef.v1_13.game.spleef.Spleef;

import java.util.List;


public class SpleefReloadingEvent extends SpleefCancellableEvent {
    public SpleefReloadingEvent(SpleefPluginV1_13 pl, String eventName) {
        super(pl, eventName);
    }

    @SpleefCancellable
    public static class Pre extends SpleefReloadingEvent {
        private final Spleef spleef;

        public Pre(SpleefPluginV1_13 pl, Spleef spleef) {
            super(pl, "SpleefReloadingEvent.Pre");
            this.spleef = spleef;
        }

        public Spleef getSpleef() {
            return spleef;
        }
    }

    public static class Post extends SpleefReloadingEvent {
        private final List<Spleef> spleefs;

        public Post(SpleefPluginV1_13 pl, List<Spleef> spleefs) {
            super(pl, "SpleefReloadingEvent.Post");
            this.spleefs = spleefs;
        }

        public List<Spleef> getSpleefs() {
            return spleefs;
        }
    }
}
