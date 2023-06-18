package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.item.custom.MineralItem;
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
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A clear crystal commonly found in caves and mines."));

    public static final RegistryObject<Item> SLATE = ITEMS.register("mineral_slate",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "It's extremely resistant to water, making it a good roofing material."));

    public static final RegistryObject<Item> FAIRY_STONE = ITEMS.register("mineral_fairy_stone",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "An old miner's song suggests these are made from the bones of ancient fairies."));

    public static final RegistryObject<Item> STAR_SHARDS = ITEMS.register("mineral_star_shards",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "No one knows how these form. Some scientists claim that the microscopic structure" +
                            " displays unnatural regularity."));

    public static final RegistryObject<Item> OBSIDIAN = ITEMS.register("mineral_obsidian",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A volcanic glass that forms when lava cools rapidly."));

    public static final RegistryObject<Item> MUDSTONE = ITEMS.register("mineral_mudstone",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A fine-grained rock made from ancient clay or mud."));

    public static final RegistryObject<Item> HEMATITE = ITEMS.register("mineral_hematite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "An iron-based Mineral with interesting magnetic properties."));

    public static final RegistryObject<Item> SOAPSTONE = ITEMS.register("mineral_soapstone",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Because of its relatively soft consistency, this stone is very popular for carving."));

    public static final RegistryObject<Item> LIMESTONE = ITEMS.register("mineral_limestone",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A very common type of stone. It's not worth very much."));

    public static final RegistryObject<Item> BASALT = ITEMS.register("mineral_basalt",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Forms near searing hot magma."));

    public static final RegistryObject<Item> GRANITE = ITEMS.register("mineral_granite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A speckled Mineral that is commonly used in construction."));

    public static final RegistryObject<Item> SANDSTONE = ITEMS.register("mineral_sandstone",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A common type of stone with red and brown striations."));

    public static final RegistryObject<Item> MARBLE = ITEMS.register("mineral_marble",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A very popular material for sculptures and construction."));

    public static final RegistryObject<Item> CELESTINE = ITEMS.register("mineral_celestine",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Some early life forms had bones made from this."));

    public static final RegistryObject<Item> ORPIMENT = ITEMS.register("mineral_orpiment",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Despite its high toxicity, this Mineral is widely used in manufacturing and folk medicine."));

    public static final RegistryObject<Item> PETRIFIED_SLIME = ITEMS.register("mineral_petrified_slime",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "This little guy may be 100,000 years old."));

    public static final RegistryObject<Item> THUNDER_EGG = ITEMS.register("mineral_thunder_egg",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "According to legend, angry thunder spirits would throw these stones at one another."));

    public static final RegistryObject<Item> PYRITE = ITEMS.register("mineral_pyrite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Commonly known as \"Fool's Gold\"."));

    public static final RegistryObject<Item> OCEAN_STONE = ITEMS.register("mineral_ocean_stone",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "An old legend claims these stones are the mosaics of ancient mermaids."));

    public static final RegistryObject<Item> GHOST_CRYSTAL = ITEMS.register("mineral_ghost_crystal",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "There is an aura of coldness around this crystal."));

    public static final RegistryObject<Item> TIGERSEYE = ITEMS.register("mineral_tigerseye",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A stripe of shimmering gold gives this gem a warm luster."));

    public static final RegistryObject<Item> JASPER = ITEMS.register("mineral_jasper",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "When polished, this stone becomes attractively luminous. Prized by ancient peoples" +
                            " for thousands of years."));

    public static final RegistryObject<Item> OPAL = ITEMS.register("mineral_opal",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Its internal structure causes it to reflect a rainbow of light."));

    public static final RegistryObject<Item> FIRE_OPAL = ITEMS.register("mineral_fire_opal",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A rare variety of opal, named for its red spots."));

    public static final RegistryObject<Item> NEKOITE = ITEMS.register("mineral_nekoite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "The delicate shards form a tiny pink meadow."));

    public static final RegistryObject<Item> LEMON_STONE = ITEMS.register("mineral_lemon_stone",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Some claim the powdered crystal is a dwarvish delicacy."));

    public static final RegistryObject<Item> NEPTUNITE = ITEMS.register("mineral_neptunite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A jet-black crystal that is unusually reflective."));

    public static final RegistryObject<Item> MALACHITE = ITEMS.register("mineral_malachite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A popular ornamental stone, used in sculpture and to make green paint."));

    public static final RegistryObject<Item> LUNARITE = ITEMS.register("mineral_lunarite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "The cratered white orbs form a tight cluster."));

    public static final RegistryObject<Item> KYANITE = ITEMS.register("mineral_kyanite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "The geometric faces are as smooth as glass."));

    public static final RegistryObject<Item> JAGOITE = ITEMS.register("mineral_jagoite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A high volume of tiny crystals makes it very glittery."));

    public static final RegistryObject<Item> JAMBORITE = ITEMS.register("mineral_jamborite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "The crystals are so tightly packed it almost looks fuzzy."));

    public static final RegistryObject<Item> HELVITE = ITEMS.register("mineral_helvite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "It grows in a triangular column."));

    public static final RegistryObject<Item> GEMINITE = ITEMS.register("mineral_geminite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Occurs in brilliant clusters."));

    public static final RegistryObject<Item> FROZEN_TEAR = ITEMS.register("mineral_frozen_tear",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A crystal fabled to be the frozen tears of a yeti."));

    public static final RegistryObject<Item> EARTH_CRYSTAL = ITEMS.register("mineral_earth_crystal",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A resinous substance found near the surface."));

    public static final RegistryObject<Item> ALAMITE = ITEMS.register("mineral_alamite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Its distinctive fluorescence makes it a favorite among rock collectors."));

    public static final RegistryObject<Item> BIXITE = ITEMS.register("mineral_bixite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A dark metallic Mineral sought after for its cubic structure."));

    public static final RegistryObject<Item> BARYTE = ITEMS.register("mineral_baryte",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "The best specimens resemble a desert rose."));

    public static final RegistryObject<Item> AERINITE = ITEMS.register("mineral_aerinite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "These crystals are curiously light."));

    public static final RegistryObject<Item> CALCITE = ITEMS.register("mineral_calcite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "This yellow crystal is speckled with shimmering nodules."));

    public static final RegistryObject<Item> DOLOMITE = ITEMS.register("mineral_dolomite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "It can occur in coral reefs, often near an underwater volcano."));

    public static final RegistryObject<Item> ESPERITE = ITEMS.register("mineral_esperite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "The crystals glow bright green when stimulated."));

    public static final RegistryObject<Item> FLUORAPATITE = ITEMS.register("mineral_fluorapatite",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Small amounts are found in human teeth."));

    public static final RegistryObject<Item> FIRE_QUARTZ = ITEMS.register("mineral_fire_quartz",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A glowing red crystal commonly found near hot lava."));

    public static final RegistryObject<Item> PRISMATIC_SHARD = ITEMS.register("mineral_prismatic_shard",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A very rare and powerful substance with unknown origins."));

    public static final RegistryObject<Item> DIAMOND = ITEMS.register("mineral_diamond",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A rare and valuable gem."));

    public static final RegistryObject<Item> JADE = ITEMS.register("mineral_jade",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A pale green ornamental stone."));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("mineral_topaz",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "Fairly common but still prized for its beauty."));

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("mineral_amethyst",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A purple variant of quartz."));

    public static final RegistryObject<Item> RUBY = ITEMS.register("mineral_ruby",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A precious stone that is sought after for its rich color and beautiful luster."));

    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("mineral_aquamarine",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A shimmery blue-green gem."));

    public static final RegistryObject<Item> EMERALD = ITEMS.register("mineral_emerald",
            () -> new MineralItem(new Item.Properties().tab(ModCreativeModeTab.MINERALS_TAB),
                    "A precious stone with a brilliant green color."));

    public static void  register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
