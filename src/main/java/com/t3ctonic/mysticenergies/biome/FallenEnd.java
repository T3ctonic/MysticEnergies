package com.t3ctonic.mysticenergies.biome;

import com.t3ctonic.mysticenergies.blocks.ModBlocks;
import com.t3ctonic.mysticenergies.lib.Constants;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class FallenEnd extends BiomeGenBase {

    private String name = "fallenEnd";

    public FallenEnd(int p_i1986_1_)
    {
        super(p_i1986_1_);
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityHorse.class, 5, 2, 6));
        this.theBiomeDecorator.grassPerChunk = 10;
        this.topBlock = Blocks.grass;
        this.topBlock = ModBlocks.dyingEarth;
        this.topBlock = Blocks.end_stone;
        this.fillerBlock = Blocks.stone;
        this.setBiomeName(Constants.MODID + "#" + name);
    }

}
