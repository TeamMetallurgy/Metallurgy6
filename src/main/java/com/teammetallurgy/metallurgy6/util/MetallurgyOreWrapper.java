package com.teammetallurgy.metallurgy6.util;

import net.minecraft.block.Block;
import net.minecraft.world.biome.Biome;

public class MetallurgyOreWrapper {

    private Block ore;
    private Biome.TempCategory temp;
    private int rarity;
    private int offsetX;
    private int offsetY;
    private int maxYLevel;
    private int maxVeinSize;

    public MetallurgyOreWrapper(Block ore, Biome.TempCategory temp, int rarity, int offsetX, int offsetY, int maxYLevel, int maxVeinSize){
        this.ore = ore;
        this.temp = temp;
        this.rarity = rarity;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.maxYLevel = maxYLevel;
        this.maxVeinSize = maxVeinSize;
    }

    public Block getOre(){
        return ore;
    }

    public Biome.TempCategory getTempCategory(){
        return temp;
    }

    public int getRarity(){
        return rarity;
    }

    public int getOffsetX(){
        return offsetX;
    }

    public int getOffsetY(){
        return offsetY;
    }

    public int getMaxYLevel(){
        return maxYLevel;
    }

    public int getMaxVeinSize(){
        return maxVeinSize;
    }

}
