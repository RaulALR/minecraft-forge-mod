package com.nb.newblocks.items.wolframium.generators;

import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.items.wolframium.foods.ElixirFoodItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WolframiumFoodsGenerator {
    public static final DeferredRegister<Item> FOODS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NewBlocks.MOD_ID);

    public static final RegistryObject<Item> ELIXIR_FOOD_ITEM = FOODS.register("elixir_food_item",
            () -> new ElixirFoodItem(new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));

    public static void register(IEventBus eventBus) {
        FOODS.register(eventBus);
    }
}
