/******************************************************************************
 *  Purpose: Program is written for providing bike functionality in
 *  		 application it uses @Component annotation for making object of the
 *  		 class @Value annotation is used to injecting the variable name
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/

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
