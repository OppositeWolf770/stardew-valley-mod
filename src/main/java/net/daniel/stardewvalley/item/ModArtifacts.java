package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.item.custom.artifacts.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModArtifacts {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MODID);

    /*

            Artifacts

    */

    // Amphibian Fossil
    public static final RegistryObject<Item> ARTIFACT_AMPHIBIAN_FOSSIL = ITEMS.register("artifact_amphibian_fossil",
            () -> new ArtifactAmphibianFossilItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Anchor
    public static final RegistryObject<Item> ARTIFACT_ANCHOR = ITEMS.register("artifact_anchor",
            () -> new ArtifactAnchorItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Ancient Doll
    public static final RegistryObject<Item> ARTIFACT_ANCIENT_DOLL = ITEMS.register("artifact_ancient_doll",
            () -> new ArtifactAncientDollItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Ancient Drum
    public static final RegistryObject<Item> ARTIFACT_ANCIENT_DRUM = ITEMS.register("artifact_ancient_drum",
            () -> new ArtifactAncientDrumItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    // Ancient Seed
    public static final RegistryObject<Item> ARTIFACT_ANCIENT_SEED = ITEMS.register("artifact_ancient_seed",
            () -> new ArtifactAncientSeedItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Ancient Sword
    public static final RegistryObject<Item> ARTIFACT_ANCIENT_SWORD = ITEMS.register("artifact_ancient_sword",
            () -> new ArtifactAncientSwordItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Arrowhead
    public static final RegistryObject<Item> ARTIFACT_ARROWHEAD = ITEMS.register("artifact_arrowhead",
            () -> new ArtifactArrowHeadItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Bone Flute
    public static final RegistryObject<Item> ARTIFACT_BONE_FLUTE = ITEMS.register("artifact_bone_flute",
            () -> new ArtifactBoneFluteItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Chewing Stick
    public static final RegistryObject<Item> ARTIFACT_CHEWING_STICK = ITEMS.register("artifact_chewing_stick",
            () -> new ArtifactChewingStickItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Chicken Statue
    public static final RegistryObject<Item> ARTIFACT_CHICKEN_STATUE = ITEMS.register("artifact_chicken_statue",
            () -> new ArtifactChickenStatueItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Chipped Amphora
    public static final RegistryObject<Item> ARTIFACT_CHIPPED_AMPHORA = ITEMS.register("artifact_chipped_amphora",
            () -> new ArtifactChippedAmphoraItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Dinosaur Egg
    public static final RegistryObject<Item> ARTIFACT_DINOSAUR_EGG = ITEMS.register("artifact_dinosaur_egg",
            () -> new ArtifactDinosaurEggItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Dried Starfish
    public static final RegistryObject<Item> ARTIFACT_DRIED_STARFISH = ITEMS.register("artifact_dried_starfish",
            () -> new ArtifactDriedStarfishItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Dwarf Gadget
    public static final RegistryObject<Item> ARTIFACT_DWARF_GADGET = ITEMS.register("artifact_dwarf_gadget",
            () -> new ArtifactDwarfGadgetItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

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

    // Dwarvish Helm
    public static final RegistryObject<Item> ARTIFACT_DWARVISH_HELM = ITEMS.register("artifact_dwarvish_helm",
            () -> new ArtifactDwarvishHelmItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Elvish Jewelry
    public static final RegistryObject<Item> ARTIFACT_ELVISH_JEWELRY = ITEMS.register("artifact_elvish_jewelry",
            () -> new ArtifactElvishJewelryItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Glass Shards
    public static final RegistryObject<Item> ARTIFACT_GLASS_SHARDS = ITEMS.register("artifact_glass_shards",
            () -> new ArtifactGlassShardsItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Golden Mask
    public static final RegistryObject<Item> ARTIFACT_GOLDEN_MASK = ITEMS.register("artifact_golden_mask",
            () -> new ArtifactGoldenMaskItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Golden Relic
    public static final RegistryObject<Item> ARTIFACT_GOLDEN_RELIC = ITEMS.register("artifact_golden_relic",
            () -> new ArtifactGoldenRelicItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Lost Book
    public static final RegistryObject<Item> ARTIFACT_LOST_BOOK = ITEMS.register("artifact_lost_book",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.STARDEW_TAB)));

    // Nautilus Fossil
    public static final RegistryObject<Item> ARTIFACT_NAUTILUS_FOSSIL = ITEMS.register("artifact_nautilus_fossil",
            () -> new ArtifactNautilusFossilItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Ornamental Fan
    public static final RegistryObject<Item> ARTIFACT_ORNAMENTAL_FAN = ITEMS.register("artifact_ornamental_fan",
            () -> new ArtifactOrnamentalFanItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Palm Fossil
    public static final RegistryObject<Item> ARTIFACT_PALM_FOSSIL = ITEMS.register("artifact_palm_fossil",
            () -> new ArtifactPalmFossilItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Prehistoric Handaxe
    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_HANDAXE = ITEMS.register("artifact_prehistoric_handaxe",
            () -> new ArtifactPrehistoricHandaxeItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Prehistoric Rib
    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_RIB = ITEMS.register("artifact_prehistoric_rib",
            () -> new ArtifactPrehistoricRibItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Prehistoric Scapula
    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_SCAPULA = ITEMS.register("artifact_prehistoric_scapula",
            () -> new ArtifactPrehistoricScapulaItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Prehistoric Skull
    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_SKULL = ITEMS.register("artifact_prehistoric_skull",
            () -> new ArtifactPrehistoricSkullItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Prehistoric Tibia
    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_TIBIA = ITEMS.register("artifact_prehistoric_tibia",
            () -> new ArtifactPrehistoricTibiaItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Prehistoric Tool
    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_TOOL = ITEMS.register("artifact_prehistoric_tool",
            () -> new ArtifactPrehistoricToolItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Prehistoric Vertebra
    public static final RegistryObject<Item> ARTIFACT_PREHISTORIC_VERTEBRA = ITEMS.register("artifact_prehistoric_vertebra",
            () -> new ArtifactPrehistoricVertebraItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Rare Disc
    public static final RegistryObject<Item> ARTIFACT_RARE_DISC = ITEMS.register("artifact_rare_disc",
            () -> new ArtifactRareDiscItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Rusty Cog
    public static final RegistryObject<Item> ARTIFACT_RUSTY_COG = ITEMS.register("artifact_rusty_cog",
            () -> new ArtifactRustyCogItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Rusty Spoon
    public static final RegistryObject<Item> ARTIFACT_RUSTY_SPOON = ITEMS.register("artifact_rusty_spoon",
            () -> new ArtifactRustySpoonItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Rusty Spur
    public static final RegistryObject<Item> ARTIFACT_RUSTY_SPUR = ITEMS.register("artifact_rusty_spur",
            () -> new ArtifactRustySpurItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Skeletal Hand
    public static final RegistryObject<Item> ARTIFACT_SKELETAL_HAND = ITEMS.register("artifact_skeletal_hand",
            () -> new ArtifactSkeletalHandItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Skeletal Tail
    public static final RegistryObject<Item> ARTIFACT_SKELETAL_TAIL = ITEMS.register("artifact_skeletal_tail",
            () -> new ArtifactSkeletalTailItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Strange Doll Green
    public static final RegistryObject<Item> ARTIFACT_STRANGE_DOLL_GREEN = ITEMS.register("artifact_strange_doll_green",
            () -> new ArtifactStrangeDollGreenItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Strange Doll Red
    public static final RegistryObject<Item> ARTIFACT_STRANGE_DOLL_RED = ITEMS.register("artifact_strange_doll_red",
            () -> new ArtifactStrangeDollRedItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));

    // Trilobite
    public static final RegistryObject<Item> ARTIFACT_TRILOBITE = ITEMS.register("artifact_trilobite",
            () -> new ArtifactTrilobiteItem(new Item.Properties().tab(ModCreativeModeTab.ARTIFACTS_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}