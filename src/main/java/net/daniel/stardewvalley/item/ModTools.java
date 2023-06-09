package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.ModTiers;
import net.daniel.stardewvalley.StardewValley;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModTools {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MOD_ID);


    // TODO - Change the Tiers.STONE to the correct tier for each tool
    // TODO - Change the 0, 0 to the correct attack damage and attack speed for each tool

    // Hoes
    public static final RegistryObject<Item> HOE = ITEMS.register("hoe",
            () -> new HoeItem(Tiers.STONE, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModTiers.COPPER, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModTiers.STEEL, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> GOLD_HOE = ITEMS.register("gold_hoe",
            () -> new HoeItem(Tiers.GOLD, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> IRIDIUM_HOE = ITEMS.register("iridium_hoe",
            () -> new HoeItem(ModTiers.IRIDIUM, 0, 0, (new Item.Properties())));




    // Axes
    public static final RegistryObject<Item> AXE = ITEMS.register("axe",
            () -> new AxeItem(Tiers.STONE, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModTiers.COPPER, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModTiers.STEEL, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> GOLD_AXE = ITEMS.register("gold_axe",
            () -> new AxeItem(Tiers.GOLD, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> IRIDIUM_AXE = ITEMS.register("iridium_axe",
            () -> new AxeItem(ModTiers.IRIDIUM, 0, 0, (new Item.Properties())));



    // Pickaxes
    public static final RegistryObject<Item> PICKAXE = ITEMS.register("pickaxe",
            () -> new PickaxeItem(Tiers.STONE, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModTiers.COPPER, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModTiers.STEEL, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> GOLD_PICKAXE = ITEMS.register("gold_pickaxe",
            () -> new PickaxeItem(Tiers.GOLD, 0, 0, (new Item.Properties())));
    public static final RegistryObject<Item> IRIDIUM_PICKAXE = ITEMS.register("iridium_pickaxe",
            () -> new PickaxeItem(ModTiers.IRIDIUM, 0, 0, (new Item.Properties())));



    // Watering Cans
    public static final RegistryObject<Item> WATERING_CAN = ITEMS.register("watering_can",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> COPPER_WATERING_CAN = ITEMS.register("copper_watering_can",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> STEEL_WATERING_CAN = ITEMS.register("steel_watering_can",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> GOLD_WATERING_CAN = ITEMS.register("gold_watering_can",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> IRIDIUM_WATERING_CAN = ITEMS.register("iridium_watering_can",
            () -> new Item((new Item.Properties())));


    // Fishing Rods

    public static final RegistryObject<Item> BAMBOO_POLE = ITEMS.register("bamboo_pole",
            () -> new FishingRodItem((new Item.Properties())));
    public static final RegistryObject<Item> FIBERGLASS_ROD = ITEMS.register("fiberglass_rod",
            () -> new FishingRodItem((new Item.Properties())));
    public static final RegistryObject<Item> IRIDIUM_ROD = ITEMS.register("iridium_rod",
            () -> new FishingRodItem((new Item.Properties())));
    public static final RegistryObject<Item> TRAINING_ROD = ITEMS.register("training_rod",
            () -> new FishingRodItem((new Item.Properties())));



    //////////////////////////
    // Miscellaneous Tools  //
    //////////////////////////
    public static final RegistryObject<Item> SCYTHE = ITEMS.register("scythe",
            () -> new Item((new Item.Properties())));

    // Milk Pail
    public static final RegistryObject<Item> MILK_PAIL = ITEMS.register("milk_pail",
            () -> new Item((new Item.Properties())));

    // Shears
    public static final RegistryObject<Item> SHEARS = ITEMS.register("shears",
            () -> new Item((new Item.Properties())));

    // Copper Pan
    public static final RegistryObject<Item> COPPER_PAN = ITEMS.register("copper_pan",
            () -> new Item((new Item.Properties())));




    // Trash Cans
    public static final RegistryObject<Item> COPPER_TRASH_CAN = ITEMS.register("copper_trash_can",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> STEEL_TRASH_CAN = ITEMS.register("steel_trash_can",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> GOLD_TRASH_CAN = ITEMS.register("gold_trash_can",
            () -> new Item((new Item.Properties())));
    public static final RegistryObject<Item> IRIDIUM_TRASH_CAN = ITEMS.register("iridium_trash_can",
            () -> new Item((new Item.Properties())));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
