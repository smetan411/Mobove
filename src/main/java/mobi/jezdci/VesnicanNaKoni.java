package mobi.jezdci;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;

public class VesnicanNaKoni extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Horse kunVozidlo = world.spawn(playerLocation, Horse.class);
        Villager vesnicanJezdec = world.spawn(playerLocation, Villager.class);
        vesnicanJezdec.setBaby();
        kunVozidlo.addPassenger(vesnicanJezdec);
        return true;
    }
}
