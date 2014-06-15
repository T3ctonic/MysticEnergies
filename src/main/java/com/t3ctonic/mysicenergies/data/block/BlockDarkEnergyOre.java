package com.t3ctonic.mysicenergies.data.block;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockDarkEnergyOre extends Block
{
    public BlockDarkEnergyOre()
    {
        super(Material.rock);
        setBlockName("darkEnergyOre");
        setBlockTextureName(Util.getModId() + "darkEnergyOre");
        setCreativeTab(Util.getCreativeTab(0));
        setHardness(15f);
        setResistance(100);
    }

    public Item getItemDropped(int side, Random random, int meta)
    {
        return Util.getItem(0);
    }
}
