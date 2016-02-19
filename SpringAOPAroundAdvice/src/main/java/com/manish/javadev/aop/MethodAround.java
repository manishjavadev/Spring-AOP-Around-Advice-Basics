package com.manish.javadev.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodAround implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		Object result = null;

		/* Method before operation */
		System.out.println("Method Before call here only");

		// Actual method called here
		result = methodInvocation.proceed();
		System.out.println("Retrun Value from this "
				+ methodInvocation.getMethod().getName() +" is "+ result);

		/* Method after Operation */
		System.out.println("Method After call here only");
		return result;
	}

}