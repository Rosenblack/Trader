package net.shale.horde.trader;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class items {
    public static final Item COMPOUND_LIQUID_FLASK = registerItem("compound_liquid_flask", new Item(new FabricItemSettings()
            .group(ItemGroup.BREWING)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Main.ID, name), item);
    }

    public static void registerModItems() {
    }
}
