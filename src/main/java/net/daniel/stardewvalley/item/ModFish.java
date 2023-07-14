package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.item.custom.FishItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModFish {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MOD_ID);

    public static final RegistryObject<Item> ANCHOVY = ITEMS.register("anchovy",
            () -> new FishItem(new Item.Properties(),
                    "A small silver fish found in the ocean."));
    public static final RegistryObject<Item> PUFFERFISH = ITEMS.register("pufferfish",
            () -> new FishItem(new Item.Properties(),
                    "Inflates when threatened."));

    // New fish below here
    public static final RegistryObject<Item> TUNA = ITEMS.register("tuna",
            () -> new FishItem(new Item.Properties(),
                    "A large fish that lives in the ocean."));
    public static final RegistryObject<Item> SARDINE = ITEMS.register("sardine",
            () -> new FishItem(new Item.Properties(),
                    "A common ocean fish."));
    public static final RegistryObject<Item> BREAM = ITEMS.register("bream",
            () -> new FishItem(new Item.Properties(),
                    "A fairly common river fish that becomes active at night."));
    public static final RegistryObject<Item> LARGEMOUTH_BASS = ITEMS.register("largemouth_bass",
            () -> new FishItem(new Item.Properties(),
                    "A popular fish that lives in lakes."));
    public static final RegistryObject<Item> SMALLMOUTH_BASS = ITEMS.register("smallmouth_bass",
            () -> new FishItem(new Item.Properties(),
                    "A freshwater fish that is very sensitive to pollution."));
    public static final RegistryObject<Item> RAINBOW_TROUT = ITEMS.register("rainbow_trout",
            () -> new FishItem(new Item.Properties(),
                    "A freshwater trout with colorful markings."));
    public static final RegistryObject<Item> SALMON = ITEMS.register("salmon",
            () -> new FishItem(new Item.Properties(),
                    "Swims upstream to lay its eggs."));
    public static final RegistryObject<Item> WALLEYE = ITEMS.register("walleye",
            () -> new FishItem(new Item.Properties(),
                    "A freshwater fish caught at night."));
    public static final RegistryObject<Item> PERCH = ITEMS.register("perch",
            () -> new FishItem(new Item.Properties(),
                    "A freshwater fish of the winter."));
    public static final RegistryObject<Item> CARP = ITEMS.register("carp",
            () -> new FishItem(new Item.Properties(),
                    "A common pond fish."));
    public static final RegistryObject<Item> CATFISH = ITEMS.register("catfish",
            () -> new FishItem(new Item.Properties(),
                    "An uncommon fish found in streams."));
    public static final RegistryObject<Item> PIKE = ITEMS.register("pike",
            () -> new FishItem(new Item.Properties(),
                    "A freshwater fish that's difficult to catch."));
    public static final RegistryObject<Item> SUNFISH = ITEMS.register("sunfish",
            () -> new FishItem(new Item.Properties(),
                    "A common river fish."));
    public static final RegistryObject<Item> RED_MULLET = ITEMS.register("red_mullet",
            () -> new FishItem(new Item.Properties(),
                    "Long ago these were kept as pets."));
    public static final RegistryObject<Item> HERRING = ITEMS.register("herring",
            () -> new FishItem(new Item.Properties(),
                    "A common ocean fish."));
    public static final RegistryObject<Item> EEL = ITEMS.register("eel",
            () -> new FishItem(new Item.Properties(),
                    "A long, slippery little fish."));
    public static final RegistryObject<Item> OCTOPUS = ITEMS.register("octopus",
            () -> new FishItem(new Item.Properties(),
                    "A mysterious and intelligent creature."));
    public static final RegistryObject<Item> RED_SNAPPER = ITEMS.register("red_snapper",
            () -> new FishItem(new Item.Properties(),
                    "A popular fish with a nice red color."));
    public static final RegistryObject<Item> SQUID = ITEMS.register("squid",
            () -> new FishItem(new Item.Properties(),
                    "A deep sea creature that can grow to enormous size."));
    public static final RegistryObject<Item> SEA_CUCUMBER = ITEMS.register("sea_cucumber",
            () -> new FishItem(new Item.Properties(),
                    "A slippery, slimy creature found on the ocean floor."));
    public static final RegistryObject<Item> SUPER_CUCUMBER = ITEMS.register("super_cucumber",
            () -> new FishItem(new Item.Properties(),
                    "A rare, purple variety of sea cucumber."));
    public static final RegistryObject<Item> GHOSTFISH = ITEMS.register("ghostfish",
            () -> new FishItem(new Item.Properties(),
                    "A pale, blind fish found in underground lakes."));
    public static final RegistryObject<Item> STONEFISH = ITEMS.register("stonefish",
            () -> new FishItem(new Item.Properties(),
                    "A bizarre fish that's shaped like a brick."));
    public static final RegistryObject<Item> ICE_PIP = ITEMS.register("ice_pip",
            () -> new FishItem(new Item.Properties(),
                    "A rare fish that thrives in extremely cold conditions."));
    public static final RegistryObject<Item> LAVA_EEL = ITEMS.register("lava_eel",
            () -> new FishItem(new Item.Properties(),
                    "It can somehow survive in pools of red-hot lava."));
    public static final RegistryObject<Item> SANDFISH = ITEMS.register("sandfish",
            () -> new FishItem(new Item.Properties(),
                    "It tries to hid using camouflage."));
    public static final RegistryObject<Item> SCORPION_CARP = ITEMS.register("scorpion_carp",
            () -> new FishItem(new Item.Properties(),
                    "It's like a regular carp but with a sharp stinger."));
    public static final RegistryObject<Item> FLOUNDER = ITEMS.register("flounder",
            () -> new FishItem(new Item.Properties(),
                    "It lives on the bottom, so both eyes are on top of its head."));
    public static final RegistryObject<Item> MIDNIGHT_CARP = ITEMS.register("midnight_carp",
            () -> new FishItem(new Item.Properties(),
                    "This shy fish only feels comfortable at night."));
    public static final RegistryObject<Item> STURGEON = ITEMS.register("sturgeon",
            () -> new FishItem(new Item.Properties(),
                    "An ancient bottom-feeder with a dwindling population. Females can live up to 150 years."));
    public static final RegistryObject<Item> TIGER_TROUT = ITEMS.register("tiger_trout",
            () -> new FishItem(new Item.Properties(),
                    "A rare hybrid trout that cannot bear offspring of its own."));
    public static final RegistryObject<Item> BULLHEAD = ITEMS.register("bullhead",
            () -> new FishItem(new Item.Properties(),
                    "A relative of the catfish that eats a variety of foods off the lake bottom."));
    public static final RegistryObject<Item> TILAPIA = ITEMS.register("tilapia",
            () -> new FishItem(new Item.Properties(),
                    "A primarily vegetarian fish that prefers warm water."));
    public static final RegistryObject<Item> CHUB = ITEMS.register("chub",
            () -> new FishItem(new Item.Properties(),
                    "A common freshwater fish known for its voracious appetite."));
    public static final RegistryObject<Item> DORADO = ITEMS.register("dorado",
            () -> new FishItem(new Item.Properties(),
                    "A fierce carnivore with brilliant orange scales."));
    public static final RegistryObject<Item> ALBACORE = ITEMS.register("albacore",
            () -> new FishItem(new Item.Properties(),
                    "Prefers temperature \"edges\" where cool and warm water meet."));
    public static final RegistryObject<Item> SHAD = ITEMS.register("shad",
            () -> new FishItem(new Item.Properties(),
                    "Lives in a school at sea, but returns to the rivers to spawn."));
    public static final RegistryObject<Item> LINGCOD = ITEMS.register("lingcod",
            () -> new FishItem(new Item.Properties(),
                    "A fearsome predator that will eat almost anything it can cram into its mouth."));
    public static final RegistryObject<Item> HALIBUT = ITEMS.register("halibut",
            () -> new FishItem(new Item.Properties(),
                    "A flat fish that lives on the ocean floor."));
    public static final RegistryObject<Item> WOODSKIP = ITEMS.register("woodskip",
            () -> new FishItem(new Item.Properties(),
                    "A very sensitive fish that can only live in pools deep in the forest."));
    public static final RegistryObject<Item> VOID_SALMON = ITEMS.register("void_salmon",
            () -> new FishItem(new Item.Properties(),
                    "A salmon, twisted by void energy. The fresh meat is jet black, but rapidly turns pink when exposed to air."));
    public static final RegistryObject<Item> SLIMEJACK = ITEMS.register("slimejack",
            () -> new FishItem(new Item.Properties(),
                    "He's coated in a very thick layer of slime."));
    public static final RegistryObject<Item> STINGRAY = ITEMS.register("stingray",
            () -> new FishItem(new Item.Properties(),
                    "Despite having a toxic stinger, these fish are shy and prefer to avoid humans."));
    public static final RegistryObject<Item> LIONFISH = ITEMS.register("lionfish",
            () -> new FishItem(new Item.Properties(),
                    "An aggressive, predatory fish with venomous spines."));
    public static final RegistryObject<Item> BLUE_DISCUS = ITEMS.register("blue_discus",
            () -> new FishItem(new Item.Properties(),
                    "A brightly colored tropical fish that is popular in aquariums."));

    // Night Market Fish
    public static final RegistryObject<Item> MIDNIGHT_SQUID = ITEMS.register("midnight_squid",
            () -> new FishItem(new Item.Properties(),
                    "A strange and mysterious denizen of the ocean's twilight depths."));
    public static final RegistryObject<Item> SPOOK_FISH = ITEMS.register("spook_fish",
            () -> new FishItem(new Item.Properties(),
                    "The huge eyes can detect the faint silhouettes of prey."));
    public static final RegistryObject<Item> BLOBFISH = ITEMS.register("blobfish",
            () -> new FishItem(new Item.Properties(),
                    "This odd creature floats above the ocean floor, consuming any edible material in its path."));

    // -----------------

    // Legendary Fish
    public static final RegistryObject<Item> CRIMSONFISH = ITEMS.register("crimsonfish",
            () -> new FishItem(new Item.Properties(),
                    "Lives deep in the ocean but likes to lay its eggs in the warm summer water."));
    public static final RegistryObject<Item> ANGLER = ITEMS.register("angler",
            () -> new FishItem(new Item.Properties(),
                    "Uses a bioluminescent dangler to attract prey."));
    public static final RegistryObject<Item> LEGEND = ITEMS.register("legend",
            () -> new FishItem(new Item.Properties(),
                    "The king of all fish! They said he'd never be caught."));
    public static final RegistryObject<Item> GLACIERFISH = ITEMS.register("glacierfish",
            () -> new FishItem(new Item.Properties(),
                    "Builds a nest on the underside of glaciers."));
    public static final RegistryObject<Item> MUTANT_CARP = ITEMS.register("mutant_carp",
            () -> new FishItem(new Item.Properties(),
                    "The strange waters of the sewer turned this carp into a monstrosity."));
    // --------------

    // Legendary Fish II
    public static final RegistryObject<Item> SON_OF_CRIMSONFISH = ITEMS.register("son_of_crimsonfish",
            () -> new FishItem(new Item.Properties(),
                    "He hatched in the warm summer water, and followed in the footsteps of his father."));
    public static final RegistryObject<Item> MS_ANGLER = ITEMS.register("ms_angler",
            () -> new FishItem(new Item.Properties(),
                    "Uses a bioluminescent dangler to attract prey."));
    public static final RegistryObject<Item> LEGEND_II = ITEMS.register("legend_ii",
            () -> new FishItem(new Item.Properties(),
                    "The successor to the original Legend."));
    public static final RegistryObject<Item> GLACIERFISH_JR = ITEMS.register("glacierfish_jr",
            () -> new FishItem(new Item.Properties(),
                    "The original Glacierfish had a son..."));
    public static final RegistryObject<Item> RADIOACTIVE_CARP = ITEMS.register("radioactive_carp",
            () -> new FishItem(new Item.Properties(),
                    "A carp that spent one too many years in toxic sludge."));
    // -----------------
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
