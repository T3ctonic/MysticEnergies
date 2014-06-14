package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemLiteEnergy extends Item
{


    public ItemLiteEnergy(int par1)
    {
        super(par1);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
    }

    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("MysticEnergies:LiteEnergy");
    }
}