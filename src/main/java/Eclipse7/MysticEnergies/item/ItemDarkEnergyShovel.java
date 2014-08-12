package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.ItemSpade;

public class ItemDarkEnergyShovel extends ItemSpade
{

    public ItemDarkEnergyShovel(ToolMaterial par2EnumToolMaterial)
    {
        super(par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:DarkEnergyShovel");
    }
}
