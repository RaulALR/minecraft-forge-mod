package com.nb.newblocks.items.wolframium.tools;

import com.nb.newblocks.NewBlocks;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class WolframiumAxe extends AxeItem {

    public WolframiumAxe(Tier tier, int attackDamageIn, float attackSpeedIn, Properties properties) {
        super(tier, attackDamageIn, attackSpeedIn,
                properties.tab(NewBlocks.NEW_BLOCK_TAB));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        return super.use(world, player, hand);
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        stack.setDamageValue(10);
        stack.setRepairCost(5);
        return super.getMaxDamage(stack);
    }


}