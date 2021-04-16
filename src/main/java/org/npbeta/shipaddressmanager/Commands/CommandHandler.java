package org.npbeta.shipaddressmanager.Commands;

import io.izzel.taboolib.module.locale.TLocale;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.npbeta.shipaddressmanager.Configs.Config;

public class CommandHandler implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            TLocale.sendTo(sender, "Plugin.nonPlayer");
            return true;
        } else {
            Player p=(Player)sender;
            switch (args.length) {
                case 1:
                    if(p.hasPermission("sam.use")) {
                        switch (args[0]) {
                            case "reload":
                                Config.reloadFile();
                                TLocale.sendTo(sender, "Plugin.Reloaded");
                                return true;
                            case "mysql":
                                String username = Config.getConfig().getString("mysql.username");
                                String password = Config.getConfig().getString("mysql.password");
                                String address = Config.getConfig().getString("mysql.address");
                                TLocale.sendTo(sender, username, password, address);
                                return true;
                        }
                    } else {
                        TLocale.sendTo(sender, "Plugin.noPermission");
                    }
                case 2:
                    break;
            }
            TLocale.sendTo(sender, "Plugin.unknownCommand");
            return false;
        }
    }
}
