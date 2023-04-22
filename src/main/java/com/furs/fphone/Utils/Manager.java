package com.furs.fphone.Utils;

import com.furs.fphone.fphone;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.Arrays;

public class Manager{
    private final fphone fPhone;
    public Manager(fphone fPhone){this.fPhone = fPhone;}
    private static final NamespacedKey phonen = new NamespacedKey(fphone.getPlugin(), "Phone");
    private static final NamespacedKey block = new NamespacedKey(fphone.getPlugin(), "blockitem");




    public static ItemStack phone() {
        ItemStack phone = new ItemStack(Material.IRON_INGOT);
        ItemMeta meta = phone.getItemMeta();
        meta.getPersistentDataContainer().set(phonen, PersistentDataType.STRING, "Кек");
        meta.setDisplayName("§r§6fPhone");
        meta.setCustomModelData(1);
        phone.setItemMeta(meta);
        return phone;
    }
    public Inventory phoneInter(){
        Inventory inv = Bukkit.createInventory(null , 54, " ");
        for(int i = 0; i < 54; i++) {
            inv.setItem(i, BlockItem());
        }
        inv.setItem(47, createItem(Material.FLOWER_BANNER_PATTERN, "§r§6Сообщения", fPhone.getStr("Strings.messages")));
        inv.setItem(49, createItem(Material.BARRIER, "§r§cЗакрыть", fPhone.getStr("Strings.quit")));
        inv.setItem(51, createItem(Material.REDSTONE, "§r§6Настройки", "Тест"));
        inv.setItem(46, createItem(Material.MUSIC_DISC_CAT, "§r§aМузыкальный плеер", "§r§6Любимые треки в одном приложении!:)"));

        return inv;
    }
    public ItemStack createItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material);
        final ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));
        item.setItemMeta(meta);
        return item;
    }
    public static ItemStack BlockItem() {
        ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setDisplayName("Заблокировано");
        itemMeta.getPersistentDataContainer().set(block, PersistentDataType.STRING, "Кек");
        item.setItemMeta(itemMeta);
        return item;

    }
    public static ItemStack playerSkull(Player players) {
        ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1);
        SkullMeta meta = (SkullMeta)item.getItemMeta();
        meta.setDisplayName(players.getDisplayName());
        meta.setOwningPlayer(players);
        item.setItemMeta(meta);
        return item;
    }
}
