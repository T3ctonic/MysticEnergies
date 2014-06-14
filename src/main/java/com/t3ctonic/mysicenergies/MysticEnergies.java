package com.t3ctonic.mysicenergies;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "mysticenergies", name = "MysticEnergies", version = "0.2")
public class MysticEnergies extends Util
{
    @Mod.Instance("mysticenergies")
    public static MysticEnergies instance;

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event)
    {
        getData().init();
    }
}
