package mobi.skupinyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Sheep;

public class StadoOvci extends PlayerCommandExecutor {

    private Location mistoMobu(Location playerLocation){
        Location mistoVProstoru = new Location(playerLocation.getWorld(),
                (playerLocation.getX() - 5 + Math.random() * 10),
                (playerLocation.getY()),
                (playerLocation.getZ() - 5 + Math.random() * 10));
        return mistoVProstoru;
    }
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        for (int pocet = 0; pocet < 10; pocet++) {

            Sheep ovce = world.spawn(mistoMobu(playerLocation), Sheep.class);
            Sheep jehnatko = (Sheep) world.spawnEntity(mistoMobu(playerLocation), EntityType.SHEEP);

            ovce.setColor(DyeColor.YELLOW);
            ovce.setCustomName("ovce Bara");
            ovce.setCustomNameVisible(true);
            jehnatko.setBaby();
            jehnatko.setColor(DyeColor.PINK);
            jehnatko.setCustomName("mala Ovecka");
            jehnatko.setCustomNameVisible(true);
        }
        for (int i = 0; i < 5; i++) {

            Sheep beran = world.spawn(mistoMobu(playerLocation), Sheep.class);
            beran.setColor(DyeColor.BLUE);
            beran.setCustomName("beran");
            beran.setCustomNameVisible(true);
        }
        return true;
    }
}
