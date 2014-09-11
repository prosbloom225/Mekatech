package mekatech;

import mekatech.common.CommonProxy;
import net.minecraftforge.common.config.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * 
 * Mekatech - An endgame for Mekanism
 * @author prosbloom
 *
 */
@Mod(modid = "mekatech", name = "mekatech", version = "1.0", guiFactory = "mekanism.client.gui.ConfigGuiFactory",
		dependencies = "after:Mekanism")

public class Mekatech {
	
	/** Mekatech logger instance */
	public static Logger logger = LogManager.getLogger("Mekatech");

	/** Mekatech proxy instance */
	//@SidedProxy(clientSide = "mekatech.client.ClientProxy", serverSide = "mekatech.common.CommonProxy")
	//public static CommonProxy proxy;
	
	
	/** Mekatech debug mode */
	public static boolean debug = false;

	/** Mekatech mod instance */
	@Instance("Mekatech")
	public static Mekatech instance;
	
	/** Mekatech configuration */
	public static Configuration configuration;
		
		/** Mekatech version number */
		//public static Version versionNumber = new Version(1,0,0);
	

	@EventHandler
	public void init(FMLInitializationEvent event) 
	{

		System.out.println("INIT");
	}
}
