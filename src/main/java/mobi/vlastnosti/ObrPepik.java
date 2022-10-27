package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Giant;
import org.bukkit.entity.Player;

public class ObrPepik extends PlayerCommandExecutor {
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Location mistoPepika = playerLocation.add(5,0,5);
        if(!Material.AIR.equals(player.getTargetBlock(null,200))) {
            mistoPepika = player.getTargetBlock(null, 200).getLocation();
        }
        Giant obrPepik = world.spawn(mistoPepika, Giant.class);
        return true;
    }
}
