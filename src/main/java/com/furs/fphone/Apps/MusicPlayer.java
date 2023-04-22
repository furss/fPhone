package com.furs.fphone.Apps;

import com.furs.fphone.fphone;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private final fphone plugin;
    public MusicPlayer(fphone plugin){this.plugin = plugin;}

    public static Inventory MusicPlayer() {
        Inventory inv = Bukkit.createInventory(null, 18, "Муз.Плеер");
        inv.setContents(MusicApp());
        return inv;
    }
    public static ItemStack[] MusicApp() {
        List<ItemStack> music = new ArrayList<>();
        ItemStack baza = new ItemStack(Material.MUSIC_DISC_BLOCKS);
        ItemMeta bazai = baza.getItemMeta();
        bazai.setDisplayName("§r§aМанера");
        baza.setItemMeta(bazai);
        music.add(baza);
        return music.toArray(new ItemStack[0]);
    }

}
