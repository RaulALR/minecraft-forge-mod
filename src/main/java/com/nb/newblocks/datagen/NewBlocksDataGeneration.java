package com.nb.newblocks.datagen;

import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.datagen.client.ModBlockStateProvider;
import com.nb.newblocks.datagen.client.ModItemModelProvider;
import com.nb.newblocks.datagen.client.lang.ModEnUsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = NewBlocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewBlocksDataGeneration {

    @SubscribeEvent
    public static  void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if(event.includeClient()){
            generator.addProvider(new ModBlockStateProvider(generator, helper));
            generator.addProvider(new ModItemModelProvider(generator, helper));
            generator.addProvider(new ModEnUsProvider(generator));
        }

        if(event.includeServer()){

        }
    }
}
