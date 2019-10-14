/******************************************************************************
 *  Purpose: Program is written for configuring the application with the use
 *  		 @Configuration annotation which can provide object to application
 *  		 in this class we are creating @Bean mannually for each class object
 *  		 which we want to use it in our application
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.annotation.createbeanusingconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {
	
	@Bean
	public Principal principalBean() {
		return new Principal();
	}

	@Bean
	public College collegeBean() {
		College college=new College(principalBean());
		return college;
	}

}
