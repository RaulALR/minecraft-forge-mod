package com.nb.newblocks.items.wolframium.generators;

import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.items.wolframium.items.WolframiumIngotItem;
import com.nb.newblocks.items.wolframium.items.WolframiumMineralItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WolframiumItemsGenerator {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NewBlocks.MOD_ID);

    public static final RegistryObject<Item> WOLFRAMIUM_MINERAL_ITEM = ITEMS.register("wolframium_mineral_item",
            () -> new WolframiumMineralItem(new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));
    public static final RegistryObject<Item> WOLFRAMIUM_INGOT_ITEM = ITEMS.register("wolframium_ingot_item",
            () -> new WolframiumIngotItem(new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
