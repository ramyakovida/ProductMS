package com.infy.ordermanagement.ProductMS.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.annotation.AfterThrowing;

import com.infy.ordermanagement.ProductMS.exception.ProductMSException;

public class LoggingAspect {
	@AfterThrowing(pointcut = "execution(* com.infy.ordermanagement.ProductMS.service.*Impl.*(..))", throwing = "exception")	
	public void logExceptionFromService(Exception exception) throws ProductMSException {
			log(exception);
	}

	
	private void log(Exception exception) {
		Logger logger = LogManager.getLogger(this.getClass());
		if(exception.getMessage()!=null ){
			
			logger.info(exception.getMessage());
		}
		else{
			logger.info(exception.getMessage(), exception);
		}
	}

}
