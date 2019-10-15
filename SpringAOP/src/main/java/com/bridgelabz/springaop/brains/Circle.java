/******************************************************************************
 *  Purpose: Program is written for specifying the shape of circle
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springaop.brains;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	// public void setName(String name) {
	// this.name = name;
	// }

	// for testing @AfterReturning annotation we are going to create setName method
	// which will going to throw the exception
	
	public void setName(String name) {
		this.name = name;
		throw(new RuntimeException());
	}
	
	public String setNameAndReturning(String name) {
		this.name = name;
		return "Rishikesh";
	}
}
