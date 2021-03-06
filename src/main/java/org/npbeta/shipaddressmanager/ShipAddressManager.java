package org.npbeta.shipaddressmanager;

import io.izzel.taboolib.loader.Plugin;
import io.izzel.taboolib.module.locale.TLocale;
import org.npbeta.shipaddressmanager.Listeners.InventoryClickListener;

public final class ShipAddressManager extends Plugin {

    @Override
    public void onEnable() {
        TLocale.sendToConsole("Plugin.Loading");
//        getPlugin().getServer().getPluginManager().registerEvents(new InventoryClickListener(), getPlugin());
        TLocale.sendToConsole("Plugin.Loaded");
    }

    @Override
    public void onDisable() {
        TLocale.sendToConsole("Plugin.Unload");
    }
}
