package com.t3ctonic.mysticenergies;

import com.t3ctonic.mysticenergies.blocks.ModBlocks;
import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class MysticEnergies {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){



        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}