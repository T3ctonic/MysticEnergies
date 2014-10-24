package com.t3ctonic.mysticenergies.blocks;

import net.minecraft.block.Block;

public final class ModBlocks {

    public static Block pureEnergyBlock;
    public static Block darkEnergyBlock;
    public static Block liteEnergyBlock;

    public static Block dyingEarth;

    public static Block energyFurnace;

    public static void init(){

        pureEnergyBlock = new PureEnergyBlock();
        darkEnergyBlock = new DarkEnergyBlock();
        liteEnergyBlock = new LiteEnergyBlock();

        dyingEarth = new DyingEarth();

        energyFurnace = new BlockEnergyFurnace();
    }
}
