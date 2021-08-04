package com.cybage.log4jdemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class DemoLogFile {
	
	public static void main(String[] args) {
		
		Logger logger=LogManager.getLogger(DemoLogFile.class);
		
		//default appender and layout initialisation
		BasicConfigurator.configure();
		
		logger.info("Initiated the logger");
		logger.warn("Warning message");
	}

}
