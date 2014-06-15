package com.t3ctonic.mysicenergies.data.block.basic;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BasicBlock extends Block
{
    public BasicBlock(String name, Material material, Item dropItem)
    {
        super(material);
        setBlockName("darkEnergyOre");
        setBlockTextureName(Util.getModId() + "darkEnergyOre");
        setCreativeTab(Util.getCreativeTab(0));
    }
}
