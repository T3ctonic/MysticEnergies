package Eclipse7.MysticEnergies.biomegenbase;

import net.minecraft.block.Block;
import net.minecraft.world.biome.BiomeGenBase;

public class FallenLightEnd extends BiomeGenBase
{

    public FallenLightEnd(int par1)
    {
        super(par1);
        this.topBlock = (byte) Block.whiteStone.blockID;
        this.fillerBlock = (byte) Block.dirt.blockID;
    }

}
