/******************************************************************************
 *  Purpose: This class is used to configure application by using java based
 *  		 configuration which also helps spring framework to creating object 
 *  		 of the class
 *  		 @Configuration is used to configure the class and make object
 *  		 @ComponentScan is used to scan all class with component and make 
 *  		 object of it
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springaop.telusk;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.bridgelabz.springaop.demo")
public class AppConfig {

}
