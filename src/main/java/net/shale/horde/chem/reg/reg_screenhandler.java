package net.shale.horde.chem.reg;

import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.shale.horde.chem.Main;
import net.shale.horde.chem.screen.test_block_screenhandler;

public class reg_screenhandler {
    public static ScreenHandlerType<test_block_screenhandler> TEST_BLOCK_SCREENHANDLER =
            ScreenHandlerRegistry.registerSimple(new Identifier(Main.ID, "test_block"),
                    test_block_screenhandler::new);
}
