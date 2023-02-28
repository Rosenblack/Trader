package net.shale.horde.trader.reg;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.trader.Main;
import net.shale.horde.trader.block.blocks;
import net.shale.horde.trader.block.entity.trader_entity;
import net.shale.horde.trader.block.entity.test_entity;

public class reg_entity {
    public static BlockEntityType<test_entity> TEST_ENTITY_TYPE;
    public static BlockEntityType<trader_entity> TRADER_ENTITY_TYPE;

    public static void registerAllEntities(){
        TEST_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Main.ID, "test_entity"),
                        FabricBlockEntityTypeBuilder.create(test_entity::new,
                                blocks.TEST_BLOCK).build(null));

        TRADER_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Main.ID, "trader_entity"),
                FabricBlockEntityTypeBuilder.create(trader_entity::new,
                        blocks.TRADER).build(null));
    }
}
