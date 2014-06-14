package Eclipse7.MysticEnergies.creativetabs;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.creativetab.CreativeTabs;

public class TabMysticEnergies extends CreativeTabs
{

    public TabMysticEnergies(int par1, String par2Str)
    {
        super(par1, par2Str);

    }


    public int getTabIconItemIndex()
    {
        return MysticEnergies.MysticEnergiesPlaceHolder.itemID;
    }


    public String getTranslatedTabLabel()
    {
        return "Mystic Energies";
    }
}
