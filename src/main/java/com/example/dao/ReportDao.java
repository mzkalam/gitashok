package com.example.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReportDao {
	
	private static final Logger logger = LoggerFactory.getLogger(ReportDao.class);
	
	public String getName(Integer id)
	{
		String message=null;
		logger.info("getName() strated");
		
		if(id==10)
		{
			message= "JOHN";	
		}
		else if(id==20)
		{
			message= "MOIZ";	
			
		}
		else if(id==20)
		{
			message= "ASHOK";	
			
		}
		else
		{
			message ="Invalid id";
		}
		logger.info("getName() completed!!!!!!!!!!!");
		return message;
		
		
	}

}
