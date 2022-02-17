package mobi.prikladyMobu;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;

public class PrikladyMobu extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Rabbit kralik = world.spawn(playerLocation, Rabbit.class);
        Spider pavouk = world.spawn(playerLocation, Spider.class);
        Zombie zombie = world.spawn(playerLocation, Zombie.class);
        Chicken slepice = world.spawn(playerLocation, Chicken.class);
        Pig prase = world.spawn(playerLocation, Pig.class);
        Cat kocka = world.spawn(playerLocation, Cat.class);
        Cow krava = world.spawn(playerLocation, Cow.class);
        Wolf vlk = world.spawn(playerLocation, Wolf.class);
        Snowman snehulak = world.spawn(playerLocation, Snowman.class);
        Skeleton kostra = world.spawn(playerLocation, Skeleton.class);
        PolarBear ledniMedved = world.spawn(playerLocation, PolarBear.class);
        Villager vesnican = world.spawn(playerLocation, Villager.class);
        Panda panda = world.spawn(playerLocation, Panda.class);
        Bat netopyr = world.spawn(playerLocation, Bat.class);
        Creeper kriper = world.spawn(playerLocation, Creeper.class);
        Donkey osel = world.spawn(playerLocation, Donkey.class);
        Enderman enderman = world.spawn(playerLocation, Enderman.class);
        Horse kun = world.spawn(playerLocation, Horse.class);
        Witch carodejnice = world.spawn(playerLocation, Witch.class);
        Fox liska = world.spawn(playerLocation, Fox.class);
        Bee vcela = world.spawn(playerLocation, Bee.class);
        Ocelot ocelot = world.spawn(playerLocation, Ocelot.class);
        Phantom fantom = world.spawn(playerLocation, Phantom.class);
        Mule mezek = world.spawn(playerLocation, Mule.class);
        return true;
    }
}
