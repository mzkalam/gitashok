package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MessageService {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageService.class);
	
	public String greetingMsg()
	{
                String str = "Vishal";
		logger.debug("greeting()-method started");
		String greeting = "Good Morning-----!!!!";
		logger.debug("greeting()-method completed");
		return greeting;	
	}
		
	public String getWelcomeMsg()
	{
		logger.debug("getWelcomeMsg()- started");
		String message ="Welcome to LOG4J";
		logger.debug("getWelcomeMsg() end");
		
		return message;
		
	}
}