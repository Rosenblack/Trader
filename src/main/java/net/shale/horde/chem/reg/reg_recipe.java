package net.shale.horde.chem.reg;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.chem.Main;
import net.shale.horde.chem.recipe.combiner_recipe;
import net.shale.horde.chem.recipe.test_block_recipe;

public class reg_recipe {
    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Main.ID, test_block_recipe.Serializer.ID),
                test_block_recipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Main.ID, test_block_recipe.Type.ID),
                test_block_recipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Main.ID, combiner_recipe.Serializer.ID),
                combiner_recipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Main.ID, combiner_recipe.Type.ID),
                combiner_recipe.Type.INSTANCE);
    }
}
