package com.in28minutes.learnspringframework.examples.a4;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass {
	private SomeDependency someDependency;
	
	public SomeClass(SomeDependency someDependency) {
		super();
		this.someDependency = someDependency;
		System.out.println("All Dependencies are ready!");
	}
	
	@PostConstruct
	public void initialize() {
		someDependency.getReady();
	}
	@PreDestroy
	public void cleanUp() {
		System.out.println("Cleanup");
	}
}


@Component
class SomeDependency {

	public void getReady() {
		System.out.println("Some logic using SomeDependency");
	}
	
}
@Configuration
//default automatic package scan
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
		
		public static void main(String[] args) {
			try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {	
				
				//All bean name
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			}
		}
		
	
}
