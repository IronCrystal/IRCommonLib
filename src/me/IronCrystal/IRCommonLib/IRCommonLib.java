package me.IronCrystal.IRCommonLib;

import org.spout.api.UnsafeMethod;
import org.spout.api.plugin.CommonPlugin;

public class IRCommonLib extends CommonPlugin {

	@Override
	@UnsafeMethod
	public void onDisable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	@UnsafeMethod
	public void onEnable() {
		// TODO Auto-generated method stub
		getLogger().info(getDescription().getVersion() + " enabled.");
	}
}
