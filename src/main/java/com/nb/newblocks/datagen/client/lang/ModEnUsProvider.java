package com.nb.newblocks.datagen.client.lang;

import com.nb.newblocks.NewBlocks;
import com.nb.newblocks.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider{

    public ModEnUsProvider(DataGenerator generator){
        super(generator, NewBlocks.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ItemInit.EXAMPLE_ITEM.get(), "Example item");
    }
}
