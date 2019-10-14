/******************************************************************************
 *  Purpose: Program is written for showing the functionality of Student
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.loadingpropfromfile.valuefield;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	@Value("${student.name}")
	private String name;
	@Value("${student.interestedCource}")
	private String interestedCource;
	@Value("${student.hobby}")
	private String hobby;

	public void displayStudentInfo() {
		System.out.println("Student name: " + name);
		System.out.println("Student interested course: " + interestedCource);
		System.out.println("Student hobby: " + hobby);
	}
}
