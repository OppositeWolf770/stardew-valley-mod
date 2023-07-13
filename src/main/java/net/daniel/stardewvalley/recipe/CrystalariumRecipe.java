package net.daniel.stardewvalley.recipe;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.daniel.stardewvalley.StardewValley;
import net.minecraft.core.NonNullList;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.GsonHelper;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.Level;

public class CrystalariumRecipe implements Recipe<SimpleContainer> {
    private final NonNullList<Ingredient> input;
    private  final ItemStack output;
    private final ResourceLocation id;
    private final int processingTime;

    public CrystalariumRecipe(ResourceLocation id, ItemStack output, NonNullList<Ingredient> input, int processingTime ) {
        this.input = input;
        this.output = output;
        this.id = id;
        this.processingTime = processingTime;
    }

    @Override
    public boolean matches(SimpleContainer pContainer, Level pLevel) {
        if (pLevel.isClientSide()) {
            return false;
        }

        return input.get(0).test(pContainer.getItem(0));
    }

    @Override
    public ItemStack assemble(SimpleContainer p_44001_, RegistryAccess p_267165_) {
        return output.copy();
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public ItemStack getResultItem(RegistryAccess p_267052_) {
        return output.copy();
    }

    @Override
    public NonNullList<Ingredient> getIngredients() {
        return this.input;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    @Override
    public ResourceLocation getId() {
        return id;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<CrystalariumRecipe> {
        private Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "crystalarium";
    }

    public static class Serializer implements RecipeSerializer<CrystalariumRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final ResourceLocation ID =
                new ResourceLocation(StardewValley.MOD_ID,"crystalarium");

        @Override
        public CrystalariumRecipe fromJson(ResourceLocation id, JsonObject json) {
            ItemStack output = ShapedRecipe.itemStackFromJson(GsonHelper.getAsJsonObject(json, "output"));
            int processingTime = GsonHelper.getAsInt(json, "processingTime");

            JsonArray ingredients = GsonHelper.getAsJsonArray(json, "ingredients");
            NonNullList<Ingredient> inputs = NonNullList.withSize(1, Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromJson(ingredients.get(i)));
            }

            return new CrystalariumRecipe(id, output, inputs, processingTime);
        }

        @Override
        public CrystalariumRecipe fromNetwork(ResourceLocation id, FriendlyByteBuf buf) {
            NonNullList<Ingredient> inputs = NonNullList.withSize(buf.readInt(), Ingredient.EMPTY);

            for (int i = 0; i < inputs.size(); i++) {
                inputs.set(i, Ingredient.fromNetwork(buf));
            }

            ItemStack output = buf.readItem();
            int processingTime = buf.readInt();
            return new CrystalariumRecipe(id, output, inputs, processingTime);
        }

        @Override
        public void toNetwork(FriendlyByteBuf buf, CrystalariumRecipe recipe) {
            buf.writeInt(recipe.getIngredients().size());

            for (Ingredient ing : recipe.getIngredients()) {
                ing.toNetwork(buf);
            }
            buf.writeItemStack(recipe.getResultItem(null), false);
            buf.writeInt(recipe.getProcessingTime());
        }
    }
}
