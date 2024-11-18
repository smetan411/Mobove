package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Cat;
import org.bukkit.entity.Player;

public class Kocka extends PlayerCommandExecutor {

    //umisteni moba / clone().add()

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Location mistoKocky = player.getLocation().clone().add(2,0,2);
        Cat kocka = world.spawn(mistoKocky, Cat.class);
        kocka.setCustomName("Kocicka");
        kocka.setCustomNameVisible(true);
        kocka.setCollarColor(DyeColor.RED);
        kocka.setCatType(Cat.Type.PERSIAN);
        kocka.setTamed(true);
        kocka.setBaby();
        kocka.setSitting(true);
        kocka.setOwner(player);
        return true;
    }
}