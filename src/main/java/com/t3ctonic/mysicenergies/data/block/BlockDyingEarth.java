package com.t3ctonic.mysicenergies.data.block;

import com.t3ctonic.mysicenergies.Util;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockDyingEarth extends Block {

    public BlockDyingEarth() {
        super(Material.rock);
        setBlockName("dyingEarth");
        setBlockTextureName(Util.getModId() + "dyingEarth");
        setCreativeTab(Util.getCreativeTab(0));
        setHardness(15f);
        setResistance(100);
    }
}