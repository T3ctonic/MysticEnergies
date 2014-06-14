package Eclipse7.MysticEnergies.block;
/**

 import Eclipse7.MysticEnergies.common.MysticEnergies;
 import net.minecraft.block.BlockPortal;
 import net.minecraft.block.material.Material;
 import net.minecraft.entity.Entity;
 import net.minecraft.entity.player.EntityPlayerMP;
 import net.minecraft.server.MinecraftServer;
 import net.minecraft.src.ModLoader;
 import net.minecraft.world.World;

 public class BlockDyingWorldPortal extends BlockPortal {

 public BlockDyingWorldPortal(int par1) {
 super(par1);
 }

 public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
 if(entity.ridingEntity == null && entity.riddenByEntity == null && entity instanceof EntityPlayerMP ){
 EntityPlayerMP player = (EntityPlayerMP) entity;
 ModLoader.getMinecraftServerInstance();
 MinecraftServer server = MinecraftServer.getServer();
 if(player.timeUntilPortal > 0 ){
 player.timeUntilPortal = 10;
 }else if(player.dimension != MysticEnergies.dimensionIdDyingWorld){
 player.timeUntilPortal = 10;
 player.mcServer.getConfigurationManager().transferPlayerToDimension(player, MysticEnergies.dimensionIdDyingWorld, new DyingWorldPortal);
 }
 }
 }

 public boolean tryToCreatePortal(World world, int x, int y, int z){
 return false;
 }

 public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5){


 }

 }

 **/