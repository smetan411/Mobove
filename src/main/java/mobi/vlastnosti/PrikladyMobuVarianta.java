package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;


public class PrikladyMobuVarianta extends PlayerCommandExecutor {
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {

        Rabbit kralik = world.spawn(new RandomLocation(playerLocation), Rabbit.class);
        Spider pavouk = world.spawn(new RandomLocation(playerLocation), Spider.class);
        Zombie zombie = world.spawn(new RandomLocation(playerLocation), Zombie.class);
        Chicken slepice = world.spawn(new RandomLocation(playerLocation), Chicken.class);
        Pig prase = world.spawn(new RandomLocation(playerLocation), Pig.class);
        Cat kocka = world.spawn(new RandomLocation(playerLocation), Cat.class);
        Cow krava = world.spawn(new RandomLocation(playerLocation), Cow.class);
        Wolf vlk = world.spawn(new RandomLocation(playerLocation), Wolf.class);
        Snowman snehulak = world.spawn(new RandomLocation(playerLocation), Snowman.class);
        Skeleton kostra = world.spawn(new RandomLocation(playerLocation), Skeleton.class);
        PolarBear ledniMedved = world.spawn(new RandomLocation(playerLocation), PolarBear.class);
        Villager vesnican = world.spawn(new RandomLocation(playerLocation), Villager.class);
        Panda panda = world.spawn(new RandomLocation(playerLocation), Panda.class);
        Bat netopyr = world.spawn(new RandomLocation(playerLocation), Bat.class);
        Creeper kriper = world.spawn(new RandomLocation(playerLocation), Creeper.class);
        Donkey osel = world.spawn(new RandomLocation(playerLocation), Donkey.class);
        Enderman enderman = world.spawn(new RandomLocation(playerLocation), Enderman.class);
        Horse kun = world.spawn(new RandomLocation(playerLocation), Horse.class);
        Witch carodejnice = world.spawn(new RandomLocation(playerLocation), Witch.class);
        Fox liska = world.spawn(new RandomLocation(playerLocation), Fox.class);
        Bee vcela = world.spawn(new RandomLocation(playerLocation), Bee.class);
        Ocelot ocelot = world.spawn(new RandomLocation(playerLocation), Ocelot.class);
        Phantom fantom = world.spawn(new RandomLocation(playerLocation), Phantom.class);
        Mule mezek = world.spawn(new RandomLocation(playerLocation), Mule.class);
        return true;
    }

    private static class RandomLocation extends Location {

        //      tento konstruktor je vygenerovany automaticky (ctrl+ins)
//       public RandomLocation(World world, double x, double y, double z) {
//            super(world, x, y, z);
//        }
//      upraveno na:
        public RandomLocation(Location location) {

            super(location.getWorld(), location.getX() - 10 + Math.random() * 20,
                    location.getY(), location.getZ() - 10 + Math.random() * 20);
        }
    }
}
