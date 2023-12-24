package com.in28minutes.learnspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class CommonPointcutConfig {

	@Pointcut("execution(* com.in28minutes.learnspringaop.aopexample.*.*.*(..))")
	public void businessPackageConfig() {
		
	}
}
