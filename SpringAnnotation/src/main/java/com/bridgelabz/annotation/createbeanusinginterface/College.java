/******************************************************************************
 *  Purpose: Program is written for providing college functionality in
 *  		 application it uses @Component annotation for making object of the
 *  		 class and injection of value it is used @Value and for injecting 
 *  		 object into this class it uses @Autowired annotation
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.annotation.createbeanusinginterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("BVIMIT")
	private String collegeName;

	@Autowired
	private Teacher teacher;

	public void disp() {
		System.out.println("College name: " + collegeName);
		teacher.teach();
	}
}
