package com.t3ctonic.mysticenergies.blocks;

import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PureEnergyBlock extends Block {

    private String name = "pureEnergyBlock";

    public PureEnergyBlock()
    {

        super(Material.rock);
        this.setCreativeTab(ModCreativeTabs.tab);
        this.setBlockName(Constants.MODID + "_" + name);
        this.setBlockTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerBlock(this, name);
        this.setHardness(15);
        this.setResistance(100);

    }

}
