package de.vazzi;

import dev.waterdog.waterdogpe.ProxyServer;
import dev.waterdog.waterdogpe.command.Command;
import dev.waterdog.waterdogpe.command.CommandSender;
import dev.waterdog.waterdogpe.command.CommandSettings;
import dev.waterdog.waterdogpe.player.ProxiedPlayer;


public class BroadcastCommand extends Command {

    public BroadcastCommand() {
        super("broadcast", CommandSettings.builder()
                .setDescription(ProxyBroadcast.cfg.getString("cmd-description"))
                .setPermission(ProxyBroadcast.cfg.getString("cmd-permission"))
                .setUsageMessage(ProxyBroadcast.cfg.getString("cmd-usage"))
                .build());
    }

    @Override
    public boolean onExecute(CommandSender commandSender, String s, String[] strings) {

        if(!commandSender.hasPermission(getPermission())){
            return true;
        }
        if(strings.length < 1){
            return false;
        }
        String prefix = ProxyBroadcast.cfg.getString("prefix");
        for (ProxiedPlayer player: ProxyServer.getInstance().getPlayers().values()) {
            player.sendMessage(prefix + String.join(" ", strings));
        }
        commandSender.sendMessage( prefix + ProxyBroadcast.cfg.getString("send-succes"));
        return true;
    }
}
