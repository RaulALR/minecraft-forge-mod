package com.nb.newblocks;

import net.minecraft.tags.Tag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class BaseToolMaterial implements Tier {
    private final float attackDamageBonus, speed;
    private final int enchantability, harvestLevel, durability;
    private final Supplier<Ingredient> repairMaterial;

    public BaseToolMaterial(float attackDamageBonus, float speed, int enchantability, int harvestLevel, int durability, Supplier<Ingredient> repairMaterial) {
        this.attackDamageBonus = attackDamageBonus;
        this.speed = speed;
        this.enchantability = enchantability;
        this.harvestLevel = harvestLevel;
        this.durability = durability;
        this.repairMaterial = repairMaterial;
    }

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
        return this.repairMaterial.get();
    }

    @Nullable
    @Override
    public Tag<Block> getTag() {
        return Tier.super.getTag();
    }
}
