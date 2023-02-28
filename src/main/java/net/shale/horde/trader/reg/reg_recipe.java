package net.shale.horde.trader.reg;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.shale.horde.trader.Main;
import net.shale.horde.trader.recipe.trader_recipe;
import net.shale.horde.trader.recipe.test_block_recipe;

public class reg_recipe {
    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Main.ID, test_block_recipe.Serializer.ID),
                test_block_recipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Main.ID, test_block_recipe.Type.ID),
                test_block_recipe.Type.INSTANCE);

        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Main.ID, trader_recipe.Serializer.ID),
                trader_recipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Main.ID, trader_recipe.Type.ID),
                trader_recipe.Type.INSTANCE);
    }
}
