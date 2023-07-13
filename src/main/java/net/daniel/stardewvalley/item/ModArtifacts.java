package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.item.custom.ArtifactItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModArtifacts {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MOD_ID);

    /*

            Artifacts

    */

    // Amphibian Fossil
    public static final RegistryObject<Item> AMPHIBIAN_FOSSIL = ITEMS.register("amphibian_fossil",
            () -> new ArtifactItem(new Item.Properties() ,
                    "The relatively short hind legs suggest some kind of primordial toad."
            ));

    // Anchor
    public static final RegistryObject<Item> ANCHOR = ITEMS.register("anchor",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It may have belonged to ancient pirates."));

    // Ancient Doll
    public static final RegistryObject<Item> ANCIENT_DOLL = ITEMS.register("ancient_doll",
            () -> new ArtifactItem(new Item.Properties() ,
                    "An ancient doll covered in grime. This doll may have been used as a toy, " +
                            "a decoration, or a prop in some kind of ritual."));


    // Ancient Drum
    public static final RegistryObject<Item> ANCIENT_DRUM = ITEMS.register("ancient_drum",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's a drum made from wood and animal skin. It has a low, reverberating tone."));


    // Ancient Seed
    public static final RegistryObject<Item> ANCIENT_SEED = ITEMS.register("ancient_seed",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's a dry old seed from some ancient plant. By all appearances it's long since dead..."));

    // Ancient Sword
    public static final RegistryObject<Item> ANCIENT_SWORD = ITEMS.register("ancient_sword",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's the remains of an ancient sword. Most of the blade has turned to rust, but the hilt" +
                            " is very finely crafted."));

    // Arrowhead
    public static final RegistryObject<Item> ARROWHEAD = ITEMS.register("arrowhead",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A crudely fashioned point used for hunting."));

    // Bone Flute
    public static final RegistryObject<Item> BONE_FLUTE = ITEMS.register("bone_flute",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's a prehistoric wind instrument carved from an animal's bone. It produces an eerie tone."));

    // Chewing Stick
    public static final RegistryObject<Item> CHEWING_STICK = ITEMS.register("chewing_stick",
            () -> new ArtifactItem(new Item.Properties() ,
                    "Ancient people chewed on these to keep their teeth clean."));

    // Chicken Statue
    public static final RegistryObject<Item> CHICKEN_STATUE = ITEMS.register("chicken_statue",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's a statue of a chicken on a bronze base. The ancient people of this area must have" +
                            " been very fond of chickens."));

    // Chipped Amphora
    public static final RegistryObject<Item> CHIPPED_AMPHORA = ITEMS.register("chipped_amphora",
            () -> new ArtifactItem(new Item.Properties() ,
                    "An ancient vessel made of ceramic material. Used to transport both dry and wet goods."));

    // Dinosaur Egg
    public static final RegistryObject<Item> DINOSAUR_EGG = ITEMS.register("dinosaur_egg",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A giant dino egg... The entire shell is still intact!"));

    // Dried Starfish
    public static final RegistryObject<Item> DRIED_STARFISH = ITEMS.register("dried_starfish",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A starfish from the primordial ocean. It's an unusually pristine specimen!"));

    // Dwarf Gadget
    public static final RegistryObject<Item> DWARF_GADGET = ITEMS.register("dwarf_gadget",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's a piece of the advanced technology once known to the dwarves. It's still glowing and" +
                            " humming, but you're unable to understand how it works.\t"));

    // Dwarf Scroll I
    public static final RegistryObject<Item> DWARF_SCROLL_1 = ITEMS.register("dwarf_scroll_1",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A yellowed scroll of parchment filled with dwarven script. This one's tied with a red bow."));

    // Dwarf Scroll II
    public static final RegistryObject<Item> DWARF_SCROLL_2 = ITEMS.register("dwarf_scroll_2",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A yellowed scroll of parchment filled with dwarven script. This one's tied with a green ribbon."));

    // Dwarf Scroll III
    public static final RegistryObject<Item> DWARF_SCROLL_3 = ITEMS.register("dwarf_scroll_3",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A yellowed scroll of parchment filled with dwarven script. This one's tied with a blue rope."));

    // Dwarf Scroll IV
    public static final RegistryObject<Item> DWARF_SCROLL_4 = ITEMS.register("dwarf_scroll_4",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A yellowed scroll of parchment filled with dwarven script. This one's tied with a golden chain."));

    // Dwarvish Helm
    public static final RegistryObject<Item> DWARVISH_HELM = ITEMS.register("dwarvish_helm",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's one of the helmets commonly worn by dwarves. The thick metal plating protects them" +
                            " from falling debris and stalactites."));

    // Elvish Jewelry
    public static final RegistryObject<Item> ELVISH_JEWELRY = ITEMS.register("elvish_jewelry",
            () -> new ArtifactItem(new Item.Properties() ,
                    "Dirty but still beautiful. On the side is a flowing script thought by some to be the " +
                            "ancient language of the elves. No Elvish bones have ever been found."));

    // Glass Shards
    public static final RegistryObject<Item> GLASS_SHARDS = ITEMS.register("glass_shards",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A mixture of glass shards smoothed by centuries of ocean surf. These could have belonged" +
                            " to an ancient mosaic or necklace."));

    // Golden Mask
    public static final RegistryObject<Item> GOLDEN_MASK = ITEMS.register("golden_mask",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A creepy golden mask probably used in an ancient magic ritual. A socket in the forehead" +
                            " contains a large purple gemstone."));

    // Golden Relic
    public static final RegistryObject<Item> GOLDEN_RELIC = ITEMS.register("golden_relic",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's a golden slab with hieroglyphs and pictures emblazoned onto the front."));

    // Lost Book
    public static final RegistryObject<Item> LOST_BOOK = ITEMS.register("lost_book",
            () -> new Item(new Item.Properties()));

    // Nautilus Fossil
    public static final RegistryObject<Item> NAUTILUS_FOSSIL = ITEMS.register("nautilus_fossil",
            () -> new ArtifactItem(new Item.Properties() ,
                    "This must've washed up ages ago from an ancient coral reef."));

    // Ornamental Fan
    public static final RegistryObject<Item> ORNAMENTAL_FAN = ITEMS.register("ornamental_fan",
            () -> new ArtifactItem(new Item.Properties() ,
                    "This exquisite fan most likely belonged to a noblewoman. Historians believe that the" +
                            " valley was a popular sixth-era vacation spot for the wealthy."));

    // Palm Fossil
    public static final RegistryObject<Item> PALM_FOSSIL = ITEMS.register("palm_fossil",
            () -> new ArtifactItem(new Item.Properties() ,
                    "Palm Fossils are relatively common, but this happens to be a particularly well-preserved specimen."));

    // Prehistoric Handaxe
    public static final RegistryObject<Item> PREHISTORIC_HANDAXE = ITEMS.register("prehistoric_handaxe",
            () -> new ArtifactItem(new Item.Properties() ,
                    "One of the earliest tools employed by humans. This \"crude\" tool was created by" +
                            " striking one rock with another to form a sharp edge."));

    // Prehistoric Rib
    public static final RegistryObject<Item> PREHISTORIC_RIB = ITEMS.register("prehistoric_rib",
            () -> new ArtifactItem(new Item.Properties() ,
                    "Little gouge marks on the side suggest that this rib was someone's dinner."));

    // Prehistoric Scapula
    public static final RegistryObject<Item> PREHISTORIC_SCAPULA = ITEMS.register("prehistoric_scapula",
            () -> new ArtifactItem(new Item.Properties() ,
                    "Commonly known as a \"shoulder blade\"... It's unclear what species it belonged to."));

    // Prehistoric Skull
    public static final RegistryObject<Item> PREHISTORIC_SKULL = ITEMS.register("prehistoric_skull",
            () -> new ArtifactItem(new Item.Properties() ,
                    "This is definitely a mammalian skull."));

    // Prehistoric Tibia
    public static final RegistryObject<Item> PREHISTORIC_TIBIA = ITEMS.register("prehistoric_tibia",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A thick and sturdy leg bone."));

    // Prehistoric Tool
    public static final RegistryObject<Item> PREHISTORIC_TOOL = ITEMS.register("prehistoric_tool",
            () -> new ArtifactItem(new Item.Properties() ,
                    "Some kind of gnarly old digging tool."));

    // Prehistoric Vertebra
    public static final RegistryObject<Item> PREHISTORIC_VERTEBRA = ITEMS.register("prehistoric_vertebra",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A segment of some prehistoric creature's spine."));

    // Rare Disc
    public static final RegistryObject<Item> RARE_DISC = ITEMS.register("rare_disc",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A heavy black disc studded with peculiar red stones. When you hold it, you're" +
                            " overwhelmed with a feeling of dread."));

    // Rusty Cog
    public static final RegistryObject<Item> RUSTY_COG = ITEMS.register("rusty_cog",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A well preserved cog that must have been part of some ancient machine. This could be dwarven technology."));

    // Rusty Spoon
    public static final RegistryObject<Item> RUSTY_SPOON = ITEMS.register("rusty_spoon",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A plain old spoon, probably ten years old. Not very interesting."));

    // Rusty Spur
    public static final RegistryObject<Item> RUSTY_SPUR = ITEMS.register("rusty_spur",
            () -> new ArtifactItem(new Item.Properties() ,
                    "An old spur that was once attached to a cowboy's boot. People must have been raising" +
                            " animals in this area for many generations."));

    // Skeletal Hand
    public static final RegistryObject<Item> SKELETAL_HAND = ITEMS.register("skeletal_hand",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's a wonder all these ancient little pieces lasted so long."));

    // Skeletal Tail
    public static final RegistryObject<Item> SKELETAL_TAIL = ITEMS.register("skeletal_tail",
            () -> new ArtifactItem(new Item.Properties() ,
                    "It's pretty short for a tail."));

    // Strange Doll Green
    public static final RegistryObject<Item> STRANGE_DOLL_GREEN = ITEMS.register("strange_doll_green",
            () -> new ArtifactItem(new Item.Properties() ,
                    "???"));

    // Strange Doll Red
    public static final RegistryObject<Item> STRANGE_DOLL_RED = ITEMS.register("strange_doll_red",
            () -> new ArtifactItem(new Item.Properties() ,
                    "???"));

    // Trilobite
    public static final RegistryObject<Item> TRILOBITE = ITEMS.register("trilobite",
            () -> new ArtifactItem(new Item.Properties() ,
                    "A long extinct relative of the crab."));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}