package com.t3ctonic.mysicenergies.data.block;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPureEnergy extends Block
{
    public BlockPureEnergy()
    {
        super(Material.rock);
        setBlockName("pureEnergyBlock");
        setBlockTextureName(Util.getModId() + "pureEnergyBlock");
        setCreativeTab(Util.getCreativeTab(0));
        setHardness(15);
        setResistance(100);
    }
}
