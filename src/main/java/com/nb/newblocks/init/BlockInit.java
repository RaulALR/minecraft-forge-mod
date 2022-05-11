package com.nb.newblocks.init;

import com.google.common.base.Supplier;
import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.blocks.ExampleBlock;
import com.nb.newblocks.blocks.RotateBlock;
import com.nb.newblocks.blocks.WolframiumBlock;
import com.nb.newblocks.blocks.WolframiumOreBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, NewBlocks.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
    public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
            () -> new ExampleBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_PURPLE)
                    .strength(3.0f)
                    .sound(SoundType.METAL)
                    .requiresCorrectToolForDrops()
                    .emissiveRendering((state, getter, pos) -> {
                        return pos.getX() == 50;
                    })
                    .lightLevel(state -> 4)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));

    public static RegistryObject<Block> ROTATE_BLOCK = register("rotate_block",
            () -> new RotateBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).dynamicShape().sound(SoundType.STONE)),
            object -> () -> new BlockItem(object.get(), new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));

    //Wolframium
    //public static RegistryObject<Block> WOLFRAMIUM_ORE_BLOCK = register("wolframium_ore_block",
    //        () -> new WolframiumOreBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)),
    //        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));
//
    //public static RegistryObject<Block> WOLFRAMIUM_BLOCK = register("wolframium_block",
    //        () -> new WolframiumBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE)),
//
    //        object -> () -> new BlockItem(object.get(), new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));
    private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<T> block
            , Function<RegistryObject<T>, Supplier<? extends Item>> item) {
        RegistryObject<T> obj = registerBlock(name, block);
        ITEMS.register(name, item.apply(obj));
        return obj;
    }
}
