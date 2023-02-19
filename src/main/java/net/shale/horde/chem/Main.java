package net.shale.horde.chem;

import net.fabricmc.api.ModInitializer;

import net.shale.horde.chem.block.blocks;
import net.shale.horde.chem.reg.reg_entity;
import net.shale.horde.chem.reg.reg_recipe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String ID = "chemistry";
	@Override
	public void onInitialize() {
		blocks.registerBlock();
		reg_entity.registerAllEntities();
		reg_recipe.register();
	}
}