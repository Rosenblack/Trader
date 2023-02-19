package net.shale.horde.chem.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.chem.Main;
import net.shale.horde.chem.block.extend.test_block;

public class blocks {
        public static final Block TEST_BLOCK = registerBlock("test_block",
            new test_block(FabricBlockSettings.of(Material.STONE)
            ));
private static Block registerBlockWithoutBlockItem(String name, Block block) {
    return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
}

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Main.ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), new BlockItem(block,
                new FabricItemSettings().group(ItemGroup.DECORATIONS)));
    }

    public static void registerBlock() {

    }
}
