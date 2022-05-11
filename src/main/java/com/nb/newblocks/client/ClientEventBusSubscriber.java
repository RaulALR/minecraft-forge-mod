package com.nb.newblocks.client;

import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.blocks.WolframiumBlock;
import com.nb.newblocks.init.BlockInit;
import com.nb.newblocks.items.wolframium.generators.WolframiumBlocksGenerator;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = NewBlocks.MOD_ID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(WolframiumBlocksGenerator.WOLFRAMIUM_BLOCK.get(), RenderType.cutout());
    }
}
