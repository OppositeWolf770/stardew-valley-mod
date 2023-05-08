package net.daniel.stardewvalley;

import com.mojang.logging.LogUtils;
import net.daniel.stardewvalley.block.ModBlocks;
import net.daniel.stardewvalley.item.ModItems;
import net.minecraft.ChatFormatting;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(StardewValley.MODID)
public class StardewValley {
    public static final String MODID = "stardewvalley";
    private static final Logger LOGGER = LogUtils.getLogger();

    public static ChatFormatting tooltipColor = ChatFormatting.AQUA;
    public static ChatFormatting shiftTooltipColor = ChatFormatting.GOLD;
    public static String shiftMessage = "Press SHIFT to view description";

    public StardewValley() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
