package Eclipse7.MysticEnergies.common;


import Eclipse7.MysticEnergies.OreWorldGeneration.DarkOreWorldGenerator;
import Eclipse7.MysticEnergies.block.BlockDarkEnergyOre;
import Eclipse7.MysticEnergies.block.BlockPureEnergyBlock;
import Eclipse7.MysticEnergies.creativetabs.TabMysticEnergies;
import Eclipse7.MysticEnergies.item.*;
import Eclipse7.MysticEnergies.placeholder.MysticEnergiesPlaceHolder;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

@SuppressWarnings("RedundantArrayCreation")
@Mod(modid = "Mystic Energies", name = "Mystic Energies", version = "0.1 Alpha")


public class MysticEnergies
{
    @SidedProxy(clientSide = "Eclipse7.MysticEnergies.common.ClientProxy", serverSide = "Eclipse7.MysticEnergies.common.CommonProxy")
    public static CommonProxy proxy;

    //EnumToolMaterial
    public static Item.ToolMaterial toolPureEnergy = EnumHelper.addToolMaterial("PUREENERGY", 3, 5000, 50.0F, 40.0F, 60);
    public static Item.ToolMaterial toolDarkEnergy = EnumHelper.addToolMaterial("DARKENERGY", 2, 2000, 15.0F, 20.0F, 30);
    public static Item.ToolMaterial toolLiteEnergy = EnumHelper.addToolMaterial("LITEENERGY", 2, 2000, 15.0F, 20.0F, 30);


    //Registrations
  /**  public static BiomeGenBase FallenDarkEnd = new FallenDarkEnd().setBiomeName("Fallen Dark End").setMinMaxHeight(0.2F, 1F);*/
    public static CreativeTabs TabMysticEnergies = new TabMysticEnergies("Mystic Energies");
    public static Block DarkEnergyOre = new BlockDarkEnergyOre(Material.rock).setBlockName("DarkEnergyOre");
    public static Item DarkEnergy = new ItemDarkEnergy().setUnlocalizedName("DarkEnergy");
    public static Item LiteEnergy = new ItemLiteEnergy().setUnlocalizedName("LiteEnergy");
    public static Item PureEnergy = new ItemPureEnergy().setUnlocalizedName("PureEnergy");
    public static Block PureEnergyBlock = new BlockPureEnergyBlock(Material.iron).setBlockName("PureEnergyBlock");
    public static Item DarkEnergyPickaxe = new ItemDarkEnergyPickaxe(toolDarkEnergy).setUnlocalizedName("DarkEnergyPickaxe");
    public static Item DarkEnergySword = new ItemDarkEnergySword(toolDarkEnergy).setUnlocalizedName("DarkEnergySword");
    public static Item DarkEnergyShovel = new ItemDarkEnergyShovel(toolDarkEnergy).setUnlocalizedName("DarkEnergyShovel");
    public static Item DarkEnergyAxe = new ItemDarkEnergyAxe(toolDarkEnergy).setUnlocalizedName("DarkEnergyAxe");
    public static Item DarkEnergyHoe = new ItemDarkEnergyHoe(toolDarkEnergy).setUnlocalizedName("DarkEnergyHoe");
    public static Item LiteEnergyPickaxe = new ItemLiteEnergyPickaxe(toolLiteEnergy).setUnlocalizedName("LiteEnergyPickaxe");
    public static Item LiteEnergySword = new ItemLiteEnergySword(toolLiteEnergy).setUnlocalizedName("LiteEnergySword");
    public static Item LiteEnergyShovel = new ItemLiteEnergyShovel(toolLiteEnergy).setUnlocalizedName("LiteEnergyShovel");
    public static Item LiteEnergyAxe = new ItemLiteEnergyAxe(toolLiteEnergy).setUnlocalizedName("LiteEnergyAxe");
    public static Item LiteEnergyHoe = new ItemLiteEnergyHoe(toolLiteEnergy).setUnlocalizedName("LiteEnergyHoe");
    public static Item EnergyBrick = new EnergyBrick(12, false).setUnlocalizedName("EnergyBrick").setTextureName("MysticEnergies:EnergyBrick");
    public static Item PureEnergyPickaxe = new ItemPureEnergyPickaxe(toolPureEnergy).setUnlocalizedName("PureEnergyPickaxe");
    public static Item PureEnergySword = new ItemPureEnergySword(toolPureEnergy).setUnlocalizedName("PureEnergySword");
    public static Item PureEnergyShovel = new ItemPureEnergyShovel(toolPureEnergy).setUnlocalizedName("PureEnergyShovel");
    public static Item PureEnergyAxe = new ItemPureEnergyAxe(toolPureEnergy).setUnlocalizedName("PureEnergyAxe");
    public static Item PureEnergyHoe = new ItemPureEnergyHoe(toolPureEnergy).setUnlocalizedName("PureEnergyHoe");
    /**
     * public static Block DyingWorldPortal = new BlockDyingWorldPortal(2105).setUnlocalizedName("DyingWorldPortal");
     * public static Item TimeFlux = new ItemTimeFlux(2106).setUnlocalizedName("TimeFlux").setTextureName("MysticEnergies:TimeFlux");
     * public static final int dimensionIdDyingWorld = 2000;
     */

    public static DarkOreWorldGenerator worldGen = new DarkOreWorldGenerator();


    public static Item MysticEnergiesPlaceHolder = new MysticEnergiesPlaceHolder().setUnlocalizedName("MysticEnergiesPlaceHolder");


//World Generation

    @Instance("Mystic Energies")
    public static MysticEnergies instance;

    public static int startEntityId = 300;

    public MysticEnergies()
    {

       /** GameRegistry.addBiome(FallenDarkEnd);
        GameRegistry.registerBlock(DarkEnergyOre, "Dark Energy Ore");


        EntityRegistry.registerGlobalEntityID(EntityDarkEnergyGolem.class, "Dark Energy Golem", 1);
        EntityRegistry.addSpawn(EntityDarkEnergyGolem.class, 5, 1, 1, EnumCreatureType.monster, MysticEnergies.FallenDarkEnd);
        EntityRegistry.findGlobalUniqueEntityId();
        regiserEntityEgg(EntityDarkEnergyGolem.class, 0x292929, 0x000000);*/


        GameRegistry.registerWorldGenerator(worldGen, 4);


        LanguageRegistry.addName(MysticEnergiesPlaceHolder, "Mystic Energies");


        GameRegistry.addRecipe(new ItemStack(PureEnergyPickaxe, 1), new Object[]{
                "***", "LXD", " X ", 'X', Items.stick, '*', PureEnergy, 'L', LiteEnergyPickaxe, 'D', DarkEnergyPickaxe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergySword, 1), new Object[]{
                "L*D", " * ", " X ", 'X', Items.stick, '*', PureEnergy, 'L', LiteEnergySword, 'D', DarkEnergySword

        });


        GameRegistry.addRecipe(new ItemStack(PureEnergyShovel, 1), new Object[]{
                "L*D", " X ", " X ", 'X', Items.stick, '*', PureEnergy, 'L', LiteEnergyShovel, 'D', DarkEnergyShovel

        });


        GameRegistry.addRecipe(new ItemStack(PureEnergyAxe, 1), new Object[]{
                "D**", "LX*", " X ", 'X', Items.stick, '*', PureEnergy, 'D', DarkEnergyAxe, 'L', LiteEnergyAxe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergyAxe, 1), new Object[]{
                "**L", "*XD", " X ", 'X', Items.stick, '*', PureEnergy, 'D', DarkEnergyAxe, 'L', LiteEnergyAxe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergyHoe, 1), new Object[]{
                "**L", "DX ", " X ", 'X', Items.stick, '*', PureEnergy, 'L', LiteEnergyHoe, 'D', DarkEnergyHoe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergyHoe, 1), new Object[]{
                "D**", " XL", " X ", 'X', Items.stick, '*', PureEnergy, 'L', LiteEnergyHoe, 'D', DarkEnergyHoe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergy, 3), new Object[]{
                "**X", "*DX", "*XX", 'X', DarkEnergy, '*', LiteEnergy, 'D', Items.diamond

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergy, 3), new Object[]{
                "*XX", "*DX", "**X", 'X', DarkEnergy, '*', LiteEnergy, 'D', Items.diamond

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergyBlock, 1), "XXX", "XXX", "XXX", 'X', PureEnergy);

        GameRegistry.addRecipe(new ItemStack(DarkEnergyPickaxe, 1), new Object[]{
                "***", " X ", " X ", 'X', Items.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(DarkEnergySword, 1), new Object[]{
                " * ", " * ", " X ", 'X', Items.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(DarkEnergyShovel, 1), new Object[]{
                " * ", " X ", " X ", 'X', Items.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(DarkEnergyAxe, 1), new Object[]{
                "** ", "*X ", " X ", 'X', Items.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(DarkEnergyHoe, 1), new Object[]{
                "** ", " X ", " X ", 'X', Items.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergyPickaxe, 1), new Object[]{
                "***", " X ", " X ", 'X', Items.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergySword, 1), new Object[]{
                " * ", " * ", " X ", 'X', Items.stick, '*', LiteEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergyShovel, 1), new Object[]{
                " * ", " X ", " X ", 'X', Items.stick, '*', LiteEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergyAxe, 1), new Object[]{
                "** ", "*X ", " X ", 'X', Items.stick, '*', LiteEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergyHoe, 1), new Object[]{
                "** ", " X ", " X ", 'X', Items.stick, '*', LiteEnergy

        });


    }

    public static int getUniqueEntityId()
    {
        do
        {
            startEntityId++;
        }
        while (EntityList.getStringFromID(startEntityId) != null);
        return startEntityId++;
    }

    public static void regiserEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor)
    {
        int id = getUniqueEntityId();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityList.EntityEggInfo(id, primaryColor, secondaryColor));
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderInformation();
    }
}
