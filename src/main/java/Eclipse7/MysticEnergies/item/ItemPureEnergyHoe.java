package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.ItemHoe;

public class ItemPureEnergyHoe extends ItemHoe
{

    public ItemPureEnergyHoe(ToolMaterial par2EnumToolMaterial)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:PureEnergyHoe");
    }
}
