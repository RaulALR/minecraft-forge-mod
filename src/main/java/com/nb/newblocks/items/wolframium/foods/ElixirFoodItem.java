package com.nb.newblocks.items.wolframium.foods;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.Level;

public class ElixirFoodItem extends Item {

    public ElixirFoodItem(Item.Properties properties){
        super(properties.food(new FoodProperties.Builder()
                .alwaysEat()
                .nutrition(4)
                .saturationMod(2.0f)
                .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 200, 0), 1f)
                .build()));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        if(!world.isClientSide()){
            System.out.println(player.getName().getString() + " esta usando item " + hand.name());
        }
        return super.use(world, player, hand);
    }
    public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType){
        return 40;
    }
}
