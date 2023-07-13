package net.daniel.stardewvalley.compat;


import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.recipe.CrystalariumRecipe;
import net.daniel.stardewvalley.screen.CrystalariumScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;

import java.util.List;

@JeiPlugin
public class JEIStardewValleyPlugin implements IModPlugin {
    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(StardewValley.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new CrystalariumRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()
        ));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();
        List<CrystalariumRecipe> crystalariumRecipes = recipeManager.getAllRecipesFor(CrystalariumRecipe.Type.INSTANCE);
        registration.addRecipes(CrystalariumRecipeCategory.CRYSTALARIUM_TYPE, crystalariumRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(CrystalariumScreen.class, 60, 30, 20, 30,
                CrystalariumRecipeCategory.CRYSTALARIUM_TYPE);
    }
}
