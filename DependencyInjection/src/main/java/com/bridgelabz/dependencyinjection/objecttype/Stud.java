/******************************************************************************
 *  Purpose: Program is written for dependency injection of spring using
 *  		 model class which has id math class injection using xml
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.dependencyinjection.objecttype;

public class Stud {
	private int id;
	private Math math;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Math getMath() {
		return math;
	}

	public void setMath(Math math) {
		this.math = math;
	}

	public void paper() {
		math.math();
		System.out.println("My id: " + id);
	}
}
