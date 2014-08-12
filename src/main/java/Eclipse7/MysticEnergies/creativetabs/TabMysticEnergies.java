package Eclipse7.MysticEnergies.creativetabs;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabMysticEnergies extends CreativeTabs
{

    public TabMysticEnergies(String par2Str)
    {
        super(par2Str);

    }


    public String getTranslatedTabLabel()
    {
        return "Mystic Energies";
    }

    public Item getTabIconItem() {
        return MysticEnergies.MysticEnergiesPlaceHolder;
    }
}
