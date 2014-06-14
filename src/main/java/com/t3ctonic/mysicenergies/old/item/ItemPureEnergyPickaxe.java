package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ItemPureEnergyPickaxe extends ItemPickaxe
{

    public ItemPureEnergyPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
    }


    public void registerIcons(IconRegister iconregister)
    {
        itemIcon = iconregister.registerIcon("MysticEnergies:PureEnergyPickaxe");
    }
}
