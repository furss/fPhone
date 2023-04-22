package com.furs.fphone.Utils;

import com.furs.fphone.fphone;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AppManager {
    private final fphone plugin;
    public AppManager(fphone plugin){this.plugin = plugin;}

    public Inventory Messages(){
        List<Player> playermap = new ArrayList<>();
        playermap.clear();
        double InvS = (double)(playermap.size() / 9);
        int invSlots = (int)Math.ceil(InvS);
        if(invSlots == 0)
            ++invSlots;
        Iterator var1 = Bukkit.getOnlinePlayers().iterator();
        while (var1.hasNext()) {
            Player player = (Player) var1.next();
            if (player.getInventory().contains(Manager.phone())) ;
            {
                playermap.add(player);
            }
        }
        Inventory inv = Bukkit.createInventory((InventoryHolder) null, 9 * invSlots, " ");
        for(int i = 0; i < playermap.size(); i++){
            inv.setItem(i, Manager.playerSkull((Player) playermap.get(i)));
        }
        for(int i2 = 0; i2 < inv.getSize(); i2++){
            if(inv.getItem(i2) == null){
                inv.setItem(i2, Manager.BlockItem());
            }
        }
        
        return inv;
    }
}
