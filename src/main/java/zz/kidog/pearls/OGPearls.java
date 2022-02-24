package zz.kidog.pearls;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import zz.kidog.pearls.commands.PearlCommand;
import zz.kidog.pearls.listener.EnderpearlListener;

public class OGPearls extends JavaPlugin {

    @Getter
    private static OGPearls instance;

    public void onEnable() {
        instance = this;
        System.out.println(ChatColor.GREEN + "[OGPearls] OGPearls has been enabled");
        System.out.println(ChatColor.GREEN + "[OGPearls] Plugin by KidOGzz#0001");
        System.out.println(ChatColor.AQUA + "[OGPearls] github.com/KidOGzz");
        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new EnderpearlListener(), this);

        this.getCommand("pearl").setExecutor(new PearlCommand());
    }

    public void onDisable() {
        this.saveConfig();
        System.out.println(ChatColor.RED + "[OGPearls] OGPearls has been disabled");
        System.out.println(ChatColor.RED + "[OGPearls] Plugin by KidOGzz#0001");
        System.out.println(ChatColor.AQUA + "[OGPearls] github.com/KidOGzz");

    }

}