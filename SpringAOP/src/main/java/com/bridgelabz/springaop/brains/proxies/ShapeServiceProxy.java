package com.bridgelabz.springaop.brains.proxies;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle() {
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
