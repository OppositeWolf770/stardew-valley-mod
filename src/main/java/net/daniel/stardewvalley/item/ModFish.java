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
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MODID);

    public static final RegistryObject<Item> ANCHOVY = ITEMS.register("anchovy",
            () -> new FishItem(new Item.Properties(),
                    "A small silver fish found in the ocean."));
    public static final RegistryObject<Item> PUFFERFISH = ITEMS.register("pufferfish",
            () -> new FishItem(new Item.Properties(),
                    "Inflates when threatened."));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
