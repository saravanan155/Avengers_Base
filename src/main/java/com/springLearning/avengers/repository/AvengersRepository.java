/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 21, 2019
 */

package com.springLearning.avengers.repository;

import java.util.List;

import com.springLearning.avengers.model.Avengers;

/**
 * @author n0241133
 *
 */
public interface AvengersRepository {

	List<Avengers> findAllAvengers();

}