package mobi.skupinyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Player;

public class RojVcel extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        for (int pocet = 0; pocet < 25; pocet++) {
            Location mistoVcel
                    = new Location(world,
                    (playerLocation.getX() - 10 + Math.random() * 20),
                    (playerLocation.getY() + Math.random() * 5),
                    (playerLocation.getZ() - 10 + Math.random() * 20));
            Bee vcela = world.spawn(mistoVcel, Bee.class);
            vcela.setAnger(2);
        }
        return true;
    }
}
