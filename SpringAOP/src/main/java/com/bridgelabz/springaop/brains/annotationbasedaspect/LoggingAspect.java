/******************************************************************************
 *  Purpose: Program is written for putting the aspect by using @Aspect 
 *  		 annotation @Before will be invoked before getName() method called
 *  		 this class has now elaborated so much of annotations
 *  		 @After @Before @AfterReturning @BeforeReturning
 *  		 @AfterThrowing @BeforeThrowing
 *  		 @Pointcut
 *  		 JoinPoint in order to support around advice in aspect
 *  		 @Around
 *  		 
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   15-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springaop.brains.annotationbasedaspect;

import org.aspectj.lang.ProceedingJoinPoint;


public class LoggingAspect {

//	@Around("@annotation(com.bridgelabz.springaop.brains.annotationbasedaspect.Loggable)")
//	public Object aroundAdviceReturned(ProceedingJoinPoint proceedingJoinPoint) {
//		Object returnedObject = null;
//		try {
//			System.out.println("Before advice");
//			returnedObject = proceedingJoinPoint.proceed();
//			System.out.println("After advice");
//		} catch (Throwable e) {
//			System.out.println("After Throwing");
//			e.printStackTrace();
//		}
//		System.out.println("After finally");
//		return returnedObject;
//	}
//	@Around("allGetters())")
//	public Object aroundAdviceReturnedAllGetters(ProceedingJoinPoint proceedingJoinPoint) {
//		Object returnedObject = null;
//		try {
//			System.out.println("Before advice");
//			returnedObject = proceedingJoinPoint.proceed();
//			System.out.println("After advice");
//		} catch (Throwable e) {
//			System.out.println("After Throwing");
//			e.printStackTrace();
//		}
//		System.out.println("After finally");
//		return returnedObject;
//	}
	
//	@Pointcut("execution(* get*())")
//	public void allGetters() {}

	public Object aroundAdviceReturnedAllGetters(ProceedingJoinPoint proceedingJoinPoint) {
		Object returnedObject = null;
		try {
			System.out.println("Before advice");
			returnedObject = proceedingJoinPoint.proceed();
			System.out.println("After advice");
		} catch (Throwable e) {
			System.out.println("After Throwing");
			e.printStackTrace();
		}
		System.out.println("After finally");
		return returnedObject;
	}
}
