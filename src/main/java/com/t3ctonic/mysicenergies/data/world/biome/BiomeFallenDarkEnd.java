package com.t3ctonic.mysicenergies.data.world.biome;

import net.minecraft.world.biome.BiomeGenBase;

public class BiomeFallenDarkEnd extends BiomeGenBase
{
    public BiomeFallenDarkEnd()
    {
        super(50, true);
        setBiomeName("fallenDarkEnd");
        setHeight(new Height(0.2f, 1f));
        setDisableRain();
    }
}
