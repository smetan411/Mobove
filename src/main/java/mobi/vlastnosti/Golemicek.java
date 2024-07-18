package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.DyeColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Golem;
import org.bukkit.entity.Player;

public class Golemicek extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Location mistoGolema = player.getLocation().add(2, 0, 2);
        Golem golem = (Golem) world.spawnEntity(mistoGolema, EntityType.IRON_GOLEM);
        golem.setHealth(1);
        return true;
    }
}
