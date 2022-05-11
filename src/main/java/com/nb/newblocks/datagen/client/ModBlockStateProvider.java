package com.nb.newblocks.datagen.client;

import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.init.BlockInit;
import com.nb.newblocks.items.wolframium.generators.WolframiumBlocksGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper helper){
        super(generator, NewBlocks.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.EXAMPLE_BLOCK.get());
        simpleBlock(WolframiumBlocksGenerator.WOLFRAMIUM_BLOCK.get());
        simpleBlock(WolframiumBlocksGenerator.WOLFRAMIUM_ORE_BLOCK.get());
    }
}
