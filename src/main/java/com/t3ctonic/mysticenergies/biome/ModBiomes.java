package com.t3ctonic.mysticenergies.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenOcean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class ModBiomes {



    public static final BiomeGenBase.Height height_FallenEnd = new BiomeGenBase.Height(0.1F, 2F);

    public static final ModBiomes fallenEnd = (new BiomeGenOcean(0)).setColor(112).setBiomeName("FallenEnd").setHeight(height_FallenEnd);

    public static void init() {





    }
}
