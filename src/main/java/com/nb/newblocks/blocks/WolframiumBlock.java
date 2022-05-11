package com.nb.newblocks.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class WolframiumBlock extends Block {
    public WolframiumBlock(BlockBehaviour.Properties properties){
        super(properties
                .dynamicShape()
                .sound(SoundType.NETHER_ORE)
                .strength(3.0f, 2.0f)
                .requiresCorrectToolForDrops()
                .lightLevel(state -> 50));
    }
}
