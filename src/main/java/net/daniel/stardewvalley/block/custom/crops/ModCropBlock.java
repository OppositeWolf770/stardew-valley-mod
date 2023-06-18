package net.daniel.stardewvalley.block.custom.crops;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class ModCropBlock extends CropBlock {
    ItemLike seed;
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);

    public ModCropBlock(Properties pProperties, ItemLike seed) {
        super(pProperties);
        this.seed = seed;

    }

    @Override
    protected ItemLike getBaseSeedId() {
        return seed;
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}
