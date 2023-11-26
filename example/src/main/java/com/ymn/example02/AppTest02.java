package com.ymn.example02;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest02 {

	public static void main(String[] args) { 
		
		try(var context = new AnnotationConfigApplicationContext(GreatingConfiguration.class)){
			
			System.out.println("All Bean Count\n---------------------------------------");
			System.out.println(context.getBeanDefinitionCount()+"\n\n");
			System.out.println("All Bean Names\n---------------------------------------");
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println("\n\n");
			System.out.println(context.getBean("greatings1"));
			//System.out.println(context.getBean(LanguageInfo.class));
			System.out.println(context.getBean("info"));
			System.out.println(context.getBean("greatings1Info"));
			System.out.println(context.getBean("turkishGreating"));
			System.out.println(context.getBean("info2"));
			System.out.println(context.getBean(LanguageInfo.class));
			System.out.println(context.getBean("greatings2Info"));
			System.out.println(context.getBean("allGreatings2"));
			
		}
		
	}
}
