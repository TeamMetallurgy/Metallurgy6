package com.teammetallurgy.metallurgy6.objects.items;

import com.teammetallurgy.metallurgy6.MetallurgyMain;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(MetallurgyMain.MOD_ID)
@Mod.EventBusSubscriber(modid = MetallurgyMain.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MetallurgyCrushedOres extends MetallurgyItems {

    public static final Item COPPER_CRUSHED_ORE = register("copper_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item GOLD_CRUSHED_ORE = register("gold_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item IRON_CRUSHED_ORE = register("iron_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item LEAD_CRUSHED_ORE = register("lead_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item MANGANESE_CRUSHED_ORE = register("manganese_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item MYCELITE_CRUSHED_ORE = register("mycelite_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item NICKEL_CRUSHED_ORE = register("nickel_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item PLATINUM_CRUSHED_ORE = register("platinum_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item SILVER_CRUSHED_ORE = register("silver_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item THOKCHA_CRUSHED_ORE = register("thokcha_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item TIN_CRUSHED_ORE = register("tin_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
    public static final Item ZINC_CRUSHED_ORE = register("zinc_crushed_ore", new Item((new Item.Properties()).group(MetallurgyMain.MATERIALS)));
}
