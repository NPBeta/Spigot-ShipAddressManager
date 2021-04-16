package org.npbeta.shipaddressmanager.Configs;

import io.izzel.taboolib.module.config.TConfig;
import io.izzel.taboolib.module.inject.TInject;
import io.izzel.taboolib.module.locale.TLocale;

public class Config {

    @TInject(value = "config.yml", locale = "LANG")
    private static TConfig config;

    public static TConfig getConfig() {
        return config;
    }

    public static void reloadFile() {
        config.runListener();
        TLocale.reload();
    }
}
