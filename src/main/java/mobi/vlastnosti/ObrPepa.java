package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ObrPepa extends PlayerCommandExecutor {
    // zadávání PotionEffect
   @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Location mistoMoba = playerLocation.add(2,0,2);
        Giant obr = world.spawn(mistoMoba, Giant.class);
        obr.setCustomName("ObrPepa");
        obr.setCustomNameVisible(true);
        obr.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 500, 10, true));
        obr.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, 500,10, true));
        return true;
    }
}