package com.furs.fphone;

import com.furs.fphone.Utils.Manager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class gPhone implements CommandExecutor {
    private final fphone plugin;

    public gPhone(fphone plugin){this.plugin = plugin;}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Manager manager = new Manager(this.plugin);
        if (sender instanceof Player){
            Inventory p = ((Player) sender).getInventory();
            Player p2 = ((Player) sender).getPlayer();
            p.addItem(manager.phone());
            return true;
    }
        return false;
    }
}
