package me.ImIpscanning.totemkill;

import org.bukkit.Bukkit;
import org.bukkit.EntityEffect;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TotemKill extends JavaPlugin implements Listener {

    private FileConfiguration config;

    @Override
    public void onEnable() {
        saveDefaultConfig(); 
        config = getConfig();

        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("TotemKill activado");
    }

    @EventHandler
    public void onKill(PlayerDeathEvent e) {
        Player muerto = e.getEntity();
        Player killer = muerto.getKiller();

        if (killer == null) return;

    
        if (config.getBoolean("totem-animation", true)) {
            killer.playEffect(EntityEffect.TOTEM_RESURRECT);
        }

 
        if (config.getBoolean("sound.enabled", true)) {
            String soundName = config.getString("sound.type", "ITEM_TOTEM_USE");
            float volume = (float) config.getDouble("sound.volume", 1.0);
            float pitch = (float) config.getDouble("sound.pitch", 1.0);

            try {
                Sound sound = Sound.valueOf(soundName);
                killer.playSound(killer.getLocation(), sound, volume, pitch);
            } catch (IllegalArgumentException ex) {
                getLogger().warning("Sonido inválido en config.yml: " + soundName);
            }
        }


        if (config.getBoolean("message.enabled", false)) {
            String msg = config.getString("message.text", "&aHas matado a %player%");
            msg = msg.replace("%player%", muerto.getName());
            killer.sendMessage(msg.replace("&", "§"));
        }
    }
}
