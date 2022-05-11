package com.nb.newblocks.items.wolframium;

import com.nb.newblocks.NewBlocks;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class WolframiumBoots extends ArmorItem {

    public WolframiumBoots(ArmorMaterial material, EquipmentSlot slot, Properties properties) {
        super(material, slot,
                properties.tab(NewBlocks.NEW_BLOCK_TAB));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        return super.use(world, player, hand);
    }
}
