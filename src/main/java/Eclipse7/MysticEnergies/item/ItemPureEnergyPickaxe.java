package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.ItemPickaxe;

public class ItemPureEnergyPickaxe extends ItemPickaxe
{

    public ItemPureEnergyPickaxe(ToolMaterial par2EnumToolMaterial)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:PureEnergyPickaxe");
    }
}
