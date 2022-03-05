package net.plainsvillager.villagermod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {

	private static final Item VILLAGER_SWORD = new Item(new Item.Settings().group(ExampleMod.ITEM_GROUP).maxCount(1));
	public static final Logger LOGGER = LoggerFactory.getLogger("villagermod");



	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier("villagermod", "general"),
			() -> new ItemStack(Blocks.COBBLESTONE));

	public static final ItemGroup OTHER_GROUP = FabricItemGroupBuilder.create(
					new Identifier("villagermod", "other"))
			.icon(() -> new ItemStack(Items.BOWL))
			.appendItems(stacks -> {

				stacks.add(new ItemStack(VILLAGER_SWORD));

			})
			.build();

	@Override
	public void onInitialize() {
		Registry.register(Registry.ITEM, new Identifier("villagermod", "villager_sword"), VILLAGER_SWORD);
	}
}
