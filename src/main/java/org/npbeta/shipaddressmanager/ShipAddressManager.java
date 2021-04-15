package org.npbeta.shipaddressmanager;

import org.bukkit.plugin.java.JavaPlugin;
import org.npbeta.shipaddressmanager.Listeners.ChatListener;
import org.npbeta.shipaddressmanager.Listeners.InventoryClickListener;

import java.util.Objects;

public final class ShipAddressManager extends JavaPlugin {

    private String address;
    private int port;
    private String database;
    private String username;
    private String password;

    @Override
    public void onEnable() {
        this.getLogger().info("Welcome to ShipAddressManager!");// Plugin startup logic

        getLogger().info("Registering Listener...");
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        getServer().getPluginManager().registerEvents(new InventoryClickListener(), this);
        getLogger().info("Registering Commands...");
        Objects.requireNonNull(getCommand("sam")).setExecutor(new CommandHandler());
        getLogger().info("Reading Config...");
        loadConfig();
        getLogger().info("Initialize Complete.");
        getLogger().info("Read from config.yml:" + address + port + database + username + password);
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Thanks For Using ShipAddressManager!");// Plugin shutdown logic
    }

    void loadConfig() {
        this.saveDefaultConfig();
        this.address = this.getConfig().getString("mysql.address");
        this.port = this.getConfig().getInt("mysql.port");
        this.database = this.getConfig().getString("mysql.database");
        this.username = this.getConfig().getString("mysql.username");
        this.password = this.getConfig().getString("mysql.password");
    }
}
