package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.ItemAxe;

public class ItemDarkEnergyAxe extends ItemAxe {

    public ItemDarkEnergyAxe(ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:DarkEnergyAxe");
    }
}