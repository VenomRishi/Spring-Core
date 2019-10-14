/******************************************************************************
 *  Purpose: Program is written for providing car functionality in
 *  		 application it uses @Component annotation for making object of the
 *  		 class
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.mavenproject;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive() {
		System.out.println("Car running");
	}
}
