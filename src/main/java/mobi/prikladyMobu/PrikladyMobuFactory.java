package mobi.prikladyMobu;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Player;

public class PrikladyMobuFactory {

    public void vytvorObra(World world, Player player) {
        Location mistoMoba = player.getLocation().add(2, 0, 2);
        Giant obr = world.spawn(mistoMoba, Giant.class);
        obr.setCustomName("ObrPepa");
        obr.setCustomNameVisible(true);
    }
}
