package Eclipse7.MysticEnergies.item;

import Eclipse7.MysticEnergies.common.MysticEnergies;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EnergyBrick extends ItemFood{

	public EnergyBrick(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		this.setCreativeTab(MysticEnergies.TabMysticEnergies);
	}
	public void regsterIcons(IconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon ("MysticEnergies:EnergyBrick");
	}		

public int getMaxItemUseDuration(ItemStack par1ItemStack) {
	return 12;
	}
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.rare;
	}
protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
	if(!par2World.isRemote){
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 50, 100 ));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 125, 150 ));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 3 ));
		par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.id, 300, 100 ));
	}
	
}
}	

