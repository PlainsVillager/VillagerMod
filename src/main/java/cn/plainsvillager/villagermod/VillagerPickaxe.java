package cn.plainsvillager.villagermod;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class VillagerPickaxe extends PickaxeItem {
    public VillagerPickaxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
