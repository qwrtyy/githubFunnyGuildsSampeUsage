/*
 * githubFunnyGuildsSampeUsage
 * Copyright (C) 2022 qwrtyy
 */

package cc.qwrtyy.github.funnyguilds.sample.usage;

import cc.qwrtyy.github.funnyguilds.sample.usage.commands.SampleCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private final long load = System.currentTimeMillis() - System.currentTimeMillis(); //async

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("");
        Bukkit.getLogger().info("### Trwa wczytywanie pluginu na user'a ###");
        getCommand("samplecommand").setExecutor(new SampleCommand());
        Bukkit.getLogger().info("     Komendy zaladowano w czasie: " + load + "ms.");
        Bukkit.getLogger().info("");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
