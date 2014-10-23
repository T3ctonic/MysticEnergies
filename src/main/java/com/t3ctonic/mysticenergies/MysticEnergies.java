package com.t3ctonic.mysticenergies;

import com.t3ctonic.mysticenergies.blocks.ModBlocks;
import com.t3ctonic.mysticenergies.container.GuiHandler;
import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.items.ModItems;
import com.t3ctonic.mysticenergies.lib.Constants;
import com.t3ctonic.mysticenergies.material.ModArmorMaterials;
import com.t3ctonic.mysticenergies.material.ModToolMaterials;
import com.t3ctonic.mysticenergies.recipes.ModRecipes;
import com.t3ctonic.mysticenergies.tile.ModTileEntities;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class MysticEnergies {
    @Mod.Instance
    public static MysticEnergies instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModCreativeTabs.init();
        ModToolMaterials.init();
        ModArmorMaterials.init();
        ModBlocks.init();
        ModItems.init();
        ModTileEntities.init();

        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        ModRecipes.init();
    }
}
