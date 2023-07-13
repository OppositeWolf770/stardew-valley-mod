package net.daniel.stardewvalley.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.daniel.stardewvalley.StardewValley;
import net.daniel.stardewvalley.block.ModBlocks;
import net.daniel.stardewvalley.recipe.CrystalariumRecipe;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

public class CrystalariumRecipeCategory implements IRecipeCategory<CrystalariumRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(StardewValley.MOD_ID, "crystalarium");
    public static final ResourceLocation TEXTURE = new ResourceLocation(StardewValley.MOD_ID,
            "textures/gui/basic_menu_gui.png");

    public static RecipeType<CrystalariumRecipe> CRYSTALARIUM_TYPE =
            new RecipeType<>(UID, CrystalariumRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public CrystalariumRecipeCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.CRYSTALARIUM.get()));
    }

    @Override
    public RecipeType<CrystalariumRecipe> getRecipeType() {
        return CRYSTALARIUM_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.literal("Crystalarium");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, CrystalariumRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 11).addIngredients(recipe.getIngredients().get(0));

        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem(null));
    }
}
