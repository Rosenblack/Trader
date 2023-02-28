package net.shale.horde.trader.reg;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.shale.horde.trader.Main;
import net.shale.horde.trader.screen.trader_screenhandler;
import net.shale.horde.trader.screen.test_block_screenhandler;

public class reg_screenhandler {
    public static ScreenHandlerType<test_block_screenhandler> TEST_BLOCK_SCREENHANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Main.ID, "test_block"),
                    test_block_screenhandler::new);
    public static ScreenHandlerType<trader_screenhandler> trader_SCREENHANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Main.ID, "trader"),
                    trader_screenhandler::new);
}
