/******************************************************************************
 *  Purpose: Program is written for configuring the application with the use
 *  		 @Configuration annotation which can provide object to application
 *  		 @ComponentScan is used to scan the whole package and creates object
 *  		 @PropertySource is used for injecting properties of college in app
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-10-2019
 *
 ******************************************************************************/


package com.bridgelabz.annotation.qualifier;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.bridgelabz.annotation.qualifier")
@PropertySource("classpath:college_info.properties")
public class CollegeConfig {

}
