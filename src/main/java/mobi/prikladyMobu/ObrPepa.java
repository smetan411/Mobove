package mobi.prikladyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class ObrPepa extends PlayerCommandExecutor {

    PrikladyMobuFactory prikladyMobuFactory = new PrikladyMobuFactory();

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        prikladyMobuFactory.vytvorObra(world, player);
        return true;
    }
}