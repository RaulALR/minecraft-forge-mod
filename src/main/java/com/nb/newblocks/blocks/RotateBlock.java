package com.nb.newblocks.blocks;

import com.nb.newblocks.init.TagInit;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

public class RotateBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty LIT = BooleanProperty.create("lit");

    public static final VoxelShape NORTH =  Block.box(0, 0, 0, 1, 0.5625, 0.25);
    public static final VoxelShape EAST =  Block.box(0.75, 0, 0, 1, 0.5625, 1);
    public static final VoxelShape SOUTH =  Block.box(0, 0, 0.75, 1, 0.5625, 1);
    public static final VoxelShape WEST =  Block.box(0, 0, 0, 0.25, 0.5625, 1);

    public RotateBlock(Properties properties){
        super(properties.lightLevel(state -> {
            return state.getValue(LIT) ? 15 : 0;
        }));
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH).setValue(LIT, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        switch (state.getValue(FACING)) {
            case EAST:
                return EAST;
            case SOUTH:
                return SOUTH;
            case WEST:
                return WEST;
            default:
                return NORTH;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, LIT);
        super.createBlockStateDefinition(builder);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    public BlockState rotate(BlockState state, LevelAccessor world, BlockPos pos, Rotation direction) {
        return state.setValue(FACING, direction.rotate(state.getValue(FACING)));
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if(!world.isClientSide()){
            //if(player.getItemInHand(hand).getItem().equals(Items.DIAMOND)){
            //    world.setBlock(pos, state.cycle(LIT), 4);
            //    return InteractionResult.CONSUME;
            //}
            if(TagInit.Items.COOL_ITEMS.contains(player.getItemInHand(hand).getItem())){
                world.setBlock(pos, state.cycle(LIT), 4);
                return InteractionResult.CONSUME;
            }
        }
        return super.use(state, world, pos, player, hand, result);
    }
}
