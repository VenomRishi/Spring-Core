package com.bridgelabz.mavenproject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tyre {
	@Value("MRF")
	private String brand;

	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
}
