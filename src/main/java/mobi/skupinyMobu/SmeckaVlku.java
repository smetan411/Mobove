package mobi.skupinyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Wolf;

public class SmeckaVlku extends PlayerCommandExecutor {

    private Location mistoMobu(Location playerLocation){
        Location mistoVProstoru = new Location(playerLocation.getWorld(),
                (playerLocation.getX() - 5 + Math.random() * 10),
                (playerLocation.getY()),
                (playerLocation.getZ() - 5 + Math.random() * 10));
        return mistoVProstoru;
    }
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        for (int pocet = 0; pocet < 8; pocet++) {
            Wolf vlk = world.spawn(mistoMobu(playerLocation), Wolf.class);
            vlk.setTamed(true);
            vlk.setOwner(player);

            //jiny zpusob spawnovani
            Wolf vlce = (Wolf)world.spawnEntity(mistoMobu(playerLocation), EntityType.WOLF);
            vlce.setBaby();
            vlce.setCollarColor(DyeColor.ORANGE);

        }
        return true;
    }
}
