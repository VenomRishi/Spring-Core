/******************************************************************************
 *  Purpose: Program is written for providing MathTeacher functionality and 
 *  		 this class in implementing Teacher interface
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.annotation.createbeanusinginterface;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Teacher of maths");

	}

}
