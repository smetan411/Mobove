package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;

public class Vesnican extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Location mistoMoba = playerLocation.add(2, 0, 2);
        Villager vesnican = world.spawn(mistoMoba, Villager.class);
        vesnican.setVillagerType(Villager.Type.SAVANNA);
        vesnican.setProfession(Villager.Profession.WEAPONSMITH);
        vesnican.setVillagerLevel(2);
        vesnican.setVillagerExperience(2);
        return true;
    }
}
