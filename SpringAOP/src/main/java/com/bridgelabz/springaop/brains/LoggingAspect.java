/******************************************************************************
 *  Purpose: Program is written for putting the aspect by using @Aspect 
 *  		 annotation @Before will be invoked before getName() method called
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   14-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springaop.brains;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	// in this method we are only specifying getName() method
	// @Before("execution(public String getName())")
	// public void loggingAdvice() {
	// System.out.println("Advice run. Get Method called");
	// }

	// in this method we are only specifying getName() method with specifying class
	// name
	// @Before("execution(public String
	// com.bridgelabz.springaop.brains.Triangle.getName())")
	// public void loggingAdvice() {
	// System.out.println("Advice run. Get Method called");
	// }

	// now we are using by the wild card one advice to all getter
	// in this we are not specifying any return type and any get method
	// service class has two get method so it will called twice
	// @Before("execution(public * get*())")
	// public void loggingAdvice() {
	// System.out.println("Advice run. Get Method called");
	// }

	// in this we are ignoring the access specifier and return type of method
	// public String getName(); where public String will going to ignore
	// @Before("execution(* get*())")
	// public void loggingAdvice() {
	// System.out.println("Advice run. Get Method called");
	// }

	// in this will specify if there is any argument in method then it will invoked
	// (*) star puts will tell method should have atleast one argument
	// (..) means it can have 0 arguments or can have multiple arguments
	// @Before("execution(* get*(*))")
	// public void loggingAdvice() {
	// System.out.println("Advice run. Get Method called");
	// }

	// @Before("execution(* get*(..))")
	// public void loggingAdvice() {
	// System.out.println("Advice run. Get Method called");
	// }

	// in this will specify the package name all class method with get starting
	// @Before("execution(* com.bridgelabz.springaop.brains.*.get*())")
	// public void loggingAdvice() {
	// System.out.println("Advice run. Get Method called");
	// }

	// pointcut the point where you cut in the method

	// creating method which will called on point cut
	// @Before("allGetters()")
	// public void loggingAdvice() {
	// System.out.println("Advice run. Get Method called");
	// }

	// @Before("allGetters()")
	// public void secondAdvice() {
	// System.out.println("Second Advice run.");
	// }

	// @Before("allCircleMethods()")
	// public void secondAdvice() {
	// System.out.println("Second Advice run.");
	// }

	// this is dummy method but this is point cut

	// method is going to invoked if they use the allGetters() called in @Before tag
	// at that point @Pointcut expression will going to called
	// use pointcut and match multiple method with same expression
	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	// calling Aspect method when all Circle method called
	// this can also be done using within
	// @Pointcut("execution(* * com.bridgelabz.springaop.brains.Circle.*(..))")
	// public void allCircleMethods() {}

	// within will helps us to call Aspect after every method called within Circle
	// class
	@Pointcut("within(com.bridgelabz.springaop.brains.Circle)")
	public void allCircleMethods() {
	}

	// we can also use wild card in path also
	// @Pointcut("within(om.bridgelabz.springaop.brains..*)")
	// public void allCircleMethods() {
	// }

	// for combining two pointcut's
	// execute if both pointcut's apply
	// @Before("allGetters() && allCircleMethods()")
	// public void loggingAdvice() {
	// System.out.println("Advice run. Get Method called");
	// }

	// now we have to call only when circle getter method called and print message
	// getter
	// and if setter method will called then print message of setter
	// now we are using JoinPoint has information of what method invoked

	// join point is the all places where you want to apply advice
	// by using join point you also can attach advice to literals also even when you
	// are putting for method also
	// in spring aop it is not possible to put advice on literals by using AspectJ
	// join point this can be possible

	// joinPoint().getTarget() this will going to give the target of object in the
	// jvm
	// by using this you want also get object and make changes in it
	@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
	}

}
