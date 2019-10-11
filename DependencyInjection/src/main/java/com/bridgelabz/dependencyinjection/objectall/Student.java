/******************************************************************************
 *  Purpose: Class which has setter method of object which will inject from 
 *  		 bean
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.dependencyinjection.objectall;

public class Student {
	private Cheat cheat;

	public void setCheat(Cheat cheat) {

		this.cheat = cheat;
	}

	public void startCheat() {
		cheat.cheat();
	}

}
