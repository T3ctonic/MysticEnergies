package Eclipse7.MysticEnergies.block;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;


public class BlockPureEnergyBlock extends Block
{


    public BlockPureEnergyBlock(int par1, Material par2Material)
    {
        super(par1, Material.rock);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        this.setHardness(15);
        this.setResistance(100);


    }


    public void registerIcons(IconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon("MysticEnergies:PureEnergyBlock");


    }


}
