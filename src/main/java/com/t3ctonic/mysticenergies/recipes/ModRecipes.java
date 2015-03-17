package com.t3ctonic.mysticenergies.recipes;

import com.t3ctonic.mysticenergies.blocks.ModBlocks;
import com.t3ctonic.mysticenergies.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import static cpw.mods.fml.common.registry.GameRegistry.addRecipe;

public class ModRecipes {
    public static void init() {
        addRecipe(new ItemStack(ModBlocks.pureEnergyBlock),
                "XXX",
                "XXX",
                "XXX",
                'X', ModItems.pureEnergy);

        addRecipe(new ItemStack(ModBlocks.liteEnergyBlock),
                "XXX",
                "XXX",
                "XXX",
                'X', ModItems.liteEnergy);

        addRecipe(new ItemStack(ModBlocks.darkEnergyBlock),
                "XXX",
                "XXX",
                "XXX",
                'X', ModItems.darkEnergy);

        addRecipe(new ItemStack(ModItems.pureEnergyPickaxe, 1),
                "***",
                "LXD",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergyPickaxe, 'D', ModItems.darkEnergyPickaxe);

        addRecipe(new ItemStack(ModItems.pureEnergySword, 1),
                "L*D",
                " * ",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergySword, 'D', ModItems.darkEnergySword);


        addRecipe(new ItemStack(ModItems.pureEnergyShovel, 1),
                "L*D",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergyShovel, 'D', ModItems.darkEnergyShovel);


        addRecipe(new ItemStack(ModItems.pureEnergyAxe, 1),
                "D**",
                "LX*",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'D', ModItems.darkEnergyAxe, 'L', ModItems.liteEnergyAxe);

        addRecipe(new ItemStack(ModItems.pureEnergyAxe, 1),
                "**L",
                "*XD",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'D', ModItems.darkEnergyAxe, 'L', ModItems.liteEnergyAxe);

        addRecipe(new ItemStack(ModItems.pureEnergyHoe, 1),
                "** ",
                "DXL",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergyHoe, 'D', ModItems.darkEnergyHoe);

        addRecipe(new ItemStack(ModItems.pureEnergyHoe, 1),
                " **",
                "LXD",
                " X ",
                'X', Items.stick, '*', ModItems.pureEnergy, 'L', ModItems.liteEnergyHoe, 'D', ModItems.darkEnergyHoe);

        addRecipe(new ItemStack(ModItems.pureEnergyBlend, 3),
                "**X",
                "*DX",
                "*XX",
                'X', ModItems.darkEnergy, '*', ModItems.liteEnergy, 'D', Blocks.redstone_block);

        addRecipe(new ItemStack(ModItems.pureEnergyBlend, 3),
                "*XX",
                "*DX",
                "**X",
                'X', ModItems.darkEnergy, '*', ModItems.liteEnergy, 'D', Blocks.redstone_block);

        addRecipe(new ItemStack(ModBlocks.pureEnergyBlock, 1),
                "XXX",
                "XXX",
                "XXX",
                'X', ModItems.pureEnergy);

        addRecipe(new ItemStack(ModItems.darkEnergyPickaxe, 1),
                "***",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy);

        addRecipe(new ItemStack(ModItems.darkEnergySword, 1),
                " * ",
                " * ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy);

        addRecipe(new ItemStack(ModItems.darkEnergyShovel, 1),
                " * ",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy);

        addRecipe(new ItemStack(ModItems.darkEnergyAxe, 1),
                "** ",
                "*X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy);

        addRecipe(new ItemStack(ModItems.darkEnergyHoe, 1),
                "** ",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy);

        addRecipe(new ItemStack(ModItems.liteEnergyPickaxe, 1),
                "***",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.darkEnergy);

        addRecipe(new ItemStack(ModItems.liteEnergySword, 1),
                " * ",
                " * ",
                " X ",
                'X', Items.stick, '*', ModItems.liteEnergy);

        addRecipe(new ItemStack(ModItems.liteEnergyShovel, 1),
                " * ",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.liteEnergy);

        addRecipe(new ItemStack(ModItems.liteEnergyAxe, 1),
                "** ",
                "*X ",
                " X ",
                'X', Items.stick, '*', ModItems.liteEnergy);

        addRecipe(new ItemStack(ModItems.liteEnergyHoe, 1),
                "** ",
                " X ",
                " X ",
                'X', Items.stick, '*', ModItems.liteEnergy);

        addRecipe(new ItemStack(ModItems.breadBrick, 1),
                "BBB",
                "BBB",
                "BBB",
                'B', Items.bread);

        addRecipe(new ItemStack(ModItems.energyBrick, 4),
                "RRR",
                "LBD",
                "RRR",
                'D', ModItems.darkEnergy, 'L', ModItems.liteEnergy, 'R', Items.redstone, 'B', ModItems.breadBrick);

    }
}
