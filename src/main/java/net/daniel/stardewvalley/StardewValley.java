package net.daniel.stardewvalley;

import com.mojang.logging.LogUtils;
import net.daniel.stardewvalley.block.ModBlocks;
import net.daniel.stardewvalley.block.entity.ModBlockEntities;
import net.daniel.stardewvalley.item.*;
import net.daniel.stardewvalley.recipe.ModRecipes;
import net.daniel.stardewvalley.screen.*;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.FishingRodItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import javax.annotation.Nullable;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(StardewValley.MOD_ID)
public class StardewValley {
    public static final String MOD_ID = "stardewvalley";
    private static final Logger LOGGER = LogUtils.getLogger();


    // Describes the color values and description messages for tooltips
    public static ChatFormatting tooltipColor = ChatFormatting.AQUA;
    public static ChatFormatting shiftTooltipColor = ChatFormatting.GOLD;
    public static String shiftMessage = "Press SHIFT to view description";

    public StardewValley() {
        // Sets up the item and block registries
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModWeapons.register(modEventBus);
        ModMinerals.register(modEventBus);
        ModArtifacts.register(modEventBus);
        ModCrops.register(modEventBus);
        ModFish.register(modEventBus);
        ModTools.register(modEventBus);

        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        ModMenuTypes.register(modEventBus);

        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }



    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {

                // TODO finish adding the rest of the fishing rods in here.

                ItemProperties.register(ModTools.FIBERGLASS_ROD.get(),
                        new ResourceLocation("cast"), ClientModEvents::FishingPoleProperty);
                ItemProperties.register(ModTools.TRAINING_ROD.get(),
                        new ResourceLocation("cast"), ClientModEvents::FishingPoleProperty);

                MenuScreens.register(ModMenuTypes.KEG_MENU.get(), KegScreen::new);
                MenuScreens.register(ModMenuTypes.CRYSTALARIUM_MENU.get(), CrystalariumScreen::new);
                MenuScreens.register(ModMenuTypes.PRESERVES_JAR_MENU.get(), PreservesJarScreen::new);
            });
        }

        static float FishingPoleProperty(ItemStack pStack, @Nullable ClientLevel pLevel, @Nullable LivingEntity pEntity, int pSeed) {
            if (pEntity == null) {
                return 0.0F;
            } else {
                boolean flag = pEntity.getMainHandItem() == pStack;
                boolean flag1 = pEntity.getOffhandItem() == pStack;
                if (pEntity.getMainHandItem().getItem() instanceof FishingRodItem) {
                    flag1 = false;
                }

                return (flag || flag1) && pEntity instanceof Player && ((Player)pEntity).fishing != null ? 1.0F : 0.0F;
            }
        }
    }
}

