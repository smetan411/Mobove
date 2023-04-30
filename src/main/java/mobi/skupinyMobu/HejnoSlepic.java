package mobi.skupinyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;

public class HejnoSlepic extends PlayerCommandExecutor {

    private Location mistoMobu(Location playerLocation){
        Location mistoVProstoru = new Location(playerLocation.getWorld(),
                (playerLocation.getX() - 5 + Math.random() * 10),
                (playerLocation.getY()),
                (playerLocation.getZ() - 5 + Math.random() * 10));
        return mistoVProstoru;
    }
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {

        for (int pocet = 0; pocet < 20; pocet++) {
            Chicken slepice = world.spawn(mistoMobu(playerLocation), Chicken.class);
            slepice.setCustomName("slepicka");
            slepice.setCustomNameVisible(true);

            Chicken kure = world.spawn(mistoMobu(playerLocation), Chicken.class);
            kure.setBaby();
            kure.setCustomName("kuratko");
            kure.setCustomNameVisible(true);
        }
        return true;
    }
}

