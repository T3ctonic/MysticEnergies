package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.ItemSword;

public class ItemPureEnergySword extends ItemSword
{

    public ItemPureEnergySword(ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:PureEnergySword");
    }
}
