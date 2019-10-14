/******************************************************************************
 *  Purpose: Program is written for configuring the application with the use
 *  		 @Configuration annotation which can provide object to application
 *  		 @Bean annotation is used to create object of particular class
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.mavenproject.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class RunnerConfig {
	@Bean
	@Primary
	public Samsung getSamsung() {
		return new Samsung();
	}

	@Bean
	public Lenovo getLenovo() {
		return new Lenovo();
	}
}
