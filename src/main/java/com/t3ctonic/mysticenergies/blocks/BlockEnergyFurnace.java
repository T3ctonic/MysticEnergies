package com.t3ctonic.mysticenergies.blocks;

import com.t3ctonic.mysticenergies.MysticEnergies;
import com.t3ctonic.mysticenergies.creativetab.ModCreativeTabs;
import com.t3ctonic.mysticenergies.lib.Constants;
import com.t3ctonic.mysticenergies.tile.TileEnergyFurnace;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import static cpw.mods.fml.common.registry.GameRegistry.registerBlock;

public class BlockEnergyFurnace extends BlockContainer {
    public BlockEnergyFurnace() {
        super(Material.rock);
        setBlockName("energyFurnace");
        setBlockTextureName(Constants.MODID + ":energyFurnace");
        setCreativeTab(ModCreativeTabs.tab);
        setHardness(3f);
        registerBlock(this, "energyFurnace");
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int meta, float posX, float posY, float posZ) {
        player.openGui(MysticEnergies.instance, 0, world, x, y, z);
        return true;
    }

    public TileEntity createNewTileEntity(World world, int meta) {
        return new TileEnergyFurnace();
    }
}
