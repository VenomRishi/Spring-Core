/******************************************************************************
 *  Purpose: Program is written for consuming the Heart class in this class
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.autowire.bytype;



public class Human {
	
	private Heart heart;

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();
	}
}
