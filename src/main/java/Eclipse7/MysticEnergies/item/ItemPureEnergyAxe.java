package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.ItemAxe;

public class ItemPureEnergyAxe extends ItemAxe
{

    public ItemPureEnergyAxe(ToolMaterial par2EnumToolMaterial)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:PureEnergyAxe");
    }
}
