package com.bridgelabz.springaop.brains.proxies;

public class ShapeService {

	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		System.out.println("Circle getter called");
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Triangle getTriangle() {
		return triangle;
	}

	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}

}
