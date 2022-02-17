package mobi.skupinyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

public class HejnoSlepic extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        for (int pocet = 0; pocet < 20; pocet++) {
            Location mistoSlepice = new Location(world, (playerLocation.getX() - 10 + Math.random() * 20), (playerLocation.getY()),
                    (playerLocation.getZ() - 10 + Math.random() * 20));
            Chicken slepice = (Chicken) world.spawnEntity(mistoSlepice, EntityType.CHICKEN);
            slepice.setCustomName("slepicka");
            slepice.setCustomNameVisible(true);

            Chicken kure = world.spawn(mistoSlepice, Chicken.class);
            kure.setBaby();
            kure.setCustomName("kuratko");
            kure.setCustomNameVisible(true);
        }
        return true;
    }
}
