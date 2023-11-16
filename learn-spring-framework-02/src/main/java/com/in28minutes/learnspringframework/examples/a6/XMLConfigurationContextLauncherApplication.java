package com.in28minutes.learnspringframework.examples.a6;

import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;

public class XMLConfigurationContextLauncherApplication {
		
		public static void main(String[] args) {
			//XML Configuration Context Create.
			try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {	
				System.out.println("All Beans Name");
				System.out.println("------------------------------");
				Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
				System.out.println("\nAll Bean Value");
				System.out.println("------------------------------");
				System.out.println(context.getBean("name"));
				System.out.println(context.getBean("age"));
				
				context.getBean(GameRunner.class).run();
			}
		}
}
