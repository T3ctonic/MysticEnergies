package com.t3ctonic.mysticenergies.dimension;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderDyingWorld extends WorldProvider{


    private boolean allowHostiles, allowAnimals;

    @Override
    public void registerWorldChunkManager()
    {
        worldChunkMgr = new WorldChunkManagerDyingWorld(worldObj);
    }


    @Override
    public void setAllowedSpawnTypes(boolean allowHostiles, boolean allowAnimals)
    {
        this.allowHostiles = allowHostiles;
        this.allowAnimals = allowAnimals;
        super.setAllowedSpawnTypes(allowHostiles, allowAnimals);
    }

    public boolean getCanSpawnHostiles()
    {
        return allowHostiles;
    }

    public boolean getCanSpawnAnimals()
    {
        return allowAnimals;
    }

    @Override
    public String getDimensionName()
    {
        return "Dying Earth";
    }


}