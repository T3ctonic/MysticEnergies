package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemLiteEnergyHoe extends ItemHoe{

	public ItemLiteEnergyHoe(int par1, EnumToolMaterial par2EnumToolMaterial) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(MysticEnergies.TabMysticEnergies);
	}

		
public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("MysticEnergies:LiteEnergyHoe");
}
}
