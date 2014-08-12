package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.ItemSpade;

public class ItemLiteEnergyShovel extends ItemSpade
{

    public ItemLiteEnergyShovel(ToolMaterial par2EnumToolMaterial)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:LiteEnergyShovel");
    }
}
