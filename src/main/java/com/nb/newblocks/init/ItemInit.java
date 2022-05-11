package com.nb.newblocks.init;

import com.google.common.base.Supplier;
import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.items.*;
import com.nb.newblocks.items.wolframium.*;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NewBlocks.MOD_ID);

    //Items
    public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item",
            () -> new ExampleItem(new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));

//Wolframium
    //Blocks
    //public static final RegistryObject<Item> WOLFRAMIUM_INGOT_ITEM = register("wolframium_ingot_item",
    //        () -> new WolframiumIngotItem(new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));
    //public static final RegistryObject<Item> WOLFRAMIUM_MINERAL_ITEM = register("wolframium_mineral_item",
    //        () -> new WolframiumMineralItem(new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));

    //Tools
    //public static final RegistryObject<AxeItem> WOLFRAMIUM_AXE = register("wolframium_axe",
    //        () -> new WolframiumAxe(ToolMaterialInit.WOLFRAMIUM, 7, 5f, new AxeItem.Properties()));
    //public static final RegistryObject<PickaxeItem> WOLFRAMIUM_PICKAXE = register("wolframium_pickaxe",
    //        () -> new WolframiumPickaxe(ToolMaterialInit.WOLFRAMIUM, 7, 5f, new PickaxeItem.Properties()));
    //public static final RegistryObject<ShovelItem> WOLFRAMIUM_SHOVEL = register("wolframium_shovel",
    //        () -> new WolframiumShovel(ToolMaterialInit.WOLFRAMIUM, 7, 5f, new ShovelItem.Properties()));
    //public static final RegistryObject<HoeItem> WOLFRAMIUM_HOE = register("wolframium_hoe",
    //        () -> new WolframiumHoe(ToolMaterialInit.WOLFRAMIUM, 7, 5f, new HoeItem.Properties()));
    //public static final RegistryObject<SwordItem> WOLFRAMIUM_SWORD = register("wolframium_sword",
    //        () -> new WolframiumSword(ToolMaterialInit.WOLFRAMIUM, 10, 2f, new SwordItem.Properties()));
    //public static final RegistryObject<SwordItem> WOLFRAMIUM_HAMMER = register("wolframium_hammer",
    //        () -> new WolframiumHammer(ToolMaterialInit.WOLFRAMIUM, 30, 1f, new SwordItem.Properties()));

    //TODO Armor
    //public static final RegistryObject<ArmorItem> WOLFRAMIUM_BOOTS = register("wolframium_boots",
    //        () -> new WolframiumBoots(ArmorMaterialInit.WOLFRAMIUM, EquipmentSlot.FEET, new Item.Properties()));
    //public static final RegistryObject<ArmorItem> WOLFRAMIUM_HELMET = register("wolframium_helmet",
    //        () -> new WolframiumHelmet(ArmorMaterialInit.WOLFRAMIUM, EquipmentSlot.HEAD, new Item.Properties()));
    //public static final RegistryObject<ArmorItem> WOLFRAMIUM_CHEST = register("wolframium_chest",
    //        () -> new WolframiumChest(ArmorMaterialInit.WOLFRAMIUM, EquipmentSlot.CHEST, new Item.Properties()));
    //public static final RegistryObject<ArmorItem> WOLFRAMIUM_LEGGINGS = register("wolframium_leggings",
    //        () -> new WolframiumLeggings(ArmorMaterialInit.WOLFRAMIUM, EquipmentSlot.LEGS, new Item.Properties()));

    //Foods
    //public static final RegistryObject<Item> ELIXIR_FOOD_ITEM = register("elixir_food_item",
    //        () -> new ElixirFoodItem(new Item.Properties().tab(NewBlocks.NEW_BLOCK_TAB)));

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
