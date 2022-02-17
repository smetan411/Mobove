package mobi;

import mobi.prikladyMobu.ObrPepa;
import org.bukkit.plugin.java.JavaPlugin;

public class MainMobi extends JavaPlugin {


    @Override
    public void onEnable() {
        getCommand("_obr").setExecutor(new ObrPepa());

    }
}
