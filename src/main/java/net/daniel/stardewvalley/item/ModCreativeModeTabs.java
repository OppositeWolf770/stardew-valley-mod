package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;



public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            StardewValley.MODID);

    public static RegistryObject<CreativeModeTab> ARTIFACTS_TAB = CREATIVE_MODE_TABS.register("artifactstab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModArtifacts.ARTIFACT_LOST_BOOK.get()))
                    .title(Component.translatable("itemGroup.artifactstab"))
                    .displayItems((displayParams, output) -> {
                        output.accept(ModArtifacts.ARTIFACT_ANCIENT_DOLL.get());
                        output.accept(ModArtifacts.ARTIFACT_ANCIENT_DRUM.get());
                        output.accept(ModArtifacts.ARTIFACT_ANCIENT_SEED.get());
                        output.accept(ModArtifacts.ARTIFACT_ANCIENT_SWORD.get());
                        output.accept(ModArtifacts.ARTIFACT_ANCHOR.get());
                        output.accept(ModArtifacts.ARTIFACT_ARROWHEAD.get());
                        output.accept(ModArtifacts.ARTIFACT_AMPHIBIAN_FOSSIL.get());
                        output.accept(ModArtifacts.ARTIFACT_BONE_FLUTE.get());
                        output.accept(ModArtifacts.ARTIFACT_CHICKEN_STATUE.get());
                        output.accept(ModArtifacts.ARTIFACT_CHIPPED_AMPHORA.get());
                        output.accept(ModArtifacts.ARTIFACT_CHEWING_STICK.get());
                        output.accept(ModArtifacts.ARTIFACT_DINOSAUR_EGG.get());
                        output.accept(ModArtifacts.ARTIFACT_DRIED_STARFISH.get());
                        output.accept(ModArtifacts.ARTIFACT_DWARF_GADGET.get());
                        output.accept(ModArtifacts.ARTIFACT_DWARF_SCROLL_1.get());
                        output.accept(ModArtifacts.ARTIFACT_DWARF_SCROLL_2.get());
                        output.accept(ModArtifacts.ARTIFACT_DWARF_SCROLL_3.get());
                        output.accept(ModArtifacts.ARTIFACT_DWARF_SCROLL_4.get());
                        output.accept(ModArtifacts.ARTIFACT_DWARVISH_HELM.get());
                        output.accept(ModArtifacts.ARTIFACT_ELVISH_JEWELRY.get());
                        output.accept(ModArtifacts.ARTIFACT_GLASS_SHARDS.get());
                        output.accept(ModArtifacts.ARTIFACT_GOLDEN_MASK.get());
                        output.accept(ModArtifacts.ARTIFACT_GOLDEN_RELIC.get());
                        output.accept(ModArtifacts.ARTIFACT_NAUTILUS_FOSSIL.get());
                        output.accept(ModArtifacts.ARTIFACT_ORNAMENTAL_FAN.get());
                        output.accept(ModArtifacts.ARTIFACT_PALM_FOSSIL.get());
                        output.accept(ModArtifacts.ARTIFACT_PREHISTORIC_HANDAXE.get());
                        output.accept(ModArtifacts.ARTIFACT_PREHISTORIC_RIB.get());
                        output.accept(ModArtifacts.ARTIFACT_PREHISTORIC_SCAPULA.get());
                        output.accept(ModArtifacts.ARTIFACT_PREHISTORIC_SKULL.get());
                        output.accept(ModArtifacts.ARTIFACT_PREHISTORIC_TIBIA.get());
                        output.accept(ModArtifacts.ARTIFACT_PREHISTORIC_TOOL.get());
                        output.accept(ModArtifacts.ARTIFACT_PREHISTORIC_VERTEBRA.get());
                        output.accept(ModArtifacts.ARTIFACT_RARE_DISC.get());
                        output.accept(ModArtifacts.ARTIFACT_RUSTY_COG.get());
                        output.accept(ModArtifacts.ARTIFACT_RUSTY_SPOON.get());
                        output.accept(ModArtifacts.ARTIFACT_RUSTY_SPUR.get());
                        output.accept(ModArtifacts.ARTIFACT_SKELETAL_HAND.get());
                        output.accept(ModArtifacts.ARTIFACT_SKELETAL_TAIL.get());
                        output.accept(ModArtifacts.ARTIFACT_STRANGE_DOLL_GREEN.get());
                        output.accept(ModArtifacts.ARTIFACT_STRANGE_DOLL_RED.get());
                        output.accept(ModArtifacts.ARTIFACT_TRILOBITE.get());
                    })
                    .build());

    public static RegistryObject<CreativeModeTab> STARDEW_TAB = CREATIVE_MODE_TABS.register("stardewtab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModArtifacts.ARTIFACT_CHICKEN_STATUE.get()))
                    .title(Component.translatable("itemGroup.stardewtab"))
                    .displayItems((displayParams, output) -> {
                        output.accept(ModArtifacts.ARTIFACT_LOST_BOOK.get());
                        output.accept(ModBlocks.CRYSTALARIUM.get());
                        output.accept(ModBlocks.SCARECROW.get());
                    })
                    .build());
   public static RegistryObject<CreativeModeTab> MINERALS_TAB = CREATIVE_MODE_TABS.register("mineralstab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModMinerals.QUARTZ.get()))
                    .title(Component.translatable("itemGroup.mineralstab"))
                    .displayItems((displayParams, output) -> {
                        output.accept(ModMinerals.AERINITE.get());
                        output.accept(ModMinerals.ALAMITE.get());
                        output.accept(ModMinerals.AMETHYST.get());
                        output.accept(ModMinerals.AQUAMARINE.get());
                        output.accept(ModMinerals.BARYTE.get());
                        output.accept(ModMinerals.BASALT.get());
                        output.accept(ModMinerals.BIXITE.get());
                        output.accept(ModMinerals.CALCITE.get());
                        output.accept(ModMinerals.CELESTINE.get());
                        output.accept(ModMinerals.DIAMOND.get());
                        output.accept(ModMinerals.DOLOMITE.get());
                        output.accept(ModMinerals.EARTH_CRYSTAL.get());
                        output.accept(ModMinerals.EMERALD.get());
                        output.accept(ModMinerals.ESPERITE.get());
                        output.accept(ModMinerals.FAIRY_STONE.get());
                        output.accept(ModMinerals.FIRE_OPAL.get());
                        output.accept(ModMinerals.FIRE_QUARTZ.get());
                        output.accept(ModMinerals.FLUORAPATITE.get());
                        output.accept(ModMinerals.FROZEN_TEAR.get());
                        output.accept(ModMinerals.GEMINITE.get());
                        output.accept(ModMinerals.GHOST_CRYSTAL.get());
                        output.accept(ModMinerals.GRANITE.get());
                        output.accept(ModMinerals.HELVITE.get());
                        output.accept(ModMinerals.HEMATITE.get());
                        output.accept(ModMinerals.JADE.get());
                        output.accept(ModMinerals.JAGOITE.get());
                        output.accept(ModMinerals.JAMBORITE.get());
                        output.accept(ModMinerals.JASPER.get());
                        output.accept(ModMinerals.KYANITE.get());
                        output.accept(ModMinerals.LEMON_STONE.get());
                        output.accept(ModMinerals.LIMESTONE.get());
                        output.accept(ModMinerals.LUNARITE.get());
                        output.accept(ModMinerals.MALACHITE.get());
                        output.accept(ModMinerals.MARBLE.get());
                        output.accept(ModMinerals.MUDSTONE.get());
                        output.accept(ModMinerals.NEKOITE.get());
                        output.accept(ModMinerals.NEPTUNITE.get());
                        output.accept(ModMinerals.OBSIDIAN.get());
                        output.accept(ModMinerals.OCEAN_STONE.get());
                        output.accept(ModMinerals.OPAL.get());
                        output.accept(ModMinerals.ORPIMENT.get());
                        output.accept(ModMinerals.PETRIFIED_SLIME.get());
                        output.accept(ModMinerals.PRISMATIC_SHARD.get());
                        output.accept(ModMinerals.PYRITE.get());
                        output.accept(ModMinerals.QUARTZ.get());
                        output.accept(ModMinerals.RUBY.get());
                        output.accept(ModMinerals.SANDSTONE.get());
                        output.accept(ModMinerals.SLATE.get());
                        output.accept(ModMinerals.SOAPSTONE.get());
                        output.accept(ModMinerals.STAR_SHARDS.get());
                        output.accept(ModMinerals.THUNDER_EGG.get());
                        output.accept(ModMinerals.TIGERSEYE.get());
                        output.accept(ModMinerals.TOPAZ.get());

                    })
                    .build());

    public static RegistryObject<CreativeModeTab> WEAPONS_TAB = CREATIVE_MODE_TABS.register("weaponstab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModWeapons.GALAXY_SWORD.get()))
                    .title(Component.translatable("itemGroup.weaponstab"))
                    .displayItems((displayParams, output) -> {
                        output.accept(ModWeapons.ABBYS_PLANCHETTE.get());
                        output.accept(ModWeapons.BONE_SWORD.get());
                        output.accept(ModWeapons.BROKEN_TRIDENT.get());
                        output.accept(ModWeapons.BURGLARS_SHANK.get());
                        output.accept(ModWeapons.CARVING_KNIFE.get());
                        output.accept(ModWeapons.CLAYMORE.get());
                        output.accept(ModWeapons.CRYSTAL_DAGGER.get());
                        output.accept(ModWeapons.DARK_SWORD.get());
                        output.accept(ModWeapons.DRAGONTOOTH_CLUB.get());
                        output.accept(ModWeapons.DRAGONTOOTH_CUTLASS.get());
                        output.accept(ModWeapons.DRAGONTOOTH_SHIV.get());
                        output.accept(ModWeapons.DWARF_HAMMER.get());
                        output.accept(ModWeapons.DWARF_SWORD.get());
                        output.accept(ModWeapons.ELF_BLADE.get());
                        output.accept(ModWeapons.ELLIOTS_PENCIL.get());
                        output.accept(ModWeapons.FEMUR.get());
                        output.accept(ModWeapons.FOREST_SWORD.get());
                        output.accept(ModWeapons.GALAXY_DAGGER.get());
                        output.accept(ModWeapons.GALAXY_SLINGSHOT.get());
                        output.accept(ModWeapons.GALAXY_SWORD.get());
                        output.accept(ModWeapons.GOLDEN_SCYTHE.get());
                        output.accept(ModWeapons.HARVEYS_MALLET.get());
                        output.accept(ModWeapons.HOLY_BLADE.get());
                        output.accept(ModWeapons.INFINITY_BLADE.get());
                        output.accept(ModWeapons.INFINITY_DAGGER.get());
                        output.accept(ModWeapons.INFINITY_GAVEL.get());
                        output.accept(ModWeapons.INSECT_HEAD.get());
                        output.accept(ModWeapons.IRON_DIRK.get());
                        output.accept(ModWeapons.IRON_EDGE.get());
                        output.accept(ModWeapons.IRIDIUM_NEEDLE.get());
                        output.accept(ModWeapons.LAVA_KATANA.get());
                        output.accept(ModWeapons.LEAHS_WHITTLER.get());
                        output.accept(ModWeapons.MARUS_WRENCH.get());
                        output.accept(ModWeapons.MASTER_SLINGSHOT.get());
                        output.accept(ModWeapons.NEPTUNES_GLAIVE.get());
                        output.accept(ModWeapons.OBSIDIAN_EDGE.get());
                        output.accept(ModWeapons.OSSIFIED_BLADE.get());
                        output.accept(ModWeapons.PENNYS_FRYER.get());
                        output.accept(ModWeapons.RAPIER.get());
                        output.accept(ModWeapons.RUSTY_SWORD.get());
                        output.accept(ModWeapons.SHADOW_DAGGER.get());
                        output.accept(ModWeapons.SILVER_SABER.get());
                        output.accept(ModWeapons.SLINGSHOT.get());
                        output.accept(ModWeapons.STEEL_FALCHION.get());
                        output.accept(ModWeapons.STEEL_SMALLSWORD.get());
                        output.accept(ModWeapons.TEMPLARS_BLADE.get());
                        output.accept(ModWeapons.TEMPERED_BROADSWORD.get());
                        output.accept(ModWeapons.WIND_SPIRE.get());
                        output.accept(ModWeapons.WOODEN_BLADE.get());
                        output.accept(ModWeapons.YETI_TOOTH.get());

                    })
                    .build());

    public static RegistryObject<CreativeModeTab> TOOLS_TAB = CREATIVE_MODE_TABS.register("toolstab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack((ModTools.COPPER_AXE.get())))
                    .title(Component.translatable("itemGroup.toolstab"))
                    .displayItems((displayParams, output) -> {
                        output.accept(ModTools.AXE.get());
                        output.accept(ModTools.COPPER_AXE.get());
                        output.accept(ModTools.GOLD_AXE.get());
                        output.accept(ModTools.IRIDIUM_AXE.get());
                        output.accept(ModTools.STEEL_AXE.get());
                        output.accept(ModTools.COPPER_PAN.get());
                        output.accept(ModTools.BAMBOO_POLE.get());
                        output.accept(ModTools.FIBERGLASS_ROD.get());
                        output.accept(ModTools.IRIDIUM_ROD.get());
                        output.accept(ModTools.TRAINING_ROD.get());
                        output.accept(ModTools.HOE.get());
                        output.accept(ModTools.COPPER_HOE.get());
                        output.accept(ModTools.GOLD_HOE.get());
                        output.accept(ModTools.IRIDIUM_HOE.get());
                        output.accept(ModTools.STEEL_HOE.get());
                        output.accept(ModTools.MILK_PAIL.get());
                        output.accept(ModTools.COPPER_PICKAXE.get());
                        output.accept(ModTools.GOLD_PICKAXE.get());
                        output.accept(ModTools.IRIDIUM_PICKAXE.get());
                        output.accept(ModTools.PICKAXE.get());
                        output.accept(ModTools.STEEL_PICKAXE.get());
                        output.accept(ModTools.SCYTHE.get());
                        output.accept(ModTools.SHEARS.get());
                        output.accept(ModTools.COPPER_TRASH_CAN.get());
                        output.accept(ModTools.GOLD_TRASH_CAN.get());
                        output.accept(ModTools.IRIDIUM_TRASH_CAN.get());
                        output.accept(ModTools.STEEL_TRASH_CAN.get());
                        output.accept(ModTools.COPPER_WATERING_CAN.get());
                        output.accept(ModTools.GOLD_WATERING_CAN.get());
                        output.accept(ModTools.IRIDIUM_WATERING_CAN.get());
                        output.accept(ModTools.STEEL_WATERING_CAN.get());
                        output.accept(ModTools.WATERING_CAN.get());
                    })
                    .build());
    public static RegistryObject<CreativeModeTab> CROPS_TAB = CREATIVE_MODE_TABS.register("cropstab", () ->
            CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModCrops.CAULIFLOWER.get()))
                    .title(Component.translatable("itemGroup.cropstab"))
                    .displayItems((displayParams, output) -> {
                        output.accept(ModCrops.CAULIFLOWER.get());
                        output.accept(ModCrops.CAULIFLOWER_SEEDS.get());
                        output.accept(ModCrops.PARSNIP.get());
                        output.accept(ModCrops.PARSNIP_SEEDS.get());
                    })
                    .build());



//        public static final CreativeModeTab STARDEW_TAB = new CreativeModeTab("stardewtab") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModArtifacts.ARTIFACT_CHICKEN_STATUE.get());
//        }
//        @Override
//        public void fillItemList(NonNullList<ItemStack> items) {
//            super.fillItemList(items);
//            items.sort(Comparator.comparing(e -> e.getDisplayName().getString()));
//        }
//    };
//    public static final CreativeModeTab ARTIFACTS_TAB = new CreativeModeTab("artifactstab") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModArtifacts.ARTIFACT_LOST_BOOK.get());
//        }
//        @Override
//        public void fillItemList(NonNullList<ItemStack> items) {
//            super.fillItemList(items);
//            items.sort(Comparator.comparing(e -> e.getDisplayName().getString()));
//        }
//    };
//    public static final CreativeModeTab MINERALS_TAB = new CreativeModeTab("mineralstab") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModMinerals.QUARTZ.get());
//        }
//        @Override
//        public void fillItemList(NonNullList<ItemStack> items) {
//            super.fillItemList(items);
//            items.sort(Comparator.comparing(e -> e.getDisplayName().getString()));
//        }
//    };
//    public static final CreativeModeTab WEAPONS_TAB = new CreativeModeTab("weaponstab") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModWeapons.GALAXY_SWORD.get());
//        }
//        @Override
//        public void fillItemList(NonNullList<ItemStack> items) {
//            super.fillItemList(items);
//            items.sort(Comparator.comparing(e -> e.getDisplayName().getString()));
//        }
//    };
//    public static final CreativeModeTab CROPS_TAB = new CreativeModeTab("cropstab") {
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(ModCrops.CAULIFLOWER.get());
//        }
//        @Override
//        public void fillItemList(NonNullList<ItemStack> items) {
//            super.fillItemList(items);
//            items.sort(Comparator.comparing(e -> e.getDisplayName().getString()));
//         }
//   };



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
//
}