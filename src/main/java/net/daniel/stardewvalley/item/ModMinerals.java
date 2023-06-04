package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.item.custom.minerals.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMinerals {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MODID);

    /*

        Minerals

     */

    public static final RegistryObject<Item> QUARTZ = ITEMS.register("mineral_quartz",
            () -> new QuartzItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> SLATE = ITEMS.register("mineral_slate",
            () -> new SlateItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> FAIRY_STONE = ITEMS.register("mineral_fairy_stone",
            () -> new FairyStoneItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> STAR_SHARDS = ITEMS.register("mineral_star_shards",
            () -> new StarShardsItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> OBSIDIAN = ITEMS.register("mineral_obsidian",
            () -> new ObsidianItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> MUDSTONE = ITEMS.register("mineral_mudstone",
            () -> new MudstoneItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> HEMATITE = ITEMS.register("mineral_hematite",
            () -> new HematiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> SOAPSTONE = ITEMS.register("mineral_soapstone",
            () -> new SoapstoneItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> LIMESTONE = ITEMS.register("mineral_limestone",
            () -> new LimestoneItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> BASALT = ITEMS.register("mineral_basalt",
            () -> new BasaltItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> GRANITE = ITEMS.register("mineral_granite",
            () -> new GraniteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> SANDSTONE = ITEMS.register("mineral_sandstone",
            () -> new SandstoneItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> MARBLE = ITEMS.register("mineral_marble",
            () -> new MarbleItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> CELESTINE = ITEMS.register("mineral_celestine",
            () -> new CelestineItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> ORPIMENT = ITEMS.register("mineral_orpiment",
            () -> new OrpimentItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> PETRIFIED_SLIME = ITEMS.register("mineral_petrified_slime",
            () -> new PetrifiedSlimeItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> THUNDER_EGG = ITEMS.register("mineral_thunder_egg",
            () -> new ThunderEggItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> PYRITE = ITEMS.register("mineral_pyrite",
            () -> new PyriteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> OCEAN_STONE = ITEMS.register("mineral_ocean_stone",
            () -> new OceanStoneItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> GHOST_CRYSTAL = ITEMS.register("mineral_ghost_crystal",
            () -> new GhostCrystalItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> TIGERSEYE = ITEMS.register("mineral_tigerseye",
            () -> new TigerseyeItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> JASPER = ITEMS.register("mineral_jasper",
            () -> new JasperItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> OPAL = ITEMS.register("mineral_opal",
            () -> new OpalItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> FIRE_OPAL = ITEMS.register("mineral_fire_opal",
            () -> new FireOpalItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> NEKOITE = ITEMS.register("mineral_nekoite",
            () -> new NekoiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> LEMON_STONE = ITEMS.register("mineral_lemon_stone",
            () -> new LemonStoneItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> NEPTUNITE = ITEMS.register("mineral_neptunite",
            () -> new NeptuniteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> MALACHITE = ITEMS.register("mineral_malachite",
            () -> new MalachiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> LUNARITE = ITEMS.register("mineral_lunarite",
            () -> new LunariteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> KYANITE = ITEMS.register("mineral_kyanite",
            () -> new KyaniteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> JAGOITE = ITEMS.register("mineral_jagoite",
            () -> new JagoiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> JAMBORITE = ITEMS.register("mineral_jamborite",
            () -> new JamboriteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> HELVITE = ITEMS.register("mineral_helvite",
            () -> new HelviteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> GEMINITE = ITEMS.register("mineral_geminite",
            () -> new GeminiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> FROZEN_TEAR = ITEMS.register("mineral_frozen_tear",
            () -> new FrozenTearItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> EARTH_CRYSTAL = ITEMS.register("mineral_earth_crystal",
            () -> new EarthCrystalItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> ALAMITE = ITEMS.register("mineral_alamite",
            () -> new AlamiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> BIXITE = ITEMS.register("mineral_bixite",
            () -> new BixiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> BARYTE = ITEMS.register("mineral_baryte",
            () -> new BaryteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> AERINITE = ITEMS.register("mineral_aerinite",
            () -> new AeriniteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> CALCITE = ITEMS.register("mineral_calcite",
            () -> new CalciteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> DOLOMITE = ITEMS.register("mineral_dolomite",
            () -> new DolomiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> ESPERITE = ITEMS.register("mineral_esperite",
            () -> new EsperiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> FLUORAPATITE = ITEMS.register("mineral_fluorapatite",
            () -> new FluorapatiteItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> FIRE_QUARTZ = ITEMS.register("mineral_fire_quartz",
            () -> new FireQuartzItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> PRISMATIC_SHARD = ITEMS.register("mineral_prismatic_shard",
            () -> new PrismaticShardItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> DIAMOND = ITEMS.register("mineral_diamond",
            () -> new DiamondItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> JADE = ITEMS.register("mineral_jade",
            () -> new JadeItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("mineral_topaz",
            () -> new TopazItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("mineral_amethyst",
            () -> new AmethystItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("mineral_ruby",
            () -> new RubyItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("mineral_aquamarine",
            () -> new AquamarineItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static final RegistryObject<Item> EMERALD = ITEMS.register("mineral_emerald",
            () -> new EmeraldItem(new Item.Properties().tab(ModCreativeModeTabs.MINERALS_TAB)));

    public static void  register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
