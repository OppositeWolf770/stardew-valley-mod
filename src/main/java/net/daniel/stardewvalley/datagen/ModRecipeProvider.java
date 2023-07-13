package net.daniel.stardewvalley.datagen;

import net.daniel.stardewvalley.datagen.custom.CrystalariumRecipeBuilder;
import net.daniel.stardewvalley.item.ModMinerals;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        // Crystalarium Recipes
        new CrystalariumRecipeBuilder(ModMinerals.EMERALD.get(), ModMinerals.EMERALD.get(), 1, 48000)
                .unlockedBy("has_emerald", has(ModMinerals.EMERALD.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.AQUAMARINE.get(), ModMinerals.AQUAMARINE.get(), 1, 24000)
                .unlockedBy("has_aquamarine", has(ModMinerals.AQUAMARINE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.RUBY.get(), ModMinerals.RUBY.get(), 1, 48000)
                .unlockedBy("has_ruby", has(ModMinerals.RUBY.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.AMETHYST.get(), ModMinerals.AMETHYST.get(), 1, 22000)
                .unlockedBy("has_amethyst", has(ModMinerals.AMETHYST.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.TOPAZ.get(), ModMinerals.TOPAZ.get(), 1, 18000)
                .unlockedBy("has_topaz", has(ModMinerals.TOPAZ.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.JADE.get(), ModMinerals.JADE.get(), 1, 40000)
                .unlockedBy("has_jade", has(ModMinerals.JADE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.DIAMOND.get(), ModMinerals.DIAMOND.get(), 1, 120000)
                .unlockedBy("has_diamond", has(ModMinerals.DIAMOND.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.QUARTZ.get(), ModMinerals.QUARTZ.get(), 1, 7000)
                .unlockedBy("has_quartz", has(ModMinerals.QUARTZ.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.FIRE_QUARTZ.get(), ModMinerals.FIRE_QUARTZ.get(), 1, 21000)
                .unlockedBy("has_fire_quartz", has(ModMinerals.FIRE_QUARTZ.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.FROZEN_TEAR.get(), ModMinerals.FROZEN_TEAR.get(), 1, 18000)
                .unlockedBy("has_frozen_tear", has(ModMinerals.FROZEN_TEAR.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.EARTH_CRYSTAL.get(), ModMinerals.EARTH_CRYSTAL.get(), 1, 13000)
                .unlockedBy("has_earth_crystal", has(ModMinerals.EARTH_CRYSTAL.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.TIGERSEYE.get(), ModMinerals.TIGERSEYE.get(), 1, 83000)
                .unlockedBy("has_tigerseye", has(ModMinerals.TIGERSEYE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.OPAL.get(), ModMinerals.OPAL.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.OPAL.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.FIRE_OPAL.get(), ModMinerals.FIRE_OPAL.get(), 1, 83000)
                .unlockedBy("has_fire_opal", has(ModMinerals.FIRE_OPAL.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.ALAMITE.get(), ModMinerals.ALAMITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.ALAMITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.BIXITE.get(), ModMinerals.BIXITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.BIXITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.BARYTE.get(), ModMinerals.BARYTE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.BARYTE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.AERINITE.get(), ModMinerals.AERINITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.AERINITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.CALCITE.get(), ModMinerals.CALCITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.CALCITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.DOLOMITE.get(), ModMinerals.DOLOMITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.DOLOMITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.ESPERITE.get(), ModMinerals.ESPERITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.ESPERITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.FLUORAPATITE.get(), ModMinerals.FLUORAPATITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.FLUORAPATITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.GEMINITE.get(), ModMinerals.GEMINITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.GEMINITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.HELVITE.get(), ModMinerals.HELVITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.HELVITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.JAMBORITE.get(), ModMinerals.JAMBORITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.JAMBORITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.JAGOITE.get(), ModMinerals.JAGOITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.JAGOITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.KYANITE.get(), ModMinerals.KYANITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.KYANITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.LUNARITE.get(), ModMinerals.LUNARITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.LUNARITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.MALACHITE.get(), ModMinerals.MALACHITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.MALACHITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.NEPTUNITE.get(), ModMinerals.NEPTUNITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.NEPTUNITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.LEMON_STONE.get(), ModMinerals.LEMON_STONE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.LEMON_STONE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.NEKOITE.get(), ModMinerals.NEKOITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.NEKOITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.ORPIMENT.get(), ModMinerals.ORPIMENT.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.ORPIMENT.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.PETRIFIED_SLIME.get(), ModMinerals.PETRIFIED_SLIME.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.PETRIFIED_SLIME.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.THUNDER_EGG.get(), ModMinerals.THUNDER_EGG.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.THUNDER_EGG.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.PYRITE.get(), ModMinerals.PYRITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.PYRITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.OCEAN_STONE.get(), ModMinerals.OCEAN_STONE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.OCEAN_STONE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.GHOST_CRYSTAL.get(), ModMinerals.GHOST_CRYSTAL.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.GHOST_CRYSTAL.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.JASPER.get(), ModMinerals.JASPER.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.JASPER.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.CELESTINE.get(), ModMinerals.CELESTINE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.CELESTINE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.MARBLE.get(), ModMinerals.MARBLE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.MARBLE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.SANDSTONE.get(), ModMinerals.SANDSTONE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.SANDSTONE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.GRANITE.get(), ModMinerals.GRANITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.GRANITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.BASALT.get(), ModMinerals.BASALT.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.BASALT.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.LIMESTONE.get(), ModMinerals.LIMESTONE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.LIMESTONE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.SOAPSTONE.get(), ModMinerals.SOAPSTONE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.SOAPSTONE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.HEMATITE.get(), ModMinerals.HEMATITE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.HEMATITE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.MUDSTONE.get(), ModMinerals.MUDSTONE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.MUDSTONE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.OBSIDIAN.get(), ModMinerals.OBSIDIAN.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.OBSIDIAN.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.SLATE.get(), ModMinerals.SLATE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.SLATE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.FAIRY_STONE.get(), ModMinerals.FAIRY_STONE.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.FAIRY_STONE.get())).save(pWriter);
        new CrystalariumRecipeBuilder(ModMinerals.STAR_SHARDS.get(), ModMinerals.STAR_SHARDS.get(), 1, 83000)
                .unlockedBy("has_opal", has(ModMinerals.STAR_SHARDS.get())).save(pWriter);










        // Preserves Jar Recipes
//        new PreservesJarRecipeBuilder(ModCrops.CAULIFLOWER.get(), ModCrops.CAULIFLOWER_SEEDS.get(), 3)
//                .unlockedBy("has_cauliflower", has(ModCrops.CAULIFLOWER.get())).save(pWriter);

    }
}
