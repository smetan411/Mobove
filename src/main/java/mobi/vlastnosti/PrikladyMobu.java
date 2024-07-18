package mobi.vlastnosti;

import mobi.PlayerCommandExecutor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;


public class PrikladyMobu extends PlayerCommandExecutor {
    private Location mistoMobu(Location playerLocation) {
        Location mistoVProstoru = new Location(playerLocation.getWorld(),
                (playerLocation.getX() - 5 + Math.random() * 10),
                (playerLocation.getY()),
                (playerLocation.getZ() - 5 + Math.random() * 10));
        return mistoVProstoru;
    }

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        // svet nici enderdrak, wither a creaper
        Rabbit kralik = world.spawn(mistoMobu(playerLocation), Rabbit.class);
        Spider pavouk = world.spawn(mistoMobu(playerLocation), Spider.class);
        Zombie zombie = world.spawn(mistoMobu(playerLocation), Zombie.class);
        Chicken slepice = world.spawn(mistoMobu(playerLocation), Chicken.class);
        Pig prase = world.spawn(mistoMobu(playerLocation), Pig.class);
        Cat kocka = world.spawn(mistoMobu(playerLocation), Cat.class);
        Cow krava = world.spawn(mistoMobu(playerLocation), Cow.class);
        Wolf vlk = world.spawn(mistoMobu(playerLocation), Wolf.class);
        Snowman snehulak = world.spawn(mistoMobu(playerLocation), Snowman.class);
        Skeleton kostra = world.spawn(mistoMobu(playerLocation), Skeleton.class);
        PolarBear ledniMedved = world.spawn(mistoMobu(playerLocation), PolarBear.class);
        Villager vesnican = world.spawn(mistoMobu(playerLocation), Villager.class);
        Panda panda = world.spawn(mistoMobu(playerLocation), Panda.class);
        Bat netopyr = world.spawn(mistoMobu(playerLocation), Bat.class);
        Creeper kriper = world.spawn(mistoMobu(playerLocation), Creeper.class);
        Donkey osel = world.spawn(mistoMobu(playerLocation), Donkey.class);
        Enderman enderman = world.spawn(mistoMobu(playerLocation), Enderman.class);
        Horse kun = world.spawn(mistoMobu(playerLocation), Horse.class);
        Witch carodejnice = world.spawn(mistoMobu(playerLocation), Witch.class);
        Fox liska = world.spawn(mistoMobu(playerLocation), Fox.class);
        Bee vcela = world.spawn(mistoMobu(playerLocation), Bee.class);
        Ocelot ocelot = world.spawn(mistoMobu(playerLocation), Ocelot.class);
        Phantom fantom = world.spawn(mistoMobu(playerLocation), Phantom.class);
        Mule mezek = world.spawn(mistoMobu(playerLocation), Mule.class);
        return true;
    }
}
