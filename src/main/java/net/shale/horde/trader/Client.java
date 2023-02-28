package net.shale.horde.trader;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.shale.horde.trader.reg.reg_screenhandler;
import net.shale.horde.trader.screen.trader_screen;
import net.shale.horde.trader.screen.test_block_screen;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(reg_screenhandler.TEST_BLOCK_SCREENHANDLER, test_block_screen::new);
        ScreenRegistry.register(reg_screenhandler.trader_SCREENHANDLER, trader_screen::new);
    }
}
