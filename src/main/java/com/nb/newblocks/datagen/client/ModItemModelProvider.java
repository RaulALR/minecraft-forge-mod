package com.nb.newblocks.datagen.client;

import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.init.BlockInit;
import com.nb.newblocks.init.ItemInit;
import com.nb.newblocks.items.wolframium.generators.WolframiumBlocksGenerator;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper helper){
        super(generator, NewBlocks.MOD_ID, helper);
    }

    protected void simpleBlockItem(Item item){
        getBuilder(item.getRegistryName().toString()).parent(getExistingFile(modLoc("block/"+ item.getRegistryName().getPath())));
    }

    protected void oneLayer(Item item, ResourceLocation texture){
        getBuilder(item.getRegistryName().toString()).parent(getExistingFile(modLoc("block/"+ item.getRegistryName().getPath())));
        ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
        if(existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")){
            getBuilder(item.getRegistryName().getPath()).parent(getExistingFile((mcLoc("item/generated")))).texture("layer0", itemTexture);

        } else {
            System.out.println("Textura de "+ item.getRegistryName().toString() + " no existe en " + itemTexture.toString());
        }
    }

    protected void oneLayerItem(Item item) {
        oneLayer(item, item.getRegistryName());
    }

    @Override
    protected void registerModels() {
        simpleBlockItem(BlockInit.EXAMPLE_BLOCK.get().asItem());
        simpleBlockItem(WolframiumBlocksGenerator.WOLFRAMIUM_BLOCK.get().asItem());
        simpleBlockItem(WolframiumBlocksGenerator.WOLFRAMIUM_ORE_BLOCK.get().asItem());

        oneLayerItem(ItemInit.EXAMPLE_ITEM.get());
    }
}
