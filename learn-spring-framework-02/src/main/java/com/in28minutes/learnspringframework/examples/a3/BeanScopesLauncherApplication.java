package com.in28minutes.learnspringframework.examples.a3;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//default automatic package scan
@ComponentScan
public class BeanScopesLauncherApplication {
		
		public static void main(String[] args) {
			try(var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {	
				
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			}
		}
		
	
}
