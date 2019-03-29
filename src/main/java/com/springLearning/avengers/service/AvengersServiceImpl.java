/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 21, 2019
 */

package com.springLearning.avengers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springLearning.avengers.model.Avengers;
import com.springLearning.avengers.repository.AvengersRepository;

/**
 * @author n0241133
 *
 */
@Service("avengersService")
public class AvengersServiceImpl implements AvengersService {

	AvengersRepository avengersRepository;	
	
	public AvengersServiceImpl(){
		
	}
	@Autowired
	public AvengersServiceImpl (AvengersRepository avengersRepository){
		System.out.println("from Contructor");
		this.avengersRepository = avengersRepository;
	}
	
	/**
	 * @param avengersRepository the avengersRepository to set
	 */
	
	public void setAvengersRepository(AvengersRepository avengersRepository) {
		System.out.println("from Setter");
		this.avengersRepository = avengersRepository;
	}

	/* (non-Javadoc)
	 * @see com.springLearning.avengers.service.AvengersService#findAllAvengers()
	 */
	public List<Avengers> findAllAvengers(){
		return  avengersRepository.findAllAvengers();
	}
}
