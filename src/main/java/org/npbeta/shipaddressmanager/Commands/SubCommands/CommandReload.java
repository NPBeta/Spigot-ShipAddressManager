package org.npbeta.shipaddressmanager.Commands.SubCommands;

import io.izzel.taboolib.module.command.base.BaseSubCommand;
import io.izzel.taboolib.module.locale.TLocale;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.npbeta.shipaddressmanager.Configs.Config;

public class CommandReload extends BaseSubCommand {

    @Override
    public void onCommand(CommandSender sender, Command command, String label, String[] args) {
        Config.reloadFile();
        TLocale.sendTo(sender, "Plugin.Reloaded");
    }
}