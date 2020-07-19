package com.teammetallurgy.metallurgy6.objects.items;

import com.google.common.collect.Lists;
import com.teammetallurgy.metallurgy6.MetallurgyMain;
import com.teammetallurgy.metallurgy6.util.MetallurgyItemTier;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.List;

@ObjectHolder(MetallurgyMain.MOD_ID)
@Mod.EventBusSubscriber(modid = MetallurgyMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MetallurgyItems {

    public static List<Item> ITEMS = Lists.newArrayList();

    public static final Item GRAPHITE = register("graphite", new Item(new Item.Properties().group(MetallurgyMain.MATERIALS)));
    public static final Item IRON_ROD = register("iron_rod", new Item(new Item.Properties().group(MetallurgyMain.TOOLS)));
    public static final Item STEEL_ROD = register("steel_rod", new Item(new Item.Properties().group(MetallurgyMain.TOOLS)));

    protected static Item register(String registryName, Item thisItem){
        thisItem.setRegistryName(registryName);
        ITEMS.add(thisItem);

        return thisItem;
    }

    public static void registerItems(final RegistryEvent.Register<Item> event){
        for(Item thisItem : ITEMS){
            event.getRegistry().register(thisItem);
        }
    }
}
