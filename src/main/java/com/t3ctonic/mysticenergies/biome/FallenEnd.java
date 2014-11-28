package com.t3ctonic.mysticenergies.biome;

import com.t3ctonic.mysticenergies.blocks.ModBlocks;
import com.t3ctonic.mysticenergies.entity.EntityDarkEnergyGolem;
import com.t3ctonic.mysticenergies.entity.EntityLiteEnergyGolem;
import com.t3ctonic.mysticenergies.entity.EntityPureEnergyGolem;
import com.t3ctonic.mysticenergies.lib.Constants;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class FallenEnd extends BiomeGenBase {

    private String name = "fallenEnd";

    public static final BiomeGenBase.Height height_FallenEnd = new BiomeGenBase.Height(0.1F, 2F);

    public FallenEnd(int id) {

        super(id);
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityDarkEnergyGolem.class, 5, 2, 6));
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityLiteEnergyGolem.class, 5, 2, 6));
        this.spawnableCreatureList.add(new BiomeGenBase.SpawnListEntry(EntityPureEnergyGolem.class, 5, 2, 6));
        this.theBiomeDecorator.grassPerChunk = 10;
        this.topBlock = ModBlocks.dyingEarth;
        this.fillerBlock = Blocks.dirt;
        this.setBiomeName(Constants.MODID + "#" + name);
        this.setHeight(height_FallenEnd);
    }
}
