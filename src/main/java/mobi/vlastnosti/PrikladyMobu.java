package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;


public class PrikladyMobu extends PlayerCommandExecutor {
    // nastaveni plochy na ktere se spawnuji mobi x, z -10/+10 bloku
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {

        Location mistoMobu = new Location(world, (playerLocation.getX() - 10 + Math.random() * 20), (playerLocation.getY()),
                (playerLocation.getZ() - 10 + Math.random() * 20));
        Rabbit kralik = world.spawn(mistoMobu, Rabbit.class);
        Spider pavouk = world.spawn(mistoMobu, Spider.class);
        Zombie zombie = world.spawn(mistoMobu, Zombie.class);
        Chicken slepice = world.spawn(mistoMobu, Chicken.class);
        Pig prase = world.spawn(mistoMobu, Pig.class);
        Cat kocka = world.spawn(mistoMobu, Cat.class);
        Cow krava = world.spawn(mistoMobu, Cow.class);
        Wolf vlk = world.spawn(mistoMobu, Wolf.class);
        Snowman snehulak = world.spawn(mistoMobu, Snowman.class);
        Skeleton kostra = world.spawn(mistoMobu, Skeleton.class);
        PolarBear ledniMedved = world.spawn(mistoMobu, PolarBear.class);
        Villager vesnican = world.spawn(mistoMobu, Villager.class);
        Panda panda = world.spawn(mistoMobu, Panda.class);
        Bat netopyr = world.spawn(mistoMobu, Bat.class);
        Creeper kriper = world.spawn(mistoMobu, Creeper.class);
        Donkey osel = world.spawn(mistoMobu, Donkey.class);
        Enderman enderman = world.spawn(mistoMobu, Enderman.class);
        Horse kun = world.spawn(mistoMobu, Horse.class);
        Witch carodejnice = world.spawn(mistoMobu, Witch.class);
        Fox liska = world.spawn(mistoMobu, Fox.class);
        Bee vcela = world.spawn(mistoMobu, Bee.class);
        Ocelot ocelot = world.spawn(mistoMobu, Ocelot.class);
        Phantom fantom = world.spawn(mistoMobu, Phantom.class);
        Mule mezek = world.spawn(mistoMobu, Mule.class);
        return true;
    }
}
