package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Player;

public class PandaMazel extends PlayerCommandExecutor {
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Location mistoPandy = playerLocation.add(2,0,2);
        Panda panda = world.spawn(mistoPandy, Panda.class);
        panda.setMainGene(Panda.Gene.BROWN);
        panda.setMainGene(Panda.Gene.PLAYFUL);
        panda.setBaby();
        panda.setCustomName("pandik");
        panda.setCustomNameVisible(true);
        return true;
    }
}
