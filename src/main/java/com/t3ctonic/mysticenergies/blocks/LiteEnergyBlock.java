package com.t3ctonic.mysticenergies.blocks;

import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.lib.Constants;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LiteEnergyBlock extends Block {

    private String name = "liteEnergyBlock";

    public LiteEnergyBlock()
    {
        super(Material.rock);
        setCreativeTab(ModCreativeTabs.tab);
        setBlockName(Constants.MODID + "_" + name);
        setBlockTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerBlock(this, name);
        this.setHardness(13);
        this.setResistance(100);

    }

}
