package com.t3ctonic.mysicenergies;

import com.t3ctonic.mysicenergies.data.Data;
import com.t3ctonic.mysicenergies.data.Energies;
import com.t3ctonic.mysicenergies.proxy.ServerProxy;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.common.util.EnumHelper;

public class Util
{
    /** Proxy */
    @SidedProxy(clientSide = "com.t3ctonic.mysicenergies.proxy.ClientProxy", serverSide = "com.t3ctonic.mysicenergies.proxy.ServerProxy")
    public static ServerProxy proxy;

    /** Stuff */
    private static final Data data = new Data();
    private static final Energies energies = new Energies();
    private static final CreativeTabs[] creativeTabs = new CreativeTabs[512];
    private static final Item[] items = new Item[512];
    private static final Block[] blocks = new Block[512];
    private static final Item.ToolMaterial[] toolMaterials = new Item.ToolMaterial[512];
    private static final ItemArmor.ArmorMaterial[] armorMaterials = new ItemArmor.ArmorMaterial[512];
    private static final Object[] objects = new Object[4];
    private static final Class[] classes = new Class[2];

    /** Adders */
    public void addCreativeTab(int id, CreativeTabs tab)
    {
        if (id != -1) creativeTabs[id] = tab;
    }

    public void addBlock(int id, Block block)
    {
        if (id != -1) blocks[id] = block;
        GameRegistry.registerBlock(block, block.getUnlocalizedName());
    }

    public void addItem(int id, Item item)
    {
        if (id != -1) items[id] = item;
        GameRegistry.registerItem(item, item.getUnlocalizedName());
    }

    public void addBlockWithTileEntity(int id, BlockContainer block, Class<? extends TileEntity> tile, boolean registerTile)
    {
        addBlock(id, block);
        if (registerTile) GameRegistry.registerTileEntity(tile, tile.getSimpleName());
    }

    public void addEntity(Class<? extends EntityLiving> entity, String name, RenderLiving renderer, int color1, int color2)
    {
        int entityId = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(entity, name, entityId, color1, color2);
        EntityRegistry.registerModEntity(entity, name, entityId, MysticEnergies.instance, 64, 1, true);

        classes[0] = entity;
        objects[0] = renderer;
        proxy.renderEntity();
    }

    public void addBlockRenderer(Class<? extends TileEntity> tile, TileEntitySpecialRenderer renderer)
    {
        classes[1] = tile;
        objects[1] = renderer;
        proxy.renderTileEntity();
    }

    public void addItemRenderer(Item item, IItemRenderer renderer)
    {
        objects[2] = item;
        objects[3] = renderer;
        proxy.renderItem();
    }

    public void addWorldGenerator(IWorldGenerator generator, int population)
    {
        GameRegistry.registerWorldGenerator(generator, population);
    }

    public void addToolMaterial(int id, String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability)
    {
        if (id != -1) toolMaterials[id] = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
    }

    public void addArmorMaterial(int id, String name, int durability, int[] reductionAmounts, int enchantability)
    {
        if (id != -1) armorMaterials[id] = EnumHelper.addArmorMaterial(name, durability, reductionAmounts, enchantability);
    }

    /** Getters */
    public static String getModId()
    {
        return "mysticenergies:";
    }

    public static Data getData()
    {
        return data;
    }

    public static String[] getEnergies()
    {
        return energies.energies;
    }

    public static CreativeTabs getCreativeTab(int id)
    {
        return creativeTabs[id];
    }

    public static Block getBlock(int id)
    {
        return blocks[id];
    }

    public static Item getItem(int id)
    {
        return items[id];
    }

    public static Item.ToolMaterial getToolMaterial(int id)
    {
        return toolMaterials[id];
    }

    public static ItemArmor.ArmorMaterial getArmorMaterial(int id)
    {
        return armorMaterials[id];
    }

    public static Object[] getObjects()
    {
        return objects;
    }

    public static Class[] getClasses()
    {
        return classes;
    }
}
