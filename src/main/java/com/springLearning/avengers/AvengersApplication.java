/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 21, 2019
 */

package com.springLearning.avengers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springLearning.avengers.service.AvengersService;

/**
 * @author n0241133
 *
 */
public interface AvengersApplication {
	
	public static void main (String [] args){
		
		ApplicationContext applContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AvengersService avengersService = applContext.getBean("avengersService",AvengersService.class);
		
		System.out.println("First Avenger is "+avengersService.findAllAvengers().get(1).getFirstName()+ " "+avengersService.findAllAvengers().get(1).getLastName());
	}
	
}
