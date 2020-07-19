package fr.naruse.spleef.v1_13.api.event.cancellable.loading;

import fr.naruse.spleef.manager.SpleefPluginV1_13;
import fr.naruse.spleef.v1_13.api.event.SpleefCancellable;
import fr.naruse.spleef.v1_13.api.event.cancellable.SpleefCancellableEvent;
import fr.naruse.spleef.v1_13.game.spleef.Spleef;
import fr.naruse.spleef.v1_13.game.spleef.SpleefGameMode;
import org.bukkit.Location;

public class SpleefLoadingArenasEvent extends SpleefCancellableEvent {

    public SpleefLoadingArenasEvent(SpleefPluginV1_13 pl, String eventName) {
        super(pl, eventName);
    }

    @SpleefCancellable
    public static class Pre extends SpleefLoadingArenasEvent {
        private final String name;

        public Pre(SpleefPluginV1_13 pl, String name) {
            super(pl, "SpleefLoadingArenasEvent.Pre");
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public static class Post extends SpleefLoadingArenasEvent {
        private final String name;
        private final Location spleefLoc;
        private final Location spleefSpawn;
        private final Location spleefLobby;
        private final Location regionPos1;
        private final Location regionPos2;
        private final int min;
        private final int max;
        private final boolean isOpen;
        private final SpleefGameMode gameMode;
        private final Spleef spleef;

        public Post(SpleefPluginV1_13 pl, String name, Spleef spleef, Location spleefLoc, Location spleefSpawn, Location spleefLobby, int min, int max, boolean isOpen, SpleefGameMode gameMode, Location regionPos1, Location regionPos2) {
            super(pl, "SpleefLoadingArenasEvent.Post");
            this.name = name;
            this.spleefLobby = spleefLobby;
            this.spleefSpawn = spleefSpawn;
            this.spleefLoc = spleefLoc;
            this.min = min;
            this.max = max;
            this.isOpen = isOpen;
            this.gameMode = gameMode;
            this.regionPos1 = regionPos1;
            this.regionPos2 = regionPos2;
            this.spleef = spleef;
        }

        public Spleef getSpleef() {
            return spleef;
        }

        public String getName() {
            return name;
        }

        public Location getSpleefSpawn() {
            return spleefSpawn;
        }

        public Location getSpleefLoc() {
            return spleefLoc;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }

        public Location getRegionPos1() {
            return regionPos1;
        }

        public Location getRegionPos2() {
            return regionPos2;
        }

        public Location getSpleefLobby() {
            return spleefLobby;
        }

        public SpleefGameMode getGameMode() {
            return gameMode;
        }

        public boolean isOpen() {
            return isOpen;
        }
    }
}
