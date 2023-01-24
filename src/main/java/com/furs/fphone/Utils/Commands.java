package com.furs.fphone.Utils;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Commands implements CommandExecutor {
    private final Manager manager;

    public Commands(Manager manager) {
        this.manager = manager;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Inventory p = ((Player) sender).getInventory();
            p.addItem(manager.phone());
            return true;
        }

        return false;
    }

}

