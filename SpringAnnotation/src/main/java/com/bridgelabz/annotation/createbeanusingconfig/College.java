/******************************************************************************
 *  Purpose: Program is written for providing college functionality in
 *  		 application
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.annotation.createbeanusingconfig;

public class College {

	private Principal principal;

	public College(Principal principal) {
		this.principal = principal;
	}

	public void disp() {
		principal.disp();
		System.out.println("College class is invoked");
	}
}
