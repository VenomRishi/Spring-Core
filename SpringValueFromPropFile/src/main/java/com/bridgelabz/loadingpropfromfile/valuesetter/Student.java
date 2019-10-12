package com.bridgelabz.loadingpropfromfile.valuesetter;


import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

@SuppressWarnings("deprecation")
public class Student {
	private String name;
	private String interestedCource;
	private String hobby;

//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setInterestedCource(String interestedCource) {
//		this.interestedCource = interestedCource;
//	}
//
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//	}

	// setting property by using annotation
	
//	@Value("Rishikesh")
//	public void setName(String name) {
//		this.name = name;
//	}
//	@SuppressWarnings("deprecation")
//	@Required
//	@Value("Java")
//	public void setInterestedCource(String interestedCource) {
//		this.interestedCource = interestedCource;
//	}
//	@Value("Badminton")
//	public void setHobby(String hobby) {
//		this.hobby = hobby;
//	}
	
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}
	@Required
	@Value("${student.interestedCource}")
	public void setInterestedCource(String interestedCource) {
		this.interestedCource = interestedCource;
	}
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void displayStudentInfo() {
		System.out.println("Student name: " + name);
		System.out.println("Student interested course: " + interestedCource);
		System.out.println("Student hobby: " + hobby);
	}
}
