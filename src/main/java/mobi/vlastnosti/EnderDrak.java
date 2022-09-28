package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Player;
import org.bukkit.metadata.MetadataValue;

public class EnderDrak extends PlayerCommandExecutor {


    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        EnderDragon drak = world.spawn(playerLocation, EnderDragon.class);
        return true;
    }


}
