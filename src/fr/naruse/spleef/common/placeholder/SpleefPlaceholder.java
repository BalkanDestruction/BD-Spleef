package fr.naruse.spleef.common.placeholder;

import me.clip.placeholderapi.PlaceholderAPIPlugin;
import org.bukkit.Bukkit;

public class SpleefPlaceholder {
    public SpleefPlaceholder() {
        PlaceholderAPIPlugin placeholderAPIPlugin = (PlaceholderAPIPlugin) Bukkit.getPluginManager().getPlugin("PlaceholderAPI");
        if (placeholderAPIPlugin != null) {
            new RankingExpansion().register();
        }
    }
}
