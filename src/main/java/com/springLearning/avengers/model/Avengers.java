/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Mar 21, 2019
 */

package com.springLearning.avengers.model;

/**
 * @author n0241133
 *
 */
public class Avengers {

		private String firstName;
		private String lastName;
		
		public Avengers(){
			//No Argument constructor
		}
		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}
		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}
		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
}
