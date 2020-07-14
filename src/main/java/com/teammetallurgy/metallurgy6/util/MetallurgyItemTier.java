package com.teammetallurgy.metallurgy6.util;

import com.teammetallurgy.metallurgy6.objects.blocks.MetallurgyOres;
import com.teammetallurgy.metallurgy6.objects.items.MetallurgyItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum MetallurgyItemTier implements IItemTier {
    TEST_TIER(0, 59, 2.0F, 0.0F, 15, () -> {
        return Ingredient.fromItems(MetallurgyOres.TEST_ORE);
    }),
    SLAG(2, 300, 5.0F, 0.0F, 6, () -> {
        return Ingredient.fromItems(MetallurgyItems.SLAG_ALLOY_INGOT);
    }),
    COPPER(2, 180, 5.0F, 1.0F, 7, () -> {
        return Ingredient.fromItems(MetallurgyItems.COPPER_INGOT);
    }),
    TIN(2, 132, 5.0F, 1.0F, 9, () -> {
        return Ingredient.fromItems(MetallurgyItems.TIN_INGOT);
    }),
    BRONZE(3, 250, 6.0F, 2.0F, 15, () -> {
        return Ingredient.fromItems(MetallurgyItems.BRONZE_INGOT);
    }),
    LEAD(3, 500, 4.0F, 2.0F, 10, () -> {
        return Ingredient.fromItems(MetallurgyItems.LEAD_INGOT);
    }),
    MYCELITE(3, 150, 5.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(MetallurgyItems.MYCELITE_INGOT);
    }),
    THOKCHA(3, 200, 6.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(MetallurgyItems.THOKCHA_INGOT);
    }),
    NICKEL(3, 250, 8.0F, 2.0F, 12, () -> {
        return Ingredient.fromItems(MetallurgyItems.NICKEL_INGOT);
    }),
    CUPRONICKEL(3, 350, 8.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(MetallurgyItems.CUPRONICKEL_INGOT);
    }),
    MONEL(3, 500, 9.0F, 2.0F, 16, () -> {
        return Ingredient.fromItems(MetallurgyItems.MONEL_INGOT);
    }),
    CROWN_GOLD(3, 225, 12.0F, 2.0F, 22, () -> {
        return Ingredient.fromItems(MetallurgyItems.CROWN_GOLD_INGOT);
    }),
    WHITE_GOLD(3, 300, 13.0F, 2.0F, 26, () -> {
        return Ingredient.fromItems(MetallurgyItems.WHITE_GOLD_INGOT);
    }),
    PEWTER(3, 850, 10.0F, 2.0F, 12, () -> {
        return Ingredient.fromItems(MetallurgyItems.PEWTER_INGOT);
    }),
    MOLYBDOCHALKOS(3, 700, 10.0F, 2.0F, 14, () -> {
        return Ingredient.fromItems(MetallurgyItems.MOLYBDOCHALKOS_INGOT);
    }),
    HEPATIZON(3, 300, 14.0F, 3.0F, 28, () -> {
        return Ingredient.fromItems(MetallurgyItems.HEPATIZON_INGOT);
    }),
    ANGMALLEN(3, 350, 14.0F, 3.0F, 28, () -> {
        return Ingredient.fromItems(MetallurgyItems.ANGMALLEN_INGOT);
    }),
    MANGANESE(3, 250, 10.0F, 2.0F, 18, () -> {
        return Ingredient.fromItems(MetallurgyItems.MANGANESE_INGOT);
    }),
    HEAVY_STEEL(4, 1800, 10.0F, 3.0F, 12, () -> {
        return Ingredient.fromItems(MetallurgyItems.HEAVY_STEEL_INGOT);
    }),
    DAMASCUS_STEEL(4, 1600, 12.0F, 3.0F, 19, () -> {
        return Ingredient.fromItems(MetallurgyItems.DAMASCUS_STEEL_INGOT);
    }),
    MANGANESE_STEEL(4, 1750, 12.0F, 3.0F, 18, () -> {
        return Ingredient.fromItems(MetallurgyItems.MANGANESE_STEEL_INGOT);
    }),
    NICKEL_STEEL(4, 1450, 12.0F, 3.0F, 16, () -> {
        return Ingredient.fromItems(MetallurgyItems.NICKEL_STEEL_INGOT);
    }),
    FUNGAL_STEEL(4, 1250, 12.0F, 3.0F, 20, () -> {
        return Ingredient.fromItems(MetallurgyItems.FUNGAL_STEEL_INGOT);
    }),
    METEOR_STEEL(4, 1250, 12.0F, 3.0F, 20, () -> {
        return Ingredient.fromItems(MetallurgyItems.METEOR_STEEL_INGOT);
    }),
    WOVEN_STEEL(5, 3000, 16.0F, 4.0F, 22, () -> {
        return Ingredient.fromItems(MetallurgyItems.WOVEN_STEEL_INGOT);
    }),
    ZINC(2, 35, 7.0F, 0.0F, 20, () -> {
        return Ingredient.fromItems(MetallurgyItems.ZINC_INGOT);
    }),
    BRASS(3, 225, 8.0F, 0.0F, 16, () -> {
        return Ingredient.fromItems(MetallurgyItems.BRASS_INGOT);
    }),
    SILVER(3, 33, 10.0F, 0.0F, 24, () -> {
        return Ingredient.fromItems(MetallurgyItems.SILVER_INGOT);
    }),
    PLATINUM(3, 55, 14.0F, 0.0F, 20, () -> {
        return Ingredient.fromItems(MetallurgyItems.PLATINUM_INGOT);
    }),
    ROSE_GOLD(3, 200, 12.0F, 1.0F, 22, () -> {
        return Ingredient.fromItems(MetallurgyItems.ROSE_GOLD_INGOT);
    }),
    ELECTRUM(3, 100, 13.0F, 1.0F, 26, () -> {
        return Ingredient.fromItems(MetallurgyItems.ELECTRUM_INGOT);
    }),
    ARGENTAN(3, 300, 14.0F, 2.0F, 18, () -> {
        return Ingredient.fromItems(MetallurgyItems.ARGENTAN_INGOT);
    }),
    RHODITE(3, 100, 14.0F, 2.0F, 28, () -> {
        return Ingredient.fromItems(MetallurgyItems.RHODITE_INGOT);
    }),
    CORINTHIAN_STEEL(4, 500, 15.0F, 3.0F, 30, () -> {
        return Ingredient.fromItems(MetallurgyItems.CORINTHIAN_STEEL_INGOT);
    }),
    SHIMMER_STEEL(4, 450, 15.0F, 3.0F, 34, () -> {
        return Ingredient.fromItems(MetallurgyItems.SHIMMER_STEEL_INGOT);
    }),
    KINGS_STEEL(5, 2000, 16.0F, 4.0F, 32, () -> {
        return Ingredient.fromItems(MetallurgyItems.KINGS_STEEL_INGOT);
    }),
    PURE_STEEL(6, 5000, 17.0F, 5.0F, 34, () -> {
        return Ingredient.fromItems(MetallurgyItems.PURE_STEEL_INGOT);
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    MetallurgyItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
