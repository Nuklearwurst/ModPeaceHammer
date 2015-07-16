package com.fravokados.peacehammer;

import com.fravokados.peacehammer.common.CommonProxy;
import com.fravokados.peacehammer.common.handler.GuiHandler;
import com.fravokados.peacehammer.common.init.ModBlocks;
import com.fravokados.peacehammer.common.init.ModEntities;
import com.fravokados.peacehammer.common.init.ModItems;
import com.fravokados.peacehammer.common.init.ModRecipes;
import com.fravokados.peacehammer.configuration.ConfigHandler;
import com.fravokados.peacehammer.lib.Reference;
import com.fravokados.peacehammer.lib.Strings;
import com.fravokados.peacehammer.lib.util.LogHelper;
import com.fravokados.peacehammer.plugin.PluginManager;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLModDisabledEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, guiFactory = Reference.GUI_FACTORY, canBeDeactivated = false)
public class ModPeaceHammer {

	@Mod.Instance(value = Reference.MOD_ID)
	public static ModPeaceHammer instance;

	@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
	public static CommonProxy proxy;

	public static final CreativeTabs CREATIVE_TABS = new CreativeTabs(Strings.CREATIVE_TAB) {
		@Override
		public Item getTabIconItem() {
			//TODO proper creative tab item icon
			return Item.getItemFromBlock(Blocks.gold_block);
		}
	};

	public static ConfigHandler config;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent evt) {
		//load config
		config = new ConfigHandler(evt.getSuggestedConfigurationFile());
		config.load(true);
		//init networking

		//init keybindings

		//registerItems items
		ModItems.registerItems();
		//registerBlocks blocks
		ModBlocks.registerBlocks();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent evt) {
		//init modintegration
		PluginManager.init();

		//register gui handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		//register TileEntities
		ModBlocks.registerTileEntities();

		//init rendering
		proxy.registerRenderer();

		//register EventHandlers
		proxy.registerEvents();

		//Config handler
		FMLCommonHandler.instance().bus().register(config);

		//load Entities
		ModEntities.init();

		//load recipes
		ModRecipes.init();

		//init networking
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent evt) {
		LogHelper.info(Reference.MOD_NAME + ", version: " + Reference.VERSION + ", has successfully loaded!");
	}

	@Mod.EventHandler
	public void disableMod(FMLModDisabledEvent evt) {
		LogHelper.info("Disabled " + Reference.MOD_NAME + " version: " + Reference.VERSION + "!");
	}
}
