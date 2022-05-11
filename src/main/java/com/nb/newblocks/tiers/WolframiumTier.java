package com.nb.newblocks.tiers;

import com.nb.newblocks.items.wolframium.generators.WolframiumItemsGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class WolframiumTier {
    public static final ForgeTier WOLFRAMIUM = new ForgeTier(2, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(WolframiumItemsGenerator.WOLFRAMIUM_MINERAL_ITEM.get()));
}
