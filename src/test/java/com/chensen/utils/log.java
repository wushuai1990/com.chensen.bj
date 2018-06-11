package com.chensen.utils;
/**
 * Log类
 */
import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

public class log {
	static{
		PropertyConfigurator.configure("conf/log4j.properties");
	}
	static Logger logger = Logger.getLogger(log.class);
	
	public static void info(String message){
		logger.info(message);
	}
	public static void error(String message){
		logger.error(message);
	}
}
