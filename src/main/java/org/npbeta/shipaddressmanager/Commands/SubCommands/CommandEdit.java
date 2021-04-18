package org.npbeta.shipaddressmanager.Commands.SubCommands;

import io.izzel.taboolib.module.command.base.BaseSubCommand;
import io.izzel.taboolib.module.locale.TLocale;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class CommandEdit extends BaseSubCommand {

    @Override
    public void onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args[0].equals("address")) {

        } else if (args[0].equals("itemType")) {

        } else {
            TLocale.sendTo(sender, "Plugin.InvalidCmd");
        }

    }
}
