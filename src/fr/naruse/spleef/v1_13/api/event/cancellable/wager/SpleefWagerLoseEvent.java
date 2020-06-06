package fr.naruse.spleef.v1_13.api.event.cancellable.wager;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;
import fr.naruse.spleef.v1_13.game.wager.Wager;
import org.bukkit.entity.Player;

public class SpleefWagerLoseEvent extends SpleefCancellableEvent {
    public SpleefWagerLoseEvent(SpleefPluginV1_13 pl, String eventName) {
        super(pl, eventName);
    }

    @SpleefCancellable
    public static class Pre extends SpleefWagerLoseEvent {
        private final Wager wager;
        private final Player player;

        public Pre(SpleefPluginV1_13 pl, Player p, Wager wager) {
            super(pl, "SpleefWagerLoseEvent.Pre");
            this.wager = wager;
            this.player = p;
        }

        public Player getPlayer() {
            return player;
        }

        public Wager getWager() {
            return wager;
        }
    }

    public static class Post extends SpleefWagerLoseEvent {
        private final Wager wager;
        private final Player player;

        public Post(SpleefPluginV1_13 pl, Player p, Wager wager) {
            super(pl, "SpleefWagerLoseEvent.Post");
            this.wager = wager;
            this.player = p;
        }

        public Player getPlayer() {
            return player;
        }

        public Wager getWager() {
            return wager;
        }
    }
}
