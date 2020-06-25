package com.teammetallurgy.metallurgy6.objects.blocks;

import com.google.common.collect.Lists;
import com.teammetallurgy.metallurgy6.MetallurgyMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.List;

@ObjectHolder(MetallurgyMain.MOD_ID)
@Mod.EventBusSubscriber(modid = MetallurgyMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MetallurgyBlocks {
    public static List<Block> BLOCKS = Lists.newArrayList();
    public static List<Item> BLOCK_ITEMS = Lists.newArrayList();

    //declare blocks here
    public static Block TEST_ORE = register("test_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)));

    private static Block register(String registryName, Block thisBlock){
        Item.Properties props = new Item.Properties().group(MetallurgyMain.GROUP);

        thisBlock.setRegistryName(registryName);
        BlockItem thisBlockItem = new BlockItem(thisBlock, props);
        thisBlockItem.setRegistryName(registryName);

        BLOCKS.add(thisBlock);
        BLOCK_ITEMS.add(thisBlockItem);

        return thisBlock;
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        for(Block thisBlock : BLOCKS){
            event.getRegistry().register(thisBlock);
        }
    }

    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event){
        for(Item thisBlockItem : BLOCK_ITEMS){
            event.getRegistry().register(thisBlockItem);
        }
    }

}
