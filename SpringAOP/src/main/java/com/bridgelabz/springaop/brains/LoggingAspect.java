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
 *  @since   14-10-2019
 *
 ******************************************************************************/

package com.bridgelabz.springaop.brains;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
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
	// @Pointcut("execution(* get*())")
	// public void allGetters() {
	// }

	// calling Aspect method when all Circle method called
	// this can also be done using within
	// @Pointcut("execution(* *com.bridgelabz.springaop.brains.Circle.*(..))")
	// public void allCircleMethods() {}

	// within will helps us to call Aspect after every method called within Circle
	// class
	// @Pointcut("within(com.bridgelabz.springaop.brains.Circle)")
	// public void allCircleMethods() {
	// }

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
	// @Before("allCircleMethods()")
	// public void loggingAdvice(JoinPoint joinPoint) {
	// System.out.println(joinPoint.toString());
	// }

	// @Before("allCircleMethods()")
	// public void loggingAdvice(JoinPoint joinPoint) {
	//
	// }

	// @Before("allCircleMethods()")
	// public void loggingAdvice(JoinPoint joinPoint) {
	// System.out.println(joinPoint.getTarget());
	// }

	// for taking all String arguments
	// @Before("args(String)")
	// public void stringArgsMethod() {
	// System.out.println("String arguments method called");
	// }

	// now we are going to pass name
	// in the method arguments
	// in this we are going to get the arguments which can be passed by main method
	// to circle method which will be catch in this method
	// all method with String argument will be called
	// @Before("args(name)")
	// public void stringArgsMethod(String name) {
	// System.out.println("String arguments method called" + name);
	// }

	// trigger the method after execution of the method
	// by using @After
	// after will directly run with checking whether there is error is there or not
	// for avoiding those thing we are going to use @AfterReturning
	// @After("args(name)")
	// public void stringArgsMethod(String name) {
	// System.out.println("String arguments method called" + name);
	// }

	@Before("allCircleMethod()")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Circle method calling");
	}

	// after returning checks for exception in this method if no exception find then
	// only @AfterReturning will be invoked
	// @AfterReturning("args(name)")
	// public void stringArgsMethod(String name) {
	// System.out.println("String arguments method called: " + name);
	// }

	// now to handle the method which is throwing method import
	// org.aspectj.lang.annotation.After;
	// and you want to execute advice after exception
	// @AfterThrowing("args(name)")
	// public void exceptionAdvice(String name) {
	// System.out.println("Execute advice after throwing exception");
	// }

	@After("allGetters()")
	public void print() {
		System.out.println("getters are printing");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
	}

	@Pointcut("within(com.bridgelabz.springaop.brains.Circle)")
	public void allCircleMethod() {
	}

	// if method returning something then execute
	// @AfterReturning("args(name)")
	// public void stringArgsMethod(String name) {
	// System.out.println("String arguments method called: " + name);
	// }

	// add one more property called returning
	// pointcut = "args(name)" is input to method
	// returning = "returnString" is output of the method

	// I am pasting the method here of Circle class to understand
	// the functionality of setting value and how to catch the returning
	// value in advice (please do not uncomment it)
	// public String setNameAndReturning(String name) {
	// this.name = name;
	// return "Rishikesh";
	// }

	// Input: Pass New Circle
	// Output: Rishikesh

	// @AfterReturning(pointcut = "args(name)", returning = "returnString")
	// public void stringArgsMethod(String name, String returnString) {
	// System.out.println("Input: " + name);
	// System.out.println("Output: " + returnString);
	// }

	// to catches all return type make returning as object type
	@AfterReturning(pointcut = "args(name)", returning = "returnString")
	public void stringArgsMethod(String name, Object returnString) {
		System.out.println("Input: " + name);
		System.out.println("Output: " + returnString);
	}

	// catching the thrown exception

	// public void setName(String name) {import org.aspectj.lang.annotation.Afimport
	// org.aspectj.lanimport
	// org.aspectj.lang.annotation.After;g.annotation.After;ter;
	// this.name = name;
	// throw(new RuntimeException());
	// }
	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void exceptionAdvice(String name, Exception ex) {
		System.out.println("Input: " + name);
		System.out.println("Output: " + ex);
	}

	// @Around will called twice before method getting execute and after completing
	// the method execution this advice will be called
	//

	// if the advice method is returning something then creating advice which can
	// handle the returned object
	// @Around("allGetters()")
	// public Object aroundAdviceReturned(ProceedingJoinPoint proceedingJoinPoint) {
	// Object returnedObject = null;
	// try {
	// System.out.println("Before advice");
	// returnedObject = proceedingJoinPoint.proceed();
	// System.out.println("After advice");
	// } catch (Throwable e) {
	// System.out.println("After Throwing");
	// e.printStackTrace();
	// }
	// System.out.println("After finally");
	// return returnedObject;
	// }

	// now if we want some control over calling the method
	// we are going to create new class and understand there

	@Around("@annotation(com.bridgelabz.springaop.brains.Loggable)")
	public Object aroundAdviceReturned(ProceedingJoinPoint proceedingJoinPoint) {
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
