package net.shale.horde.chem.reg;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.chem.Main;
import net.shale.horde.chem.block.blocks;
import net.shale.horde.chem.block.entity.combiner_entity;
import net.shale.horde.chem.block.entity.test_entity;

public class reg_entity {
    public static BlockEntityType<test_entity> TEST_ENTITY_TYPE;
    public static BlockEntityType<combiner_entity> COMBINER_ENTITY_TYPE;

    public static void registerAllEntities(){
        TEST_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Main.ID, "test_entity"),
                        FabricBlockEntityTypeBuilder.create(test_entity::new,
                                blocks.TEST_BLOCK).build(null));

        COMBINER_ENTITY_TYPE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Main.ID, "combiner_entity"),
                FabricBlockEntityTypeBuilder.create(combiner_entity::new,
                        blocks.COMBINER).build(null));
    }
}
