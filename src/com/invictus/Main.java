package com.invictus;

import com.invictus.framework.Invictus_Patcher;
import com.invictus.log.LogLevel;
import com.invictus.log.Logger;

public class Main {
	
	// Final variable
	public static final String VERSION = "0.0";
	public static final LogLevel LOGLEVEL = LogLevel.DEBUG;

	public static void main(String[] args) {
		
		Logger.logInfo("Starting Patcher");
		
		// Create patcher
		Invictus_Patcher patcher = new Invictus_Patcher();
		
		// Load data
		
		// Display to user
		
		// End
		
		Logger.logInfo("End of Startup");

	}

}
