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
