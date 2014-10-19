package com.t3ctonic.mysticenergies;

import com.t3ctonic.mysticenergies.blocks.ModBlocks;
import com.t3ctonic.mysticenergies.items.ModItems;
import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class MysticEnergies {


    public static Item.ToolMaterial toolPureEnergy = EnumHelper.addToolMaterial("PUREENERGY", 3, 5000, 50.0F, 40.0F, 60);
    public static Item.ToolMaterial toolDarkEnergy = EnumHelper.addToolMaterial("DARKENERGY", 2, 2000, 15.0F, 20.0F, 30);
    public static Item.ToolMaterial toolLiteEnergy = EnumHelper.addToolMaterial("LITEENERGY", 2, 2000, 15.0F, 20.0F, 30);

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

        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergy), new Object []{
                "XXX",
                "XIY",
                "YYY",
                'X', ModItems.darkEnergy, 'I', Items.diamond, 'Y', ModItems.liteEnergy
        });
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
