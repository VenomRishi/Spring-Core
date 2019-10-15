package com.bridgelabz.springaop.brains.proxies;

public class Runner {
	public static void main(String[] args) {
		FactoryService factoryService = new FactoryService();
		ShapeService service = (ShapeService) factoryService.getBean("shapeService");

		service.getCircle();

	}
}
