package net.daniel.stardewvalley.datagen;

import net.daniel.stardewvalley.StardewValley;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, StardewValley.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
