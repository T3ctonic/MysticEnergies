package com.t3ctonic.mysticenergies;

import com.t3ctonic.mysticenergies.blocks.ModBlocks;
import com.t3ctonic.mysticenergies.items.ModItems;
import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class MysticEnergies {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){


        ModBlocks.init();
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

       //Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.pureEnergyBlock), new Object[]{
                "XXX",
                "XXX",
                "XXX",
                'X', ModItems.pureEnergy

        } );

        GameRegistry.addRecipe(new ItemStack(ModBlocks.darkEnergyBlock), new Object []{
                "XXX",
                "XXX",
                "XXX",
                'X', ModItems.darkEnergy


        });


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
