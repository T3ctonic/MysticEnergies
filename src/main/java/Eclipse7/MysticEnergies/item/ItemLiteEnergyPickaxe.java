package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.ItemPickaxe;

public class ItemLiteEnergyPickaxe extends ItemPickaxe {

    public ItemLiteEnergyPickaxe(ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:LiteEnergyPickaxe");
    }
}