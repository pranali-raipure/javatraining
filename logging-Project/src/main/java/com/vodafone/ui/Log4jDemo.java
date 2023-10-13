package com.vodafone.ui;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
 
public class Log4jDemo {

	// Get the Logger object.
	private static Logger log = Logger.getLogger(Log4jDemo.class);
 
	public static void main(String[] args) {

		// Configuring Log4j,It will log all messages on console.
		// BasicConfigurator use ConsoleAppender and PatternLayout 
		// for all loggers.

		BasicConfigurator.configure();
 
		// logger messages
		log.debug("it is a debug message.");
		log.info("is an info message.");		
	}
}
