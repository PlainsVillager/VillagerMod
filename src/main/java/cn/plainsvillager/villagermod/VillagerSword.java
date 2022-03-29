package cn.plainsvillager.villagermod;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class VillagerSword extends SwordItem {
    public VillagerSword(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }
}
