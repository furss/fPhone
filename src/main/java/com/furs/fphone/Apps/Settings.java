package com.furs.fphone.Apps;

import com.furs.fphone.fphone;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Settings {
    private final fphone plugin;
    public Settings(fphone plugin){this.plugin = plugin;}

    public Inventory Settings() {
        Inventory inv = Bukkit.createInventory((InventoryHolder) null, 9, " ");
        inv.setContents(SettingApp());
        return inv;
    }


    public ItemStack[] SettingApp(){
        List<ItemStack> items = new ArrayList<>();
        ItemStack BackGround = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);{
        ItemMeta BGmeta = BackGround.getItemMeta();
        BGmeta.setDisplayName("§r§7Цвет заднего фона");
        BackGround.setItemMeta(BGmeta);}
        ItemStack AirPlane = new ItemStack(Material.BARRIER);{
        ItemMeta airmeta = AirPlane.getItemMeta();
        airmeta.setDisplayName("§r§сРежим полёта");
        AirPlane.setItemMeta(airmeta);}
        ItemStack info = new ItemStack(Material.APPLE);{
        ItemMeta imeta = info.getItemMeta();
        imeta.setDisplayName("§r§eИнформация");
        List<String> lore = new ArrayList<>();
        lore.add("Автор: furs");
        lore.add("Связь: furs#0312");
        lore.add("Версия: alpha 0.1");
        imeta.setLore(lore);
        info.setItemMeta(imeta);}
        items.add(BackGround);
        items.add(AirPlane);
        items.add(info);
        return items.toArray(new ItemStack[0]);
    }

}