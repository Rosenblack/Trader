package net.shale.horde.chem;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.shale.horde.chem.reg.reg_screenhandler;
import net.shale.horde.chem.screen.test_block_screen;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ScreenRegistry.register(reg_screenhandler.TEST_BLOCK_SCREENHANDLER, test_block_screen::new);
    }
}
