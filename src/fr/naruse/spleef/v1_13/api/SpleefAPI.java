package fr.naruse.spleef.v1_13.api;

import com.google.common.collect.Lists;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import java.util.List;

public class SpleefAPI {
    private final List<Listener> spleefListeners = Lists.newArrayList();
    public SpleefAPI() {
    }

    protected void sendMessage(String msg){
        Bukkit.getConsoleSender().sendMessage("§c§l[§3Spleef§c§l] §c§l[§3EventAPI§c§l] §2"+msg);
    }

    public void registerEvents(Listener spleefListener){
        spleefListeners.add(spleefListener);
    }

    protected List<Listener> getSpleefListeners(){
        return spleefListeners;
    }
}
