package Eclipse7.MysticEnergies.placeholder;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class MysticEnergiesPlaceHolder extends Item{

	public MysticEnergiesPlaceHolder(int par1) {
		super(par1);
		
	}
public void registerIcons(IconRegister iconRegister) {
	itemIcon = iconRegister.registerIcon("MysticEnergies:PureEnergy");
}	
}

