/******************************************************************************
 *  Purpose: Program is written for dependency injection and this class is 
 *  		 act as a model of vodaphone class
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   11-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springioc;

public class Vodaphone implements Sim{

	@Override
	public void call() {
		System.out.println("Call using vodaphone sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing using vodaphone sim");
		
	}

}
