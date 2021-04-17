package org.npbeta.shipaddressmanager.Commands.SubCommands;

import io.izzel.taboolib.module.command.base.BaseSubCommand;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandAdd extends BaseSubCommand {
    @Override
    public void onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        p.getUniqueId();
    }
}

