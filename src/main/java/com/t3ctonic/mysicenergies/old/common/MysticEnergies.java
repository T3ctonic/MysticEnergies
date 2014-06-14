package Eclipse7.MysticEnergies.common;


import Eclipse7.MysticEnergies.OreWorldGeneration.DarkOreWorldGenerator;
import Eclipse7.MysticEnergies.biomegenbase.FallenDarkEnd;
import Eclipse7.MysticEnergies.block.BlockDarkEnergyOre;
import Eclipse7.MysticEnergies.block.BlockPureEnergyBlock;
import Eclipse7.MysticEnergies.creativetabs.TabMysticEnergies;
import Eclipse7.MysticEnergies.item.*;
import Eclipse7.MysticEnergies.mobs.entity.EntityDarkEnergyGolem;
import Eclipse7.MysticEnergies.placeholder.MysticEnergiesPlaceHolder;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.EnumHelper;


@Mod(modid = "Mystic Energies", name = "Mystic Energies", version = "0.1 Alpha")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)


public class MysticEnergies
{
    @SidedProxy(clientSide = "Eclipse7.MysticEnergies.common.ClientProxy", serverSide = "Eclipse7.MysticEnergies.common.CommonProxy")
    public static CommonProxy proxy;

    //EnumToolMaterial
    public static EnumToolMaterial toolPureEnergy = EnumHelper.addToolMaterial("PUREENERGY", 3, 5000, 50.0F, 40.0F, 60);
    public static EnumToolMaterial toolDarkEnergy = EnumHelper.addToolMaterial("DARKENERGY", 2, 2000, 15.0F, 20.0F, 30);
    public static EnumToolMaterial toolLiteEnergy = EnumHelper.addToolMaterial("LITEENERGY", 2, 2000, 15.0F, 20.0F, 30);


    //Registrations
    public static BiomeGenBase FallenDarkEnd = new FallenDarkEnd(61).setBiomeName("Fallen Dark End").setMinMaxHeight(0.2F, 1F);
    public static CreativeTabs TabMysticEnergies = new TabMysticEnergies(CreativeTabs.getNextID(), "Mystic Energies");
    public static Block DarkEnergyOre = new BlockDarkEnergyOre(1100, Material.rock).setUnlocalizedName("DarkEnergyOre");
    public static Item DarkEnergy = new ItemDarkEnergy(2105).setUnlocalizedName("DarkEnergy");
    public static Item LiteEnergy = new ItemLiteEnergy(2106).setUnlocalizedName("LiteEnergy");
    public static Item PureEnergy = new ItemPureEnergy(2107).setUnlocalizedName("PureEnergy");
    public static Block PureEnergyBlock = new BlockPureEnergyBlock(2108, Material.iron).setUnlocalizedName("PureEnergyBlock");
    public static Item DarkEnergyPickaxe = new ItemDarkEnergyPickaxe(2109, toolDarkEnergy).setUnlocalizedName("DarkEnergyPickaxe");
    public static Item DarkEnergySword = new ItemDarkEnergySword(2110, toolDarkEnergy).setUnlocalizedName("DarkEnergySword");
    public static Item DarkEnergyShovel = new ItemDarkEnergyShovel(2111, toolDarkEnergy).setUnlocalizedName("DarkEnergyShovel");
    public static Item DarkEnergyAxe = new ItemDarkEnergyAxe(2112, toolDarkEnergy).setUnlocalizedName("DarkEnergyAxe");
    public static Item DarkEnergyHoe = new ItemDarkEnergyHoe(2113, toolDarkEnergy).setUnlocalizedName("DarkEnergyHoe");
    public static Item LiteEnergyPickaxe = new ItemLiteEnergyPickaxe(2114, toolLiteEnergy).setUnlocalizedName("LiteEnergyPickaxe");
    public static Item LiteEnergySword = new ItemLiteEnergySword(2115, toolLiteEnergy).setUnlocalizedName("LiteEnergySword");
    public static Item LiteEnergyShovel = new ItemLiteEnergyShovel(2116, toolLiteEnergy).setUnlocalizedName("LiteEnergyShovel");
    public static Item LiteEnergyAxe = new ItemLiteEnergyAxe(2117, toolLiteEnergy).setUnlocalizedName("LiteEnergyAxe");
    public static Item LiteEnergyHoe = new ItemLiteEnergyHoe(2118, toolLiteEnergy).setUnlocalizedName("LiteEnergyHoe");
    public static Item EnergyBrick = new EnergyBrick(2119, 12, false).setUnlocalizedName("EnergyBrick").setTextureName("MysticEnergies:EnergyBrick");
    public static Item PureEnergyPickaxe = new ItemPureEnergyPickaxe(2100, toolPureEnergy).setUnlocalizedName("PureEnergyPickaxe");
    public static Item PureEnergySword = new ItemPureEnergySword(2101, toolPureEnergy).setUnlocalizedName("PureEnergySword");
    public static Item PureEnergyShovel = new ItemPureEnergyShovel(2102, toolPureEnergy).setUnlocalizedName("PureEnergyShovel");
    public static Item PureEnergyAxe = new ItemPureEnergyAxe(2103, toolPureEnergy).setUnlocalizedName("PureEnergyAxe");
    public static Item PureEnergyHoe = new ItemPureEnergyHoe(2104, toolPureEnergy).setUnlocalizedName("PureEnergyHoe");
    /**
     * public static Block DyingWorldPortal = new BlockDyingWorldPortal(2105).setUnlocalizedName("DyingWorldPortal");
     * public static Item TimeFlux = new ItemTimeFlux(2106).setUnlocalizedName("TimeFlux").setTextureName("MysticEnergies:TimeFlux");
     * public static final int dimensionIdDyingWorld = 2000;
     */

    public static DarkOreWorldGenerator worldGen = new DarkOreWorldGenerator();


    public static Item MysticEnergiesPlaceHolder = new MysticEnergiesPlaceHolder(2090).setUnlocalizedName("MysticEnergiesPlaceHolder");


//World Generation

    @Instance("Mystic Energies")
    public static MysticEnergies instance;

    public static int startEntityId = 300;

    public MysticEnergies()
    {

        GameRegistry.addBiome(FallenDarkEnd);
        GameRegistry.registerBlock(DarkEnergyOre, "Dark Energy Ore");


        EntityRegistry.registerGlobalEntityID(EntityDarkEnergyGolem.class, "Dark Energy Golem", 1);
        EntityRegistry.addSpawn(EntityDarkEnergyGolem.class, 5, 1, 1, EnumCreatureType.monster, MysticEnergies.FallenDarkEnd);
        EntityRegistry.findGlobalUniqueEntityId();
        regiserEntityEgg(EntityDarkEnergyGolem.class, 0x292929, 0x000000);


        LanguageRegistry.addName(PureEnergyPickaxe, "Pure Energy Pickaxe");
        LanguageRegistry.addName(PureEnergySword, "Pure Energy Sword");
        LanguageRegistry.addName(PureEnergyShovel, "Pure Energy Shovel");
        LanguageRegistry.addName(PureEnergyAxe, "Pure Energy Axe");
        LanguageRegistry.addName(PureEnergyHoe, "Pure Energy Hoe");
        LanguageRegistry.addName(DarkEnergyOre, "Dark Energy Ore");
        LanguageRegistry.addName(DarkEnergy, "Dark Energy");
        LanguageRegistry.addName(PureEnergy, "Pure Energy(Temp Recipe)");
        LanguageRegistry.addName(LiteEnergy, "Lite Energy");
        LanguageRegistry.addName(PureEnergyBlock, "Pure Energy Block");
        LanguageRegistry.addName(DarkEnergyPickaxe, "Dark Energy Pickaxe");
        LanguageRegistry.addName(DarkEnergySword, "Dark Energy Sword");
        LanguageRegistry.addName(DarkEnergyShovel, "Dark Energy Shovel");
        LanguageRegistry.addName(DarkEnergyAxe, "Dark Energy Axe");
        LanguageRegistry.addName(DarkEnergyHoe, "Dark Energy Hoe");
        LanguageRegistry.addName(LiteEnergyPickaxe, "Lite Energy Pickaxe");
        LanguageRegistry.addName(LiteEnergySword, "Lite Energy Sword");
        LanguageRegistry.addName(LiteEnergyShovel, "Lite Energy Shovel");
        LanguageRegistry.addName(LiteEnergyAxe, "Lite Energy Axe");
        LanguageRegistry.addName(LiteEnergyHoe, "Lite Energy Hoe");
        LanguageRegistry.addName(EnergyBrick, "Energy Brick");


        GameRegistry.registerWorldGenerator(worldGen);


        LanguageRegistry.addName(MysticEnergiesPlaceHolder, "Mystic Energies");


        GameRegistry.addRecipe(new ItemStack(PureEnergyPickaxe, 1), new Object[]{
                "***", "LXD", " X ", 'X', Item.stick, '*', PureEnergy, 'L', LiteEnergyPickaxe, 'D', DarkEnergyPickaxe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergySword, 1), new Object[]{
                "L*D", " * ", " X ", 'X', Item.stick, '*', PureEnergy, 'L', LiteEnergySword, 'D', DarkEnergySword

        });


        GameRegistry.addRecipe(new ItemStack(PureEnergyShovel, 1), new Object[]{
                "L*D", " X ", " X ", 'X', Item.stick, '*', PureEnergy, 'L', LiteEnergyShovel, 'D', DarkEnergyShovel

        });


        GameRegistry.addRecipe(new ItemStack(PureEnergyAxe, 1), new Object[]{
                "D**", "LX*", " X ", 'X', Item.stick, '*', PureEnergy, 'D', DarkEnergyAxe, 'L', LiteEnergyAxe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergyAxe, 1), new Object[]{
                "**L", "*XD", " X ", 'X', Item.stick, '*', PureEnergy, 'D', DarkEnergyAxe, 'L', LiteEnergyAxe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergyHoe, 1), new Object[]{
                "**L", "DX ", " X ", 'X', Item.stick, '*', PureEnergy, 'L', LiteEnergyHoe, 'D', DarkEnergyHoe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergyHoe, 1), new Object[]{
                "D**", " XL", " X ", 'X', Item.stick, '*', PureEnergy, 'L', LiteEnergyHoe, 'D', DarkEnergyHoe

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergy, 3), new Object[]{
                "**X", "*DX", "*XX", 'X', DarkEnergy, '*', LiteEnergy, 'D', Item.diamond

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergy, 3), new Object[]{
                "*XX", "*DX", "**X", 'X', DarkEnergy, '*', LiteEnergy, 'D', Item.diamond

        });

        GameRegistry.addRecipe(new ItemStack(PureEnergyBlock, 1), "XXX", "XXX", "XXX", 'X', PureEnergy);

        GameRegistry.addRecipe(new ItemStack(DarkEnergyPickaxe, 1), new Object[]{
                "***", " X ", " X ", 'X', Item.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(DarkEnergySword, 1), new Object[]{
                " * ", " * ", " X ", 'X', Item.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(DarkEnergyShovel, 1), new Object[]{
                " * ", " X ", " X ", 'X', Item.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(DarkEnergyAxe, 1), new Object[]{
                "** ", "*X ", " X ", 'X', Item.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(DarkEnergyHoe, 1), new Object[]{
                "** ", " X ", " X ", 'X', Item.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergyPickaxe, 1), new Object[]{
                "***", " X ", " X ", 'X', Item.stick, '*', DarkEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergySword, 1), new Object[]{
                " * ", " * ", " X ", 'X', Item.stick, '*', LiteEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergyShovel, 1), new Object[]{
                " * ", " X ", " X ", 'X', Item.stick, '*', LiteEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergyAxe, 1), new Object[]{
                "** ", "*X ", " X ", 'X', Item.stick, '*', LiteEnergy

        });

        GameRegistry.addRecipe(new ItemStack(LiteEnergyHoe, 1), new Object[]{
                "** ", " X ", " X ", 'X', Item.stick, '*', LiteEnergy

        });


    }

    public static int getUniqueEntityId()
    {
        do
        {
            startEntityId++;
            {
            }
        }
        while (EntityList.getStringFromID(startEntityId) != null);
        return startEntityId++;
    }

    public static void regiserEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor)
    {
        int id = getUniqueEntityId();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
    }

    @Init
    public void load(FMLInitializationEvent event)
    {
        proxy.registerRenderInformation();
    }
}
