package com.t3ctonic.mysicenergies.data.block.basic;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BasicBlock extends Block
{
    public BasicBlock(String name, Material material)
    {
        super(material);
        setBlockName("darkEnergyOre");
        setBlockTextureName(Util.getModId() + "darkEnergyOre");
        setCreativeTab(Util.getCreativeTab(0));
        setHardness(15f);
        setResistance(100);
    }
}
