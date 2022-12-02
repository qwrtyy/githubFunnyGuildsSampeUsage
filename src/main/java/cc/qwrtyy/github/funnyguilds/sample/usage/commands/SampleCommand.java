/*
 * githubFunnyGuildsSampeUsage
 * Copyright (C) 2022 qwrtyy
 */

package cc.qwrtyy.github.funnyguilds.sample.usage.commands;

import net.dzikoysk.funnyguilds.FunnyGuilds;
import net.dzikoysk.funnyguilds.user.User;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class SampleCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player)sender;
        final User user = FunnyGuilds.getInstance().getUserManager().findByPlayer(player).get(); //getuje usera z funnyguilds za pomoca 'player' mozna zminic te motde
        if(user.hasGuild()){ //Przyjkadowo sprawdza czy gracz ma gildie
            sendMessage(player, FunnyGuilds.getInstance().getMessageConfiguration().generalHasNoGuild); //Jesli nie ma otrzyma taka wiadmosc (wiadomosc pochodzi z konfiguracji funnyguilds)
            return false;
        } //Jesli ma otrzyma taka wiadmosc
        sendMessage(player, "&a[!] &7Posiadasz &2gildie");
        return false;
    }
    private boolean sendMessage(final @NotNull CommandSender player, final String message) {
        player.sendMessage(fixColor(message));
        return true;
    }
    public static @NotNull String fixColor(final String s) {
        return ChatColor.translateAlternateColorCodes('&', s)
                .replace(">>", "»")
                .replace("<<", "«");
    }
}
