package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.item.Item;

public class ItemPureEnergy extends Item {


    public ItemPureEnergy() {
        super();
        this.setCreativeTab(MysticEnergies.TabMysticEnergies);
        setTextureName("MysticEnergies:PureEnergy");
    }
}