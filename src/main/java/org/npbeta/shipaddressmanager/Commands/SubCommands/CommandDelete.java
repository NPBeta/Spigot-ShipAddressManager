package org.npbeta.shipaddressmanager.Commands.SubCommands;

import io.izzel.taboolib.module.command.base.BaseSubCommand;
import io.izzel.taboolib.module.locale.TLocale;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandDelete extends BaseSubCommand {

    @Override
    public void onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = Bukkit.getPlayer(args[0]);
        if (p != null) {
            String username = p.getName();
            String uuid = p.getUniqueId().toString();
            int itemType = Integer.parseInt(args[4]);
        } else {
            TLocale.sendTo(sender, "Player.Offline");
        }
    }
}
