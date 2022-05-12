package com.nb.newblocks.items.wolframium.generators;

import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.items.wolframium.*;
import com.nb.newblocks.items.wolframium.tools.*;
import com.nb.newblocks.tiers.WolframiumTier;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class WolframiumToolsGenerator {
    public static final DeferredRegister<Item> TOOLS =
            DeferredRegister.create(ForgeRegistries.ITEMS, NewBlocks.MOD_ID);

    public static final RegistryObject<AxeItem> WOLFRAMIUM_AXE = TOOLS.register("wolframium_axe",
            () -> new WolframiumAxe(WolframiumTier.WOLFRAMIUM, 4, 0f, new AxeItem.Properties()));
    public static final RegistryObject<PickaxeItem> WOLFRAMIUM_PICKAXE = TOOLS.register("wolframium_pickaxe",
            () -> new WolframiumPickaxe(WolframiumTier.WOLFRAMIUM, 1, 1f, new PickaxeItem.Properties()));
    public static final RegistryObject<ShovelItem> WOLFRAMIUM_SHOVEL = TOOLS.register("wolframium_shovel",
            () -> new WolframiumShovel(WolframiumTier.WOLFRAMIUM, 0, 1f, new ShovelItem.Properties()));
    public static final RegistryObject<HoeItem> WOLFRAMIUM_HOE = TOOLS.register("wolframium_hoe",
            () -> new WolframiumHoe(WolframiumTier.WOLFRAMIUM, 0, 0f, new HoeItem.Properties()));
    public static final RegistryObject<SwordItem> WOLFRAMIUM_SWORD = TOOLS.register("wolframium_sword",
            () -> new WolframiumSword(WolframiumTier.WOLFRAMIUM, 2, 3f, new SwordItem.Properties()));
    public static final RegistryObject<SwordItem> WOLFRAMIUM_HAMMER = TOOLS.register("wolframium_hammer",
            () -> new WolframiumHammer(WolframiumTier.WOLFRAMIUM, 10, 1f, new SwordItem.Properties()));
    public static final RegistryObject<TridentItem> WOLFRAMIUM_TRIDENT = TOOLS.register("wolframium_trident",
            () -> new WolframiumTrident(new TridentItem.Properties()));

    public static void register(IEventBus eventBus) {
        TOOLS.register(eventBus);
    }
}
