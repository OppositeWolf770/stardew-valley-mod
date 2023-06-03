package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTools {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MODID);





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
