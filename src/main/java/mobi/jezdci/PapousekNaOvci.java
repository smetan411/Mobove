package mobi.jezdci;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Parrot;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

public class PapousekNaOvci extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Sheep ovceVozidlo = world.spawn(playerLocation, Sheep.class);
        Parrot papousekJezdec = world.spawn(playerLocation, Parrot.class);
        ovceVozidlo.addPassenger(papousekJezdec);
        return true;
    }
}
