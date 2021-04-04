package com.luv2code.springdemo;

import java.io.IOException;
import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.springdemo.service.TraficFourtuneService;


public class MainDemoAroundWithLogger {
	
	private static Logger myLogger = 
			Logger.getLogger(MainDemoAroundWithLogger.class.getName());
	
	public static void main(String[] args) throws IOException, Exception {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		TraficFourtuneService traficFourtuneService = context.getBean("traficFourtuneService" , TraficFourtuneService.class);
		
		// call the getFourtune method
		myLogger.info("\nMain Program: AroundDemoApp");
		myLogger.info("-----");
		boolean TripeWire = true;
		String data = traficFourtuneService.getFourtune(TripeWire);
		myLogger.info("\nMy Fourtune is: " + data);
		myLogger.info("Finished...");
	    context.close();
	}

}
