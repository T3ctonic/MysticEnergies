package com.t3ctonic.mysticenergies.blocks;

import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DyingEarth extends Block {

    private String name = "dyingEarth";

    public DyingEarth(){

        super(Material.rock);
        this.setBlockTextureName(Constants.MODID + ":" + name);
        this.setBlockName(Constants.MODID + "_" + name);
        this.setCreativeTab(ModCreativeTabs.tab);
        GameRegistry.registerBlock(this, name);
        this.setHardness(2);
        this.setResistance(0);

    }
}
