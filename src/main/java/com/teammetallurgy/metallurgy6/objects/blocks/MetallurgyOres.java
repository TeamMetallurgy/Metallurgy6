package com.teammetallurgy.metallurgy6.objects.blocks;

import com.google.common.collect.Lists;
import com.teammetallurgy.metallurgy6.MetallurgyMain;
import com.teammetallurgy.metallurgy6.util.MetallurgyOreWrapper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;

import java.util.List;

@ObjectHolder(MetallurgyMain.MOD_ID)
public class MetallurgyOres {

    public static List<MetallurgyOreWrapper> ORE_WRAPPERS = Lists.newArrayList();
    public static List<Block> BLOCKS = Lists.newArrayList();
    public static List<Item> BLOCK_ITEMS = Lists.newArrayList();

    //COLD ORES
    public static Block TEST_ORE = register(
            "test_ore",
            new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F)),
            Biome.TempCategory.COLD,
            20, 0, 0, 50, 8
    );

    private static Block register(String registryName, Block thisBlock, Biome.TempCategory temp, int rarity, int offsetX, int offsetY, int maxYLevel, int maxVeinSize){
        Item.Properties props = new Item.Properties().group(MetallurgyMain.GROUP);

        thisBlock.setRegistryName(registryName);
        BlockItem thisBlockItem = new BlockItem(thisBlock, props);
        thisBlockItem.setRegistryName(registryName);


        BLOCKS.add(thisBlock);
        BLOCK_ITEMS.add(thisBlockItem);

        ORE_WRAPPERS.add(new MetallurgyOreWrapper(thisBlock, temp, rarity, offsetX, offsetY, maxYLevel, maxVeinSize));

        return thisBlock;
    }

    public static void registerBlocks(final RegistryEvent.Register<Block> event) {
        for(Block thisBlock : BLOCKS){
            event.getRegistry().register(thisBlock);
        }
    }

    public static void registerBlockItems(final RegistryEvent.Register<Item> event){
        for(Item thisBlockItem : BLOCK_ITEMS){
            event.getRegistry().register(thisBlockItem);
        }
    }

}
