package com.bridgelabz.annotation.createbeanusingconfig;

public class College {

	private Principal principal;

	public College(Principal principal) {
		this.principal = principal;
	}

	public void disp() {
		principal.disp();
		System.out.println("College class is invoked");
	}
}
