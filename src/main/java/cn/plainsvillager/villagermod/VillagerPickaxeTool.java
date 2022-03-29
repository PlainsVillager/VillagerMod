package cn.plainsvillager.villagermod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class VillagerPickaxeTool implements ToolMaterial {
    public static final VillagerPickaxeTool INSTANCE = new VillagerPickaxeTool();
    @Override
    public int getDurability() {
        return 1145;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10;
    }

    @Override
    public float getAttackDamage() {
        return 5;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 25;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
