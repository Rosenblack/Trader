package net.shale.horde.trader;

import net.fabricmc.api.ModInitializer;

import net.shale.horde.trader.block.blocks;
import net.shale.horde.trader.reg.reg_entity;
import net.shale.horde.trader.reg.reg_recipe;

public class Main implements ModInitializer {
	public static final String ID = "trader";
	@Override
	public void onInitialize() {
		blocks.registerBlock();
		reg_entity.registerAllEntities();
		reg_recipe.register();
		items.registerModItems();
	}
}