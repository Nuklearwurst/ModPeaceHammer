package com.fravokados.peacehammer.configuration.gui;

import com.fravokados.peacehammer.ModPeaceHammer;
import com.fravokados.peacehammer.lib.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.ArrayList;
import java.util.List;

public class GuiModConfigurataion extends GuiConfig {

	public GuiModConfigurataion(GuiScreen parent) {
		super(parent,
				getConfigElements(),
				Reference.MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ModPeaceHammer.config.config.toString()));
	}

	@SuppressWarnings({ "rawtypes" })
	private static List<IConfigElement> getConfigElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(new ConfigElement<Object>(ModPeaceHammer.config.config.getCategory(Configuration.CATEGORY_GENERAL)));
        return list;
	}
}
