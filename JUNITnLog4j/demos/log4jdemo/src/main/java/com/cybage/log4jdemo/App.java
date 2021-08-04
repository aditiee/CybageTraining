package com.cybage.log4jdemo;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * Hello world!
 *
 */
public class App 
{
	public static Logger logger=Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    		
		//default appender and layout initialisation
PropertyConfigurator.configure("resources/log4j.properties");
		
		logger.info("App Initiated the logger");
		logger.warn("App Warning message");
        
    }
}
