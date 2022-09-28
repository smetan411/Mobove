package mobi;

import mobi.jezdci.PapousekNaOvci;
import mobi.jezdci.VesnicanNaKoni;
import mobi.jezdci.ZombieNaPavoukovi;
import mobi.vlastnosti.*;
import mobi.skupinyMobu.HejnoSlepic;
import mobi.skupinyMobu.RojVcel;
import mobi.skupinyMobu.SmeckaVlku;
import mobi.skupinyMobu.StadoOvci;
import org.bukkit.plugin.java.JavaPlugin;

public class MainMobi extends JavaPlugin {


    @Override
    public void onEnable() {
        getCommand("_papousekNaOvci").setExecutor(new PapousekNaOvci());
        getCommand("_vesnicanNaKoni").setExecutor(new VesnicanNaKoni());
        getCommand("_zombieNaPavoukovi").setExecutor(new ZombieNaPavoukovi());
        getCommand("_duhovaOvecka").setExecutor(new DuhovaOvce());
        getCommand("_kocka").setExecutor(new Kocka());
        getCommand("_liska").setExecutor(new Liska());
        getCommand("_obrPepa").setExecutor(new ObrPepa());
        getCommand("_prikladyMobu").setExecutor(new PrikladyMobu());
        getCommand("_vesnican").setExecutor(new Vesnican());
        getCommand("_hejnoSlepic").setExecutor(new HejnoSlepic());
        getCommand("_rojVcel").setExecutor(new RojVcel());
        getCommand("_smeckaVlku").setExecutor(new SmeckaVlku());
        getCommand("_stadoOvci").setExecutor(new StadoOvci());


    }
}
