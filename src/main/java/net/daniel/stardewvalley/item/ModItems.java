package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.item.custom.artifacts.*;
import net.daniel.stardewvalley.item.custom.minerals.*;
import net.daniel.stardewvalley.item.custom.weapons.DragontoothCutlassItem;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MODID);

    // Add Items below this comment

    /*

            Artifacts

    */

    // Dwarf Scroll I
    public static final RegistryObject<Item> ARTIFACT_DWARF_SCROLL_1 = ITEMS.register("artifact_dwarf_scroll_1",
            () -> new ArtifactDwarfScroll1Item(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Dwarf Scroll II
    public static final RegistryObject<Item> ARTIFACT_DWARF_SCROLL_2 = ITEMS.register("artifact_dwarf_scroll_2",
            () -> new ArtifactDwarfScroll2Item(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Dwarf Scroll III
    public static final RegistryObject<Item> ARTIFACT_DWARF_SCROLL_3 = ITEMS.register("artifact_dwarf_scroll_3",
            () -> new ArtifactDwarfScroll3Item(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Dwarf Scroll IV
    public static final RegistryObject<Item> ARTIFACT_DWARF_SCROLL_4 = ITEMS.register("artifact_dwarf_scroll_4",
            () -> new ArtifactDwarfScroll4Item(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Chipped Amphora
    public static final RegistryObject<Item> ARTIFACT_CHIPPED_AMPHORA = ITEMS.register("artifact_chipped_amphora",
            () -> new ArtifactChippedAmphoraItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Arrowhead
    public static final RegistryObject<Item> ARTIFACT_ARROWHEAD = ITEMS.register("artifact_arrowhead",
            () -> new ArtifactArrowHeadItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Lost Book
    public static final RegistryObject<Item> ARTIFACT_LOST_BOOK = ITEMS.register("artifact_lost_book",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARDEW_TAB)));

    // Ancient Doll
    public static final RegistryObject<Item> ARTIFACT_ANCIENT_DOLL = ITEMS.register("artifact_ancient_doll",
            () -> new ArtifactAncientDollItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Elvish Jewelry
    public static final RegistryObject<Item> ARTIFACT_ELVISH_JEWELRY = ITEMS.register("artifact_elvish_jewelry",
            () -> new ArtifactElvishJewelryItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Chewing Stick
    public static final RegistryObject<Item> ARTIFACT_CHEWING_STICK = ITEMS.register("artifact_chewing_stick",
            () -> new ArtifactChewingStickItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Ornamental Fan
    public static final RegistryObject<Item> ARTIFACT_ORNAMENTAL_FAN = ITEMS.register("artifact_ornamental_fan",
            () -> new ArtifactOrnamentalFanItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Dinosaur Egg
    public static final RegistryObject<Item> ARTIFACT_DINOSAUR_EGG = ITEMS.register("artifact_dinosaur_egg",
            () -> new ArtifactDinosaurEggItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Rare Disc
    public static final RegistryObject<Item> ARTIFACT_RARE_DISC = ITEMS.register("artifact_rare_disc",
            () -> new ArtifactRareDiscItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Ancient Sword
    public static final RegistryObject<Item> ARTIFACT_ANCIENT_SWORD = ITEMS.register("artifact_ancient_sword",
            () -> new ArtifactAncientSwordItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Rusty Spoon
    public static final RegistryObject<Item> ARTIFACT_RUSTY_SPOON = ITEMS.register("artifact_rusty_spoon",
            () -> new ArtifactRustySpoonItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Rusty Spur
    public static final RegistryObject<Item> ARTIFACT_RUSTY_SPUR = ITEMS.register("artifact_rusty_spur",
            () -> new ArtifactRustySpurItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Rusty Cog
    public static final RegistryObject<Item> ARTIFACT_RUSTY_COG = ITEMS.register("artifact_rusty_cog",
            () -> new ArtifactRustyCogItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Chicken Statue
    public static final RegistryObject<Item> ARTIFACT_CHICKEN_STATUE = ITEMS.register("artifact_chicken_statue",
            () -> new ArtifactChickenStatueItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Ancient Seed
    public static final RegistryObject<Item> ARTIFACT_ANCIENT_SEED = ITEMS.register("artifact_ancient_seed",
            () -> new ArtifactAncientSeedItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Prehistoric Tool
    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_TOOL = ITEMS.register("artifact_prehistoric_tool",
            () -> new ArtifactPrehistoricToolItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Dried Starfish
    public static final RegistryObject<Item> ARTIFACT_DRIED_STARFISH = ITEMS.register("artifact_dried_starfish",
            () -> new ArtifactDriedStarfishItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Anchor
    public static final RegistryObject<Item> ARTIFACT_ANCHOR = ITEMS.register("artifact_anchor",
            () -> new ArtifactAnchorItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Glass Shards
    public static final RegistryObject<Item> ARTIFACT_GLASS_SHARDS = ITEMS.register("artifact_glass_shards",
            () -> new ArtifactGlassShardsItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Bone Flute
    public static final RegistryObject<Item> ARTIFACT_BONE_FLUTE = ITEMS.register("artifact_bone_flute",
            () -> new ArtifactBoneFluteItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Strange Doll Red
    public static final RegistryObject<Item> ARTIFACT_STRANGE_DOLL_RED = ITEMS.register("artifact_strange_doll_red",
            () -> new ArtifactStrangeDollRedItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Strange Doll Green
    public static final RegistryObject<Item> ARTIFACT_STRANGE_DOLL_GREEN = ITEMS.register("artifact_strange_doll_green",
            () -> new ArtifactStrangeDollGreenItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_AMPHIBIAN_FOSSIL = ITEMS.register("artifact_amphibian_fossil",
            () -> new ArtifactAmphibianFossilItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_ANCIENT_DRUM = ITEMS.register("artifact_ancient_drum",
            () -> new ArtifactAncientDrumItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_DWARF_GADGET = ITEMS.register("artifact_dwarf_gadget",
            () -> new ArtifactDwarfGadgetItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_DWARVISH_HELM = ITEMS.register("artifact_dwarvish_helm",
            () -> new ArtifactDwarvishHelmItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_GOLDEN_MASK = ITEMS.register("artifact_golden_mask",
            () -> new ArtifactGoldenMaskItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_GOLDEN_RELIC = ITEMS.register("artifact_golden_relic",
            () -> new ArtifactGoldenRelicItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_NAUTILUS_FOSSIL = ITEMS.register("artifact_nautilus_fossil",
            () -> new ArtifactNautilusFossilItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_PALM_FOSSIL = ITEMS.register("artifact_palm_fossil",
            () -> new ArtifactPalmFossilItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_HANDAXE = ITEMS.register("artifact_prehistoric_handaxe",
            () -> new ArtifactPrehistoricHandaxeItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_RIB = ITEMS.register("artifact_prehistoric_rib",
            () -> new ArtifactPrehistoricRibItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_SCAPULA = ITEMS.register("artifact_prehistoric_scapula",
            () -> new ArtifactPrehistoricScapulaItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_SKULL = ITEMS.register("artifact_prehistoric_skull",
            () -> new ArtifactPrehistoricSkullItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_TIBIA = ITEMS.register("artifact_prehistoric_tibia",
            () -> new ArtifactPrehistoricTibiaItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_VERTEBRA = ITEMS.register("artifact_prehistoric_vertebra",
            () -> new ArtifactPrehistoricVertebraItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_SKELETAL_HAND = ITEMS.register("artifact_skeletal_hand",
            () -> new ArtifactSkeletalHandItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_SKELETAL_TAIL = ITEMS.register("artifact_skeletal_tail",
            () -> new ArtifactSkeletalTailItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    public static final RegistryObject<Item> ARTIFACT_TRILOBITE = ITEMS.register("artifact_trilobite",
            () -> new ArtifactTrilobiteItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    /*

        Weapons

     */

    public static final RegistryObject<Item> DRAGONTOOTH_CUTLASS = ITEMS.register("dragontooth_cutlass",
            () -> new DragontoothCutlassItem(new Tier() {
                @Override
                public int getUses() {
                    return 2000;
                }

                @Override
                public float getSpeed() { return 12.0F; }

                @Override
                public float getAttackDamageBonus() {
                    return 0;
                }

                @Override
                public int getLevel() { return 4; }

                @Override
                public int getEnchantmentValue() {
                    return 2;
                }

                @Override
                public Ingredient getRepairIngredient() {
                    return Ingredient.of(ModItems.PRISMATIC_SHARD.get());
                }
            }, 11, -2.2F, new Item.Properties()
                    .tab(ModCreativeModeTab.STARDEW_TAB)
            ));

    public static final RegistryObject<Item> CUSTOM_SWORD = ITEMS.register("custom_sword",
            () -> new SwordItem(Tiers.IRON, 3, -2.4F, new Item.Properties()
                    .tab(ModCreativeModeTab.STARDEW_TAB)));



    /*

        Minerals

     */



    public static final RegistryObject<Item> QUARTZ = ITEMS.register("mineral_quartz",
            () -> new QuartzItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> SLATE = ITEMS.register("mineral_slate",
            () -> new SlateItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> FAIRY_STONE = ITEMS.register("mineral_fairy_stone",
            () -> new FairyStoneItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> STAR_SHARDS = ITEMS.register("mineral_star_shards",
            () -> new StarShardsItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> OBSIDIAN = ITEMS.register("mineral_obsidian",
            () -> new ObsidianItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> MUDSTONE = ITEMS.register("mineral_mudstone",
            () -> new MudstoneItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> HEMATITE = ITEMS.register("mineral_hematite",
            () -> new HematiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> SOAPSTONE = ITEMS.register("mineral_soapstone",
            () -> new SoapstoneItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> LIMESTONE = ITEMS.register("mineral_limestone",
            () -> new LimestoneItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> BASALT = ITEMS.register("mineral_basalt",
            () -> new BasaltItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> GRANITE = ITEMS.register("mineral_granite",
            () -> new GraniteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> SANDSTONE = ITEMS.register("mineral_sandstone",
            () -> new SandstoneItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> MARBLE = ITEMS.register("mineral_marble",
            () -> new MarbleItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> CELESTINE = ITEMS.register("mineral_celestine",
            () -> new CelestineItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> ORPIMENT = ITEMS.register("mineral_orpiment",
            () -> new OrpimentItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> PETRIFIED_SLIME = ITEMS.register("mineral_petrified_slime",
            () -> new PetrifiedSlimeItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> THUNDER_EGG = ITEMS.register("mineral_thunder_egg",
            () -> new ThunderEggItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> PYRITE = ITEMS.register("mineral_pyrite",
            () -> new PyriteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> OCEAN_STONE = ITEMS.register("mineral_ocean_stone",
            () -> new OceanStoneItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> GHOST_CRYSTAL = ITEMS.register("mineral_ghost_crystal",
            () -> new GhostCrystalItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> TIGERSEYE = ITEMS.register("mineral_tigerseye",
            () -> new TigerseyeItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> JASPER = ITEMS.register("mineral_jasper",
            () -> new JasperItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> OPAL = ITEMS.register("mineral_opal",
            () -> new OpalItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> FIRE_OPAL = ITEMS.register("mineral_fire_opal",
            () -> new FireOpalItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> NEKOITE = ITEMS.register("mineral_nekoite",
            () -> new NekoiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> LEMON_STONE = ITEMS.register("mineral_lemon_stone",
            () -> new LemonStoneItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> NEPTUNITE = ITEMS.register("mineral_neptunite",
            () -> new NeptuniteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> MALACHITE = ITEMS.register("mineral_malachite",
            () -> new MalachiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> LUNARITE = ITEMS.register("mineral_lunarite",
            () -> new LunariteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> KYANITE = ITEMS.register("mineral_kyanite",
            () -> new KyaniteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> JAGOITE = ITEMS.register("mineral_jagoite",
            () -> new JagoiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> JAMBORITE = ITEMS.register("mineral_jamborite",
            () -> new JamboriteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> HELVITE = ITEMS.register("mineral_helvite",
            () -> new HelviteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> GEMINITE = ITEMS.register("mineral_geminite",
            () -> new GeminiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> FROZEN_TEAR = ITEMS.register("mineral_frozen_tear",
            () -> new FrozenTearItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> EARTH_CRYSTAL = ITEMS.register("mineral_earth_crystal",
            () -> new EarthCrystalItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> ALAMITE = ITEMS.register("mineral_alamite",
            () -> new AlamiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> BIXITE = ITEMS.register("mineral_bixite",
            () -> new BixiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> BARYTE = ITEMS.register("mineral_baryte",
            () -> new BaryteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> AERINITE = ITEMS.register("mineral_aerinite",
            () -> new AeriniteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> CALCITE = ITEMS.register("mineral_calcite",
            () -> new CalciteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> DOLOMITE = ITEMS.register("mineral_dolomite",
            () -> new DolomiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> ESPERITE = ITEMS.register("mineral_esperite",
            () -> new EsperiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> FLUORAPATITE = ITEMS.register("mineral_fluorapatite",
            () -> new FluorapatiteItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> FIRE_QUARTZ = ITEMS.register("mineral_fire_quartz",
            () -> new FireQuartzItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> PRISMATIC_SHARD = ITEMS.register("mineral_prismatic_shard",
            () -> new PrismaticShardItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> DIAMOND = ITEMS.register("mineral_diamond",
            () -> new DiamondItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> JADE = ITEMS.register("mineral_jade",
            () -> new JadeItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("mineral_topaz",
            () -> new TopazItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("mineral_amethyst",
            () -> new AmethystItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> RUBY = ITEMS.register("mineral_ruby",
            () -> new RubyItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("mineral_aquamarine",
            () -> new AquamarineItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static final RegistryObject<Item> EMERALD = ITEMS.register("mineral_emerald",
            () -> new EmeraldItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB)));

    public static void  register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
