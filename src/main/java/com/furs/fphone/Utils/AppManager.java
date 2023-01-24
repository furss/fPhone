package com.furs.fphone.Utils;

import com.furs.fphone.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class AppManager {
    private final Main plugin;
    public AppManager(Main plugin){this.plugin = plugin;}

    public Inventory Messages(){
        Manager manager = new Manager(this.plugin);
        Inventory inv = Bukkit.createInventory(null, 18, "Cообщения");
        for(Player p : Bukkit.getOnlinePlayers())
            inv.addItem(manager.PlayerSkull(p));
        return inv;
    }
}
