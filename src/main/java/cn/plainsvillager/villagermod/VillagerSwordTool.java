package cn.plainsvillager.villagermod;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class VillagerSwordTool implements ToolMaterial {
    @Override
    public int getDurability() {
        return 1145;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }

    @Override
    public float getAttackDamage() {
        return 12;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
