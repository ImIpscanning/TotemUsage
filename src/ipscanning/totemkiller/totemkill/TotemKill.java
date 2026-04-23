package me.ImIpscanning.totemkill;

import org.bukkit.Bukkit;
import org.bukkit.EntityEffect;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class TotemKill extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("TotemKill activado");
    }

    @EventHandler
    public void onKill(PlayerDeathEvent e) {
        Player muerto = e.getEntity();
        Player killer = muerto.getKiller();

        if (killer == null) return;

        // 🔥 Animación REAL de tótem
        killer.playEffect(EntityEffect.TOTEM_RESURRECT);

        // 🔊 Sonido del tótem
        killer.playSound(killer.getLocation(), Sound.ITEM_TOTEM_USE, 1f, 1f);
    }
}
