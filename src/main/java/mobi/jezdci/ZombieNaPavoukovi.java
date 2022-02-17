package mobi.jezdci;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;

public class ZombieNaPavoukovi extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Spider pavoukVozidlo = world.spawn(playerLocation, Spider.class);
        Zombie zombieJezdec = world.spawn(playerLocation, Zombie.class);
        zombieJezdec.setBaby();
        pavoukVozidlo.addPassenger(zombieJezdec);
        return true;
    }
}
