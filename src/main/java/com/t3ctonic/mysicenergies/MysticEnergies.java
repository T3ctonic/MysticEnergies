package com.t3ctonic.mysicenergies;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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

    @SideOnly(Side.SERVER)
    @Mod.EventHandler
    public void initServer(FMLPreInitializationEvent event)
    {
        getData().initServer();
    }

    @SideOnly(Side.CLIENT)
    @Mod.EventHandler
    public void initClient(FMLPreInitializationEvent event)
    {
        getData().initClient();
    }
}
