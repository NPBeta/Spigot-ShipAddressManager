package org.npbeta.shipaddressmanager.Commands;

import io.izzel.taboolib.module.command.base.BaseCommand;
import io.izzel.taboolib.module.command.base.BaseMainCommand;
import io.izzel.taboolib.module.command.base.BaseSubCommand;
import io.izzel.taboolib.module.command.base.SubCommand;
import org.npbeta.shipaddressmanager.Commands.SubCommands.CommandAdd;
import org.npbeta.shipaddressmanager.Commands.SubCommands.CommandReload;

@BaseCommand(name = "ShipAddressManager", aliases = "sam", permission = "sam.use")
public class CommandHandler extends BaseMainCommand {

    @SubCommand(permission = "sam.admin", description = "Reload Config & Language File")
    BaseSubCommand reload = new CommandReload();

    @SubCommand(permission = "sam.admin", description = "Added a Physical gift for a player", arguments = {"Player","Name","Tel", "Address", "ItemType"})
    BaseSubCommand add = new CommandAdd();

    @SubCommand(permission = "sam.admin", description = "Delete a unshipped Physical gift for a player", arguments = {"Player", "ItemType"})
    BaseSubCommand delete = new CommandAdd();

    @SubCommand(permission = "sam.admin", description = "Edit address or itemType for a player", arguments = {"Player", "EditType"})
    BaseSubCommand edit = new CommandAdd();
}
