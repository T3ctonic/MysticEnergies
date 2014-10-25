package com.t3ctonic.mysticenergies.biome;


import net.minecraft.world.biome.BiomeGenBase;

public final class ModBiomes {

    public static BiomeGenBase fallenEnd;



    public static void init() {

        fallenEnd = new FallenEnd();


    }
}
