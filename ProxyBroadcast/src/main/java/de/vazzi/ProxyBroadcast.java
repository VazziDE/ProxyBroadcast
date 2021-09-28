package de.vazzi;

import dev.waterdog.waterdogpe.plugin.Plugin;
import dev.waterdog.waterdogpe.utils.config.Configuration;

public class ProxyBroadcast extends Plugin {

    public static Configuration cfg;

    @Override
    public void onEnable() {
        cfg = getConfig();
        getProxy().getCommandMap().registerCommand(new BroadcastCommand());
    }

}