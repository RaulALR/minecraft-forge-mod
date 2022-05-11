package com.nb.newblocks.items.wolframium.generators;

import com.google.common.base.Supplier;
import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.blocks.WolframiumBlock;
import com.nb.newblocks.blocks.WolframiumOreBlock;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;

public class WolframiumBlocksGenerator {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, NewBlocks.MOD_ID);

    public static RegistryObject<Block> WOLFRAMIUM_ORE_BLOCK = registerBlock("wolframium_ore_block",
            () -> new WolframiumOreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)),
            NewBlocks.NEW_BLOCK_TAB);

    public static RegistryObject<Block> WOLFRAMIUM_BLOCK = registerBlock("wolframium_block",
            () -> new WolframiumBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)),
            NewBlocks.NEW_BLOCK_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block,
                                                                     CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab, tooltipKey);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return WolframiumItemsGenerator.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return WolframiumItemsGenerator.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
