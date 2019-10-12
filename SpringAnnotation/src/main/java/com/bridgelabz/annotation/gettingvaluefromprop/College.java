package com.bridgelabz.annotation.gettingvaluefromprop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {

	@Value("${college.collegeName}")
	private String collegeName;

	@Autowired
	private Teacher teacher;

	public void disp() {
		System.out.println("College name: " + collegeName);
		teacher.teach();
	}
}
