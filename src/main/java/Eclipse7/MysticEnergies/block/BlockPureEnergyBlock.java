package Eclipse7.MysticEnergies.block;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockPureEnergyBlock extends Block
{


    public BlockPureEnergyBlock(Material par2Material)
    {
        super( Material.rock);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        this.setHardness(15);
        this.setResistance(100);
        this.setBlockTextureName("MysticEnergies:PureEnergyBlock");

    }


}
