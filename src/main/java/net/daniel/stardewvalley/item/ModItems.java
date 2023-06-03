package net.daniel.stardewvalley.item;

import net.daniel.stardewvalley.StardewValley;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, StardewValley.MODID);

    // Add Items below this comment


    public static void  register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
