package com.bridgelabz.springioc;

public class Vodaphone implements Sim{

	@Override
	public void call() {
		System.out.println("Call using vodaphone sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing using vodaphone sim");
		
	}

}
