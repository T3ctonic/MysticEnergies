package Eclipse7.MysticEnergies.block;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;


public class BlockDarkEnergyOre extends Block
{

    public BlockDarkEnergyOre(Material par2Material)
    {
        super( Material.rock);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        this.setHardness(15);
        this.setResistance(100);
        this.setBlockName("MysticEnergies:DarkEnergyOre1");

    }

    public int quantityDropped(Random par1Random)
    {
        return 1;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return MysticEnergies.DarkEnergy;
    }
}
