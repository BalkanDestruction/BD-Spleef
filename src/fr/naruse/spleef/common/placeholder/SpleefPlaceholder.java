package fr.naruse.spleef.common.placeholder;

import fr.naruse.spleef.main.SpleefPlugin;
import me.clip.placeholderapi.PlaceholderAPIPlugin;
import org.bukkit.Bukkit;

public class SpleefPlaceholder {
    public SpleefPlaceholder(SpleefPlugin pl) {
        PlaceholderAPIPlugin placeholderAPIPlugin = (PlaceholderAPIPlugin) Bukkit.getPluginManager().getPlugin("PlaceholderAPI");
        if(placeholderAPIPlugin != null){
            new RankingExpansion().register();
        }
    }
}
