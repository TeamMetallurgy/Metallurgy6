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
import net.minecraftforge.common.ToolType;
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
    public static Block TEST_ORE = register("test_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5F, 6.0F).harvestTool(ToolType.PICKAXE)), Biome.TempCategory.COLD, 20, 0, 0, 50, 8);

    //NON-TEMPERATURE DEPENDENT ORES
    public static Block GRAPHITE_ORE = register("graphite_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 14, 64, 64, 128, 6);
    public static Block COPPER_ORE = register("copper_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 24, 52, 52, 128, 10);
    public static Block TIN_ORE = register("tin_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 20, 52, 52, 96, 8);
    public static Block LEAD_ORE = register("lead_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 16, 16, 16, 64, 10);
    public static Block MYCELITE_ORE = register("mycelite_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 16, 16, 16, 64, 10);
    public static Block THOKCHA_ORE = register("thokcha_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 16, 16, 16, 64, 10);
    public static Block NICKEL_ORE = register("nickel_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 16, 16, 16, 64, 10);
    public static Block MANGANESE_ORE = register("manganese_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 8, 0, 0, 48, 8);
    public static Block ZINC_ORE = register("zinc_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 4, 32, 32, 64, 8);
    public static Block SILVER_ORE = register("silver_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 4, 0, 0, 32, 8);
    public static Block PLATINUM_ORE = register("platinum_ore", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(3.0F, 3.0F).harvestTool(ToolType.PICKAXE)), null, 4, 0, 0, 32, 8);


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
