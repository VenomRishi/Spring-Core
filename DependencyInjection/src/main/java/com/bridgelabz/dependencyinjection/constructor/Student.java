/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 construction injection this is model class
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.dependencyinjection.constructor;

public class Student {

	private int id;
	private String name;

	// dependency injection is used using constructor injection
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	/*
	 * // dependency injection is used using setter method
	 * 
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 * 
	 * public String getName() { return name; }
	 * 
	 * public void setName(String name) { this.name = name; }
	 */

}
