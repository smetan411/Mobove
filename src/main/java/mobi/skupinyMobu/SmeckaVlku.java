package mobi.skupinyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wolf;

public class SmeckaVlku extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        for (int pocet = 0; pocet < 8; pocet++) {
            Wolf wolf = world.spawn(playerLocation, Wolf.class);
            wolf.setTamed(true);
            wolf.setOwner(player);
        }
        return true;
    }
}
