package com.t3ctonic.mysticenergies.blocks;

import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class PureEnergyBlock extends Block {

    private String name = "pureEnergyBlock";

    public PureEnergyBlock()
    {

        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setBlockName(Constants.MODID + "_" + name);
        GameRegistry.registerBlock(this, name);
        this.setHardness(15);
        this.setResistance(100);

    }

}
