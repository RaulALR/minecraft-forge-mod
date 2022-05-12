package com.nb.newblocks.items.wolframium.tools;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TridentItem;
import net.minecraft.world.level.Level;

public class WolframiumTrident extends TridentItem {
    public WolframiumTrident(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        //System.out.println(world.toString() + player + hand);
        player.setHealth(player.getHealth() + 1);
        return super.use(world, player, hand);
    }
}
