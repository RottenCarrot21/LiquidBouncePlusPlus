/*
 * LiquidBounce+ Hacked Client
 * A free open source mixin-based injection hacked client for Minecraft using Minecraft Forge.
 * https://github.com/WYSI-Foundation/LiquidBouncePlus/
 */
package net.ccbluex.liquidbounce.features.module.modules.render;

import net.ccbluex.liquidbounce.features.module.Module;
import net.ccbluex.liquidbounce.features.module.ModuleCategory;
import net.ccbluex.liquidbounce.features.module.ModuleInfo;
import net.ccbluex.liquidbounce.ui.client.clickgui.newVer.NewUi;
import net.ccbluex.liquidbounce.value.BoolValue;

@ModuleInfo(name = "NewGUI", description = "next generation clickgui.", category = ModuleCategory.RENDER, forceNoSound = true, onlyEnable = true)
public class NewGUI extends Module {
    public static final BoolValue fastRenderValue = new BoolValue("FastRender", false);
    @Override
    public void onEnable() {
        mc.displayGuiScreen(NewUi.getInstance());
    }
}
