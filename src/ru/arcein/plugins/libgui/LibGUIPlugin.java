package ru.arcein.plugins.libgui;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class LibGUIPlugin extends JavaPlugin {


    public void onLoad() {
        Bukkit.getLogger().info("[ARCEIN] LibGUI has been loaded!");
    }

    public void onEnable() {
        getServer().getPluginManager().registerEvents(new LibGUIListener(this), this);
        Bukkit.getLogger().info("[ARCEIN] LibGUI has been enabled!");
    }

    public void onDisable(){

        Bukkit.getLogger().info("[ARCEIN] LibGUI has been disabled.");
    }

    private class LibGUIListener implements Listener{
        LibGUIPlugin plugin;
        public LibGUIListener(LibGUIPlugin plugin){
            this.plugin = plugin;
        }


    }

}

