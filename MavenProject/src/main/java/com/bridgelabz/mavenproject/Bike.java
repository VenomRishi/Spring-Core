package com.bridgelabz.mavenproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	@Autowired
	private Tyre tyre;

	public void drive() {
		System.out.println("Bike running: " + tyre);
	}
}
