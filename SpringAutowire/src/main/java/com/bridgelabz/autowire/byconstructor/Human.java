package com.bridgelabz.autowire.byconstructor;

public class Human {

	private Heart heart;

	public Human(Heart heart) {
		this.heart = heart;
	}

	public void startPumping() {
		heart.pump();
	}
}
