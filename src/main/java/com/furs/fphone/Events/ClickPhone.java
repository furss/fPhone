package com.furs.fphone.Events;

import com.furs.fphone.Main;
import com.furs.fphone.Utils.AppManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickPhone implements Listener {
    private final Main plugin;

    public ClickPhone(Main plugin){this.plugin = plugin;}


    @EventHandler
    public void onClickApp(InventoryClickEvent e ){
        AppManager appManager = new AppManager(this.plugin);
        Player p = (Player) e.getWhoClicked();
        if(!e.getView().getTitle().equals("fPhone")) {return;}
        e.setCancelled(true);
        if(e.getView().getTitle().equals("fPhone")) {
            switch (e.getCurrentItem().getType()) {
                case FLOWER_BANNER_PATTERN:
                    p.openInventory(appManager.Messages());
        }
        }
    }
}
