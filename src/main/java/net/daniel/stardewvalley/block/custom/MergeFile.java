package net.daniel.stardewvalley.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;


// TODO - Finish adding the hitboxes for Thank you for Have a good day
public class MergeFile extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    protected static final VoxelShape EAST_SHAPE = Shapes.or(
            Block.box(7, 0, 7, 9, 9, 9),
            Block.box(5, 9, 4, 11, 16, 12)
    );
    protected static final VoxelShape WEST_SHAPE = Block.box(1, 0, 1, 15, 16, 15);
    protected static final VoxelShape NORTH_SHAPE = Block.box(1, 0, 1, 15, 16, 15);
    protected static final VoxelShape SOUTH_SHAPE = Block.box(1, 0, 1, 15, 16, 15);


    public MergeFile(Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.SOUTH));
    }






    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite());
    }
}
