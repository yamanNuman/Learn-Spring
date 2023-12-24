package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Before("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
	public void logMethodCall(JoinPoint joinPoint) {
		logger.info("Before Aspect - {} - {}",joinPoint,joinPoint.getArgs());
		
	}
	
	@After("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
	public void logMethodCallAfterExecution(JoinPoint joinPoint) {
		logger.info("After Aspect - {} has executed.",joinPoint);
	}
	
	@AfterThrowing(
			pointcut = "execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))",
			throwing = "exception"
			)
	public void logMethodCallAfterThrowingExecution(JoinPoint joinPoint,Exception ex) {
		logger.info("AfterThrowing Aspect - {} has executed.Throwing - {}",joinPoint,ex);
	}
	
	@AfterReturning(
			pointcut = "execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))",
			returning = "resultValue")
	public void logMethodCallAfterReturningExecution(JoinPoint joinPoint,Object resultValue) {
		logger.info("AfterReturning Aspect - {} has executed.Result Value - {}",joinPoint,resultValue);
	}
	
	

}
