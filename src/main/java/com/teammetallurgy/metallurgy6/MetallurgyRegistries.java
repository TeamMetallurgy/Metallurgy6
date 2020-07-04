package com.teammetallurgy.metallurgy6;

import com.teammetallurgy.metallurgy6.objects.blocks.MetallurgyBlocks;
import com.teammetallurgy.metallurgy6.objects.blocks.MetallurgyOres;
import com.teammetallurgy.metallurgy6.objects.items.MetallurgyItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MetallurgyRegistries {

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        MetallurgyBlocks.registerBlocks(event);
        MetallurgyOres.registerBlocks(event);
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event) {
        MetallurgyBlocks.registerBlockItems(event);
        MetallurgyOres.registerBlockItems(event);
        MetallurgyItems.registerItems(event);
    }
}
