package de.vazzi;

import dev.waterdog.waterdogpe.plugin.Plugin;

public class ProxyBroadcast extends Plugin {

    @Override
    public void onEnable() {
        getProxy().getCommandMap().registerCommand(new BroadcastCommand());
    }

}
