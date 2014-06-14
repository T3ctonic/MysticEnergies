package Eclipse7.MysticEnergies.biomegenbase;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class FallenDarkEnd extends BiomeGenBase
{

    private boolean enableRain;

    public FallenDarkEnd(int par1)
    {
        super(par1);
        this.topBlock = (byte) Block.grass.blockID;
        this.fillerBlock = (byte) Block.stone.blockID;
        this.maxHeight = 60;
        this.minHeight = 40;
    }

}
