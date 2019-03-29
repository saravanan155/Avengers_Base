/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 21, 2019
 */

package com.springLearning.avengers.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springLearning.avengers.model.Avengers;

/**
 * @author n0241133
 *
 */
@Repository("avengerRepository")
public class AvengersRepositoryImpl implements AvengersRepository {
	
	List <Avengers> avengers = new ArrayList();
	
	/* (non-Javadoc)
	 * @see com.springLearning.avengers.repository.AvengersRepository#findAllAvengers()
	 */
	@Override
	public List<Avengers> findAllAvengers (){
		
		Avengers avenger = new Avengers();
		avenger.setFirstName("Tony");
		avenger.setLastName("Stark");
		
		avengers.add(avenger);
		
		Avengers avenger1 = new Avengers();
		avenger1.setFirstName("Steve");
		avenger1.setLastName("Rogers");
		
		avengers.add(avenger1);
		
		return avengers;
		
	}

}
