package org.npbeta.shipaddressmanager;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHandler implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            sender.sendMessage("[SAM] Only Player can use this command.");
            return true;
        } else {
            Player p=(Player)sender;
            switch (args.length) {
                case 1:
                    break;
                case 2:
                    break;
                default: p.sendMessage(ChatColor.GREEN + "[SAM] Thanks for using ShipAddressManager.");

            }
            if(p.hasPermission("sam.use")) {
                p.sendMessage(ChatColor.GREEN + "[SAM] Permission check passed.");
            } else {
                p.sendMessage(ChatColor.RED + "[SAM] Permission check failed.");
            }
        }
        return false;
    }
}
