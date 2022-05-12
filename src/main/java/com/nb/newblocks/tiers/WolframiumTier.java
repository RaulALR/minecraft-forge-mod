package com.nb.newblocks.tiers;

import com.nb.newblocks.items.wolframium.generators.WolframiumItemsGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ForgeTier;
import org.jetbrains.annotations.Nullable;

public class WolframiumTier implements Tier {
    public static final ForgeTier WOLFRAMIUM = new ForgeTier(2, 1400, 1.5f,
            2f, 22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(WolframiumItemsGenerator.WOLFRAMIUM_MINERAL_ITEM.get()));

    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public float getAttackDamageBonus() {
        return 0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }

    @Nullable
    @Override
    public Tag<Block> getTag() {
        return Tier.super.getTag();
    }
}
