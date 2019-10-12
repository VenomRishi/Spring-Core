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
