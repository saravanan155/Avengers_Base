/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 21, 2019
 */

package com.springLearning.avengers;

import com.springLearning.avengers.service.AvengersService;
import com.springLearning.avengers.service.AvengersServiceImpl;

/**
 * @author n0241133
 *
 */
public interface AvengersApplication {
	
	public static void main (String [] args){
		
		AvengersService avengersService = new AvengersServiceImpl() ;
		
		System.out.println("First Avenger is "+avengersService.findAllAvengers().get(1).getFirstName()+" "+avengersService.findAllAvengers().get(1).getLastName());
	}
	
}
