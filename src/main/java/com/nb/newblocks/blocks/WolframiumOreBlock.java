package com.nb.newblocks.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;

public class WolframiumOreBlock extends Block {
    public WolframiumOreBlock(Properties properties){
        super(properties
                .dynamicShape()
                .sound(SoundType.NETHER_ORE)
                .strength(3.0f, 2.0f)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 8));
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader world, BlockPos pos, int fortune, int silktouch) {
        return super.getExpDrop(state, world, pos, fortune, silktouch);
    }

}
