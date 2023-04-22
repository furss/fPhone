package com.furs.fphone.Events;

import com.furs.fphone.Apps.MusicPlayer;
import com.furs.fphone.Apps.Settings;
import com.furs.fphone.Utils.AppManager;
import com.furs.fphone.fphone;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.ArrayList;
import java.util.List;

public class ClickPhone implements Listener {
    private final fphone plugin;

    public ClickPhone(fphone plugin){this.plugin = plugin;}


    @EventHandler
    public void onClickApp(InventoryClickEvent e){
        AppManager appManager = new AppManager(this.plugin);
        Settings settings = new Settings(this.plugin);
        Player p = (Player) e.getWhoClicked();
        List<String> inv = new ArrayList<>();
        inv.add(" ");
        inv.add("Муз.Плеер");

        if(!e.getView().getTitle().equals(inv))
            e.setCancelled(true);
        if(e.getView().getTitle().equals("Муз.Плеер"))
            switch (e.getCurrentItem().getType()){
                case MUSIC_DISC_BLOCKS:
                    p.playSound(p.getLocation(),"custom.baza" , 1, 1);
                    break;
            }

        if(e.getView().getTitle().equals(" ")) {
            switch (e.getCurrentItem().getType()) {
                case FLOWER_BANNER_PATTERN:
                    p.openInventory(appManager.Messages());
                    break;
                case BARRIER:
                    p.closeInventory();
                    break;
                case REDSTONE:
                    p.openInventory(settings.Settings());
                    break;
                case MUSIC_DISC_CAT:
                    p.openInventory(MusicPlayer.MusicPlayer());
                    break;
        }
        }
    }
}
