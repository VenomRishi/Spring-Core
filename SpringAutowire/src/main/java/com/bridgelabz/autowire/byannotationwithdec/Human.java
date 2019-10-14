/******************************************************************************
 *  Purpose: Program is written for consuming the Heart class in this class
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.autowire.byannotationwithdec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("heartObj6")
	private Heart heart;

	public void startPumping() {
		heart.pump();
	}
}
