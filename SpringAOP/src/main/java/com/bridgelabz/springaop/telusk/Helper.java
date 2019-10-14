/******************************************************************************
 *  Purpose: Program is written for Helping other classes which can required
 *  		 loging, security and transaction related service
 *  		 @Aspect will help to create Aspect class
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springaop.telusk;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//advice -> what should be called -> before after
//pointcut -> Where when

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	@Before("execution(public void show())")
	public void log() {
		System.out.println("logging the message");
	}

}
