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
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MOD_ID);

    /*

        Minerals

     */

    public static final RegistryObject<Item> QUARTZ = ITEMS.register("quartz",
            () -> new MineralItem(new Item.Properties(),
                    "A clear crystal commonly found in caves and mines."));

    public static final RegistryObject<Item> SLATE = ITEMS.register("slate",
            () -> new MineralItem(new Item.Properties(),
                    "It's extremely resistant to water, making it a good roofing material."));

    public static final RegistryObject<Item> FAIRY_STONE = ITEMS.register("fairy_stone",
            () -> new MineralItem(new Item.Properties(),
                    "An old miner's song suggests these are made from the bones of ancient fairies."));

    public static final RegistryObject<Item> STAR_SHARDS = ITEMS.register("star_shards",
            () -> new MineralItem(new Item.Properties(),
                    "No one knows how these form. Some scientists claim that the microscopic structure" +
                            " displays unnatural regularity."));

    public static final RegistryObject<Item> OBSIDIAN = ITEMS.register("obsidian",
            () -> new MineralItem(new Item.Properties(),
                    "A volcanic glass that forms when lava cools rapidly."));

    public static final RegistryObject<Item> MUDSTONE = ITEMS.register("mudstone",
            () -> new MineralItem(new Item.Properties(),
                    "A fine-grained rock made from ancient clay or mud."));

    public static final RegistryObject<Item> HEMATITE = ITEMS.register("hematite",
            () -> new MineralItem(new Item.Properties(),
                    "An iron-based Mineral with interesting magnetic properties."));

    public static final RegistryObject<Item> SOAPSTONE = ITEMS.register("soapstone",
            () -> new MineralItem(new Item.Properties(),
                    "Because of its relatively soft consistency, this stone is very popular for carving."));

    public static final RegistryObject<Item> LIMESTONE = ITEMS.register("limestone",
            () -> new MineralItem(new Item.Properties(),
                    "A very common type of stone. It's not worth very much."));

    public static final RegistryObject<Item> BASALT = ITEMS.register("basalt",
            () -> new MineralItem(new Item.Properties(),
                    "Forms near searing hot magma."));

    public static final RegistryObject<Item> GRANITE = ITEMS.register("granite",
            () -> new MineralItem(new Item.Properties(),
                    "A speckled Mineral that is commonly used in construction."));

    public static final RegistryObject<Item> SANDSTONE = ITEMS.register("sandstone",
            () -> new MineralItem(new Item.Properties(),
                    "A common type of stone with red and brown striations."));

    public static final RegistryObject<Item> MARBLE = ITEMS.register("marble",
            () -> new MineralItem(new Item.Properties(),
                    "A very popular material for sculptures and construction."));

    public static final RegistryObject<Item> CELESTINE = ITEMS.register("celestine",
            () -> new MineralItem(new Item.Properties(),
                    "Some early life forms had bones made from this."));

    public static final RegistryObject<Item> ORPIMENT = ITEMS.register("orpiment",
            () -> new MineralItem(new Item.Properties(),
                    "Despite its high toxicity, this Mineral is widely used in manufacturing and folk medicine."));

    public static final RegistryObject<Item> PETRIFIED_SLIME = ITEMS.register("petrified_slime",
            () -> new MineralItem(new Item.Properties(),
                    "This little guy may be 100,000 years old."));

    public static final RegistryObject<Item> THUNDER_EGG = ITEMS.register("thunder_egg",
            () -> new MineralItem(new Item.Properties(),
                    "According to legend, angry thunder spirits would throw these stones at one another."));

    public static final RegistryObject<Item> PYRITE = ITEMS.register("pyrite",
            () -> new MineralItem(new Item.Properties(),
                    "Commonly known as \"Fool's Gold\"."));

    public static final RegistryObject<Item> OCEAN_STONE = ITEMS.register("ocean_stone",
            () -> new MineralItem(new Item.Properties(),
                    "An old legend claims these stones are the mosaics of ancient mermaids."));

    public static final RegistryObject<Item> GHOST_CRYSTAL = ITEMS.register("ghost_crystal",
            () -> new MineralItem(new Item.Properties(),
                    "There is an aura of coldness around this crystal."));

    public static final RegistryObject<Item> TIGERSEYE = ITEMS.register("tigerseye",
            () -> new MineralItem(new Item.Properties(),
                    "A stripe of shimmering gold gives this gem a warm luster."));

    public static final RegistryObject<Item> JASPER = ITEMS.register("jasper",
            () -> new MineralItem(new Item.Properties(),
                    "When polished, this stone becomes attractively luminous. Prized by ancient peoples" +
                            " for thousands of years."));

    public static final RegistryObject<Item> OPAL = ITEMS.register("opal",
            () -> new MineralItem(new Item.Properties(),
                    "Its internal structure causes it to reflect a rainbow of light."));

    public static final RegistryObject<Item> FIRE_OPAL = ITEMS.register("fire_opal",
            () -> new MineralItem(new Item.Properties(),
                    "A rare variety of opal, named for its red spots."));

    public static final RegistryObject<Item> NEKOITE = ITEMS.register("nekoite",
            () -> new MineralItem(new Item.Properties(),
                    "The delicate shards form a tiny pink meadow."));

    public static final RegistryObject<Item> LEMON_STONE = ITEMS.register("lemon_stone",
            () -> new MineralItem(new Item.Properties(),
                    "Some claim the powdered crystal is a dwarvish delicacy."));

    public static final RegistryObject<Item> NEPTUNITE = ITEMS.register("neptunite",
            () -> new MineralItem(new Item.Properties(),
                    "A jet-black crystal that is unusually reflective."));

    public static final RegistryObject<Item> MALACHITE = ITEMS.register("malachite",
            () -> new MineralItem(new Item.Properties(),
                    "A popular ornamental stone, used in sculpture and to make green paint."));

    public static final RegistryObject<Item> LUNARITE = ITEMS.register("lunarite",
            () -> new MineralItem(new Item.Properties(),
                    "The cratered white orbs form a tight cluster."));

    public static final RegistryObject<Item> KYANITE = ITEMS.register("kyanite",
            () -> new MineralItem(new Item.Properties(),
                    "The geometric faces are as smooth as glass."));

    public static final RegistryObject<Item> JAGOITE = ITEMS.register("jagoite",
            () -> new MineralItem(new Item.Properties(),
                    "A high volume of tiny crystals makes it very glittery."));

    public static final RegistryObject<Item> JAMBORITE = ITEMS.register("jamborite",
            () -> new MineralItem(new Item.Properties(),
                    "The crystals are so tightly packed it almost looks fuzzy."));

    public static final RegistryObject<Item> HELVITE = ITEMS.register("helvite",
            () -> new MineralItem(new Item.Properties(),
                    "It grows in a triangular column."));

    public static final RegistryObject<Item> GEMINITE = ITEMS.register("geminite",
            () -> new MineralItem(new Item.Properties(),
                    "Occurs in brilliant clusters."));

    public static final RegistryObject<Item> FROZEN_TEAR = ITEMS.register("frozen_tear",
            () -> new MineralItem(new Item.Properties(),
                    "A crystal fabled to be the frozen tears of a yeti."));

    public static final RegistryObject<Item> EARTH_CRYSTAL = ITEMS.register("earth_crystal",
            () -> new MineralItem(new Item.Properties(),
                    "A resinous substance found near the surface."));

    public static final RegistryObject<Item> ALAMITE = ITEMS.register("alamite",
            () -> new MineralItem(new Item.Properties(),
                    "Its distinctive fluorescence makes it a favorite among rock collectors."));

    public static final RegistryObject<Item> BIXITE = ITEMS.register("bixite",
            () -> new MineralItem(new Item.Properties(),
                    "A dark metallic Mineral sought after for its cubic structure."));

    public static final RegistryObject<Item> BARYTE = ITEMS.register("baryte",
            () -> new MineralItem(new Item.Properties(),
                    "The best specimens resemble a desert rose."));

    public static final RegistryObject<Item> AERINITE = ITEMS.register("aerinite",
            () -> new MineralItem(new Item.Properties(),
                    "These crystals are curiously light."));

    public static final RegistryObject<Item> CALCITE = ITEMS.register("calcite",
            () -> new MineralItem(new Item.Properties(),
                    "This yellow crystal is speckled with shimmering nodules."));

    public static final RegistryObject<Item> DOLOMITE = ITEMS.register("dolomite",
            () -> new MineralItem(new Item.Properties(),
                    "It can occur in coral reefs, often near an underwater volcano."));

    public static final RegistryObject<Item> ESPERITE = ITEMS.register("esperite",
            () -> new MineralItem(new Item.Properties(),
                    "The crystals glow bright green when stimulated."));

    public static final RegistryObject<Item> FLUORAPATITE = ITEMS.register("fluorapatite",
            () -> new MineralItem(new Item.Properties(),
                    "Small amounts are found in human teeth."));

    public static final RegistryObject<Item> FIRE_QUARTZ = ITEMS.register("fire_quartz",
            () -> new MineralItem(new Item.Properties(),
                    "A glowing red crystal commonly found near hot lava."));

    public static final RegistryObject<Item> PRISMATIC_SHARD = ITEMS.register("prismatic_shard",
            () -> new MineralItem(new Item.Properties(),
                    "A very rare and powerful substance with unknown origins."));

    public static final RegistryObject<Item> DIAMOND = ITEMS.register("diamond",
            () -> new MineralItem(new Item.Properties(),
                    "A rare and valuable gem."));

    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new MineralItem(new Item.Properties(),
                    "A pale green ornamental stone."));

    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new MineralItem(new Item.Properties(),
                    "Fairly common but still prized for its beauty."));

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new MineralItem(new Item.Properties(),
                    "A purple variant of quartz."));

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new MineralItem(new Item.Properties(),
                    "A precious stone that is sought after for its rich color and beautiful luster."));

    public static final RegistryObject<Item> AQUAMARINE = ITEMS.register("aquamarine",
            () -> new MineralItem(new Item.Properties(),
                    "A shimmery blue-green gem."));

    public static final RegistryObject<Item> EMERALD = ITEMS.register("emerald",
            () -> new MineralItem(new Item.Properties(),
                    "A precious stone with a brilliant green color."));

    public static final RegistryObject<Item> IRIDIUM_BAR = ITEMS.register("iridium_bar",
            () -> new MineralItem(new Item.Properties(),
                    "A bar of pure iridium."));


    public static void  register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
