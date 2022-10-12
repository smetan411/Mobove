package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Player;

public class EnderDrak extends PlayerCommandExecutor {

    // EnderDraka teleportujeme nekam nahoru
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        EnderDragon drak = world.spawn(playerLocation, EnderDragon.class);
        drak.teleport(playerLocation.clone().add(0,10,0));
        return true;
    }


}
