package cn.plainsvillager.villagermod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import net.minecraft.item.FoodComponent.Builder;

public class Villagermod implements ModInitializer {

    public static final Block ROAD_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).hardness(1.5f));
    public static final Logger LOGGER = LoggerFactory.getLogger("villagermod");
    public static final VillagerSword SWORD = new VillagerSword(new VillagerSwordTool(),1,-2.0f,new Item.Settings());
    public static final VillagerPickaxe VILLAGER_PICKAXE = new VillagerPickaxe(new VillagerPickaxeTool(),2,-2.0F,new Item.Settings());
    public static final Item OLD_EIGHT_LITTLE_HAMBURGER = new Item(new Item.Settings().group(Villagermod.VillagerMod)
            .food((new FoodComponent.Builder())
                    .hunger(7)
                    .saturationModifier(1.2F)
                    .build())
            .maxCount(16));



    public static final ItemGroup VillagerMod = FabricItemGroupBuilder.create(
                    new Identifier("villagermod", "villagermod"))
            .icon(() -> new ItemStack(Villagermod.SWORD))
            .appendItems(stacks -> {

                stacks.add(new ItemStack(SWORD));
                stacks.add(new ItemStack(VILLAGER_PICKAXE));
                stacks.add(new ItemStack(OLD_EIGHT_LITTLE_HAMBURGER));

            })
            .build();
    public static final ItemGroup RoadBuilding = FabricItemGroupBuilder.create(
                    new Identifier("villagermod", "roadbuilding"))
            .icon(() -> new ItemStack(Villagermod.ROAD_BLOCK))
            .appendItems(stacks -> {

                stacks.add(new ItemStack(ROAD_BLOCK));

            })
            .build();

    @Override
    public void onInitialize() {
        Registry.register(Registry.BLOCK, new Identifier("villagermod", "road_block"), ROAD_BLOCK);
        Registry.register(Registry.ITEM, new Identifier("villagermod","villager_sword"), SWORD);
        Registry.register(Registry.ITEM, new Identifier("villagermod", "road_block"), new BlockItem(ROAD_BLOCK, new Item.Settings().group(ItemGroup.DECORATIONS)));
        Registry.register(Registry.ITEM, new Identifier("villagermod","villager_pickaxe"), VILLAGER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("villagermod","old_eight_little_hamburger"), OLD_EIGHT_LITTLE_HAMBURGER);

    }
}
