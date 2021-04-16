package org.npbeta.shipaddressmanager;

import io.izzel.taboolib.loader.Plugin;
import io.izzel.taboolib.module.locale.TLocale;
import org.bukkit.Bukkit;
import org.npbeta.shipaddressmanager.Commands.CommandHandler;
import org.npbeta.shipaddressmanager.Configs.Config;
import org.npbeta.shipaddressmanager.Listeners.ChatListener;
import org.npbeta.shipaddressmanager.Listeners.InventoryClickListener;

import java.util.Objects;

public final class ShipAddressManager extends Plugin {

    @Override
    public void onEnable() {
        TLocale.sendToConsole("Plugin.Loading");
        getPlugin().getServer().getPluginManager().registerEvents(new ChatListener(), getPlugin());
        getPlugin().getServer().getPluginManager().registerEvents(new InventoryClickListener(), getPlugin());
        Objects.requireNonNull(getPlugin().getCommand("sam")).setExecutor(new CommandHandler());
        TLocale.sendToConsole("Plugin.Loaded");
    }

    @Override
    public void onDisable() {
        TLocale.sendToConsole("Plugin.Unload");
    }
}
