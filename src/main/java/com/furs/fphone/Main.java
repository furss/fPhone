package com.furs.fphone;

import com.furs.fphone.Events.ClickPhone;
import com.furs.fphone.Events.UsePhone;
import com.furs.fphone.Utils.Manager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class Main extends JavaPlugin {
    private static Main plugin;
    public static Main getPlugin() {
        return plugin;
    }



    @Override
    public void onEnable() {

        plugin = this;
        this.getCommand("fphone").setExecutor(new gPhone(this));
        getServer().getPluginManager().registerEvents(new UsePhone(this), this);
        getServer().getPluginManager().registerEvents(new ClickPhone(this), this);
        this.send("fPhone enabled! by furs");

        Manager manager = new Manager(this);
    }

    public void send(String s) {
        this.getServer().getConsoleSender().sendMessage(s.replace("&", "§"));
    }

    public String getStr(String path) {
        return Objects.requireNonNull(this.getConfig().getString(path)).replace("&", "§");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
