package fr.naruse.spleef.v1_13.api.event.cancellable.game;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;
import fr.naruse.spleef.v1_13.game.spleef.Spleef;

public class SpleefArenaSchedulerEvent extends SpleefCancellableEvent {
    public SpleefArenaSchedulerEvent(SpleefPluginV1_13 pl, String eventName) {
        super(pl, eventName);
    }

    @SpleefCancellable
    public static class Pre extends SpleefArenaSchedulerEvent {
        private final Spleef spleef;
        public Pre(SpleefPluginV1_13 pl, Spleef spleef) {
            super(pl, "SpleefArenaSchedulerEvent.Pre");
            this.spleef = spleef;
        }

        public Spleef getSpleef() {
            return spleef;
        }
    }

    public static class Post extends SpleefArenaSchedulerEvent {
        private final Spleef spleef;
        public Post(SpleefPluginV1_13 pl, Spleef spleef) {
            super(pl, "SpleefArenaSchedulerEvent.Post");
            this.spleef = spleef;
        }

        public Spleef getSpleef() {
            return spleef;
        }
    }
}
