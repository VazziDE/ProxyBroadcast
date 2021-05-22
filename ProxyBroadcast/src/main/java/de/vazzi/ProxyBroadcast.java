package de.vazzi;

import dev.waterdog.waterdogpe.plugin.Plugin;
import dev.waterdog.waterdogpe.utils.Configuration;

public class ProxyBroadcast extends Plugin {

    public static Configuration cfg;

    @Override
    public void onEnable() {
        loadConfig();
        cfg = getConfig();
        getProxy().getCommandMap().registerCommand(new BroadcastCommand());
    }

}
