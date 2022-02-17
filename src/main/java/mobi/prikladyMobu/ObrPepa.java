package mobi.prikladyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Player;

public class ObrPepa extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Location mistoMoba = playerLocation.add(2, 0, 2);
        Giant obr = world.spawn(mistoMoba, Giant.class);
        obr.setCustomName("ObrPepa");
        obr.setCustomNameVisible(true);
        return true;
    }
}