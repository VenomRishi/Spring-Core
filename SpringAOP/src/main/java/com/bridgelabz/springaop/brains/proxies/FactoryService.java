package com.bridgelabz.springaop.brains.proxies;


public class FactoryService {

	public Object getBean(String beanType) {
		if(beanType.equals("shapeService")) return new ShapeServiceProxy();
		if(beanType.equals("circle")) return new Circle();
		if(beanType.equals("triagle")) return new Triangle();
		return null;
	}
}
