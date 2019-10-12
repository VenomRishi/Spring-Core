package com.bridgelabz.autowire.byannotationwithdec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("heartObj6")
	private Heart heart;

	public void startPumping() {
		heart.pump();
	}
}
