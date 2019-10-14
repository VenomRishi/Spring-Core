/******************************************************************************
 *  Purpose: Program is written for providing college functionality in
 *  		 application it uses @Component annotation for making object of the
 *  		 class and for injecting object into this class it uses @Autowired 
 *  		 @Qualifier will reduce the conflict between more than one bean
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;

	public void disp() {

		teacher.teach();
	}
}
