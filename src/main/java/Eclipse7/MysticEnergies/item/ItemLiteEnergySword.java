package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.ItemSword;

public class ItemLiteEnergySword extends ItemSword
{

    public ItemLiteEnergySword(ToolMaterial par2EnumToolMaterial)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:LiteEnergySword");
    }
}
