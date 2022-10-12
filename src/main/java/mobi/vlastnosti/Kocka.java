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
        Location mistoKocky = player.getLocation().add(2, 0, 2);
        Cat micinka = world.spawn(mistoKocky, Cat.class);
        micinka.setCollarColor(DyeColor.RED);
        micinka.setCatType(Cat.Type.PERSIAN);
        micinka.setTamed(true);
        micinka.setBaby();
        micinka.setSitting(true);
        micinka.setOwner(player);
        return true;
    }
}
