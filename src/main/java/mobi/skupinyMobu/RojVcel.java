package mobi.skupinyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Player;

public class RojVcel extends PlayerCommandExecutor {
    private Location mistoMobu(Location playerLocation) {
        Location mistoVProstoru = new Location(playerLocation.getWorld(),
                (playerLocation.getX() - 5 + Math.random() * 10),
                ((playerLocation.getY()) + Math.random() * 5),
                (playerLocation.getZ() - 5 + Math.random() * 10));
        return mistoVProstoru;
    }

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        for (int pocet = 0; pocet < 25; pocet++) {
            Bee vcela = world.spawn(mistoMobu(playerLocation), Bee.class);
            vcela.setAnger(2);
        }
        return true;
    }
}
