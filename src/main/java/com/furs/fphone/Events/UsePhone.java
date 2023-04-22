package com.furs.fphone.Events;

import com.furs.fphone.fphone;
import com.furs.fphone.Utils.Manager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class UsePhone implements Listener {
    private final fphone plugin;

    public UsePhone(fphone plugin){this.plugin = plugin;}

    @EventHandler
    @Deprecated
    public void onClickPhone(PlayerInteractEvent e){
        Manager manager = new Manager(this.plugin);
        Player p = e.getPlayer();
        if(p.getItemInHand().getType() == Material.IRON_INGOT){
            p.openInventory(manager.phoneInter());
        }

    }
}
