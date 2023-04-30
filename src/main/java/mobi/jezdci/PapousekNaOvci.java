package mobi.jezdci;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.NPC;
import org.bukkit.entity.Parrot;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

public class PapousekNaOvci extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Sheep ovce = world.spawn(playerLocation, Sheep.class);
        Parrot papousek = world.spawn(playerLocation, Parrot.class);
        ovce.addPassenger(papousek);
        return true;
    }
}
