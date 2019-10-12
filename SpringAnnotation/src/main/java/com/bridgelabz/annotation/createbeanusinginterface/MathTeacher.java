package com.bridgelabz.annotation.createbeanusinginterface;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Teacher of maths");

	}

}
