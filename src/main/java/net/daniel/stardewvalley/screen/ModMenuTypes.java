package net.daniel.stardewvalley.screen;

import net.daniel.stardewvalley.StardewValley;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, StardewValley.MOD_ID);

    public static final RegistryObject<MenuType<KegMenu>> KEG_MENU =
            registerMenuType(KegMenu::new, "keg_menu");
    public static final RegistryObject<MenuType<CrystalariumMenu>> CRYSTALARIUM_MENU =
            registerMenuType(CrystalariumMenu::new, "crystalarium_menu");
    public static final RegistryObject<MenuType<PreservesJarMenu>> PRESERVES_JAR_MENU =
            registerMenuType(PreservesJarMenu::new, "preserves_jar_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory, String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
