package com.bridgelabz.annotation.qualifier;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Teacher of science");

	}

}
