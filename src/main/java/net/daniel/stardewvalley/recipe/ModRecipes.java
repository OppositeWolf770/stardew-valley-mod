package net.daniel.stardewvalley.recipe;

import net.daniel.stardewvalley.StardewValley;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, StardewValley.MOD_ID);

    public static final RegistryObject<RecipeSerializer<KegRecipe>> KEG_SERIALIZER =
            SERIALIZERS.register("keg", () -> KegRecipe.Serializer.INSTANCE);
    public static final RegistryObject<RecipeSerializer<CrystalariumRecipe>> CRYSTALARIUM_SERIALIZER =
            SERIALIZERS.register("crystalarium", () -> CrystalariumRecipe.Serializer.INSTANCE);




    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
