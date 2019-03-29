/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 29, 2019
 */

package com.springLearning.avengers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springLearning.avengers.service.AvengersService;
import com.springLearning.avengers.service.AvengersServiceImpl;

/**
 * @author n0241133
 *
 */
@Configuration
@ComponentScan("com.springLearning.avengers")
public class AppConfig {

	//@Bean("avengersService")
	//public AvengersService getAvengersService(){
//		AvengersService service = new AvengersServiceImpl();
		//return service;
	//}
}
