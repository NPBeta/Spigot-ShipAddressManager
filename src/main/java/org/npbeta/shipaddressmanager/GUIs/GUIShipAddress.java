package org.npbeta.shipaddressmanager.GUIs;

import org.bukkit.Bukkit;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class GUIShipAddress {
    Inventory inv = Bukkit.createInventory(Bukkit.getPlayer("WonderBeta"), InventoryType.HOPPER, "收货地址填写");
}
