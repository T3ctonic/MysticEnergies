package com.t3ctonic.mysticenergies.biome;


import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public final class ModBiomes {

    public static BiomeGenBase fallenEnd;



    public static void init() {
        registerBiomes();
    }

    private static void registerBiomes() {

    fallenEnd = new FallenEnd(50);
        BiomeDictionary.registerBiomeType(fallenEnd, BiomeDictionary.Type.PLAINS);
        //noinspection deprecation
        BiomeManager.warmBiomes.add(new BiomeManager.BiomeEntry(fallenEnd, 10));


    }

}
