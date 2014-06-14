package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;

public class ItemDarkEnergy extends Item{


public ItemDarkEnergy(int par1) {
		super(par1);
		this.setCreativeTab(MysticEnergies.TabMysticEnergies);
	}

public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("MysticEnergies:DarkEnergy");
}
}