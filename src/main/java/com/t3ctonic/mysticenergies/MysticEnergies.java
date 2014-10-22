package com.t3ctonic.mysticenergies;

import com.t3ctonic.mysticenergies.blocks.ModBlocks;
import com.t3ctonic.mysticenergies.container.GuiHandler;
import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.items.*;
import com.t3ctonic.mysticenergies.lib.Constants;
import com.t3ctonic.mysticenergies.material.ModArmorMaterials;
import com.t3ctonic.mysticenergies.material.ModToolMaterials;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class MysticEnergies {

    @Mod.Instance
    public static MysticEnergies instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        ModCreativeTabs.init();
        ModToolMaterials.init();
        ModArmorMaterials.init();
        ModBlocks.init();
        ModItems.init();

        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

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

        GameRegistry.addRecipe(new ItemStack(ModBlocks.liteEnergyBlock), new Object[]{
                "XXX",
                "XXX",
                "XXX",
                'X', ModItems.liteEnergy

        } );

        GameRegistry.addRecipe(new ItemStack(ModBlocks.darkEnergyBlock), new Object []{
                "XXX",
                "XXX",
                "XXX",
                'X', ModItems.darkEnergy


        });

        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergyPickaxe, 1), new Object[]{
                "***",
                "LXD",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergyPickaxe, 'D', ModItems.darkEnergyPickaxe

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergySword, 1), new Object[]{
                "L*D",
                " * ",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergySword, 'D', ModItems.darkEnergySword

        });


        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergyShovel, 1), new Object[]{
                "L*D",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergyShovel, 'D', ModItems.darkEnergyShovel

        });


        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergyAxe, 1), new Object[]{
                "D**", "LX*", " X ", 'X', Items.stick, '*', ModItems.pureEnergy, 'D', ModItems.darkEnergyAxe, 'L', ModItems.liteEnergyAxe

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergyAxe, 1), new Object[]{
                "**L", "*XD", " X ", 'X', Items.stick, '*', ModItems.pureEnergy, 'D', ModItems.darkEnergyAxe, 'L', ModItems.liteEnergyAxe

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergyHoe, 1), new Object[]{
                "**L",
                "DX ",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergyHoe, 'D', ModItems.darkEnergyHoe

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergyHoe, 1), new Object[]{
                "D**",
                " XL",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergyHoe, 'D', ModItems.darkEnergyHoe

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergy, 3), new Object[]{
                "**X",
                "*DX",
                "*XX",
                'X', ModItems.darkEnergy, '*', ModItems.liteEnergy, 'D', Items.diamond

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.pureEnergy, 3), new Object[]{
                "*XX",
                "*DX",
                "**X",
                'X', ModItems.darkEnergy, '*', ModItems.liteEnergy, 'D', Items.diamond

        });

        GameRegistry.addRecipe(new ItemStack(ModBlocks.pureEnergyBlock, 1), "XXX", "XXX", "XXX", 'X', ModItems.pureEnergy);

        GameRegistry.addRecipe(new ItemStack(ModItems.darkEnergyPickaxe, 1), new Object[]{
                "***",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.darkEnergySword, 1), new Object[]{
                " * ",
                " * ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.darkEnergyShovel, 1), new Object[]{
                " * ",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.darkEnergyAxe, 1), new Object[]{
                "** ",
                "*X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.darkEnergyHoe, 1), new Object[]{
                "** ",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.liteEnergyPickaxe, 1), new Object[]{
                "***",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.liteEnergySword, 1), new Object[]{
                " * ",
                " * ",
                " X ",
                'X', Items.stick, '*', ModItems.liteEnergy

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.liteEnergyShovel, 1), new Object[]{
                " * ",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.liteEnergy

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.liteEnergyAxe, 1), new Object[]{
                "** ",
                "*X ",
                " X ",
                'X', Items.stick, '*', ModItems.liteEnergy

        });

        GameRegistry.addRecipe(new ItemStack(ModItems.liteEnergyHoe, 1), new Object[]{
                "** ",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.liteEnergy

        });


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
