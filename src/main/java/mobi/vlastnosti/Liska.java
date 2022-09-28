package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Fox;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Liska extends PlayerCommandExecutor {
    // můžeme si zadat jméno lišky nebo použít nastavené
    // lišku umístíme o dva bloky od hráče

    @Override
   public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Location mistoMoba = playerLocation.add(2, 0, 2);
        Fox liska = world.spawn(mistoMoba, Fox.class);
        liska.setFoxType(Fox.Type.RED);
        if (args.length > 0)
            liska.setCustomName(args[0]);
        else
            liska.setCustomName("Bystrouska");
        liska.setCustomNameVisible(true);
        liska.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999999, 3));
        return true;
    }
}
