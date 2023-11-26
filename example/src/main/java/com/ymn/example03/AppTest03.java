package com.ymn.example03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppTest03 {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(AppTest03.class)){
			context.getBean(BusinessService.class).connect();
			context.getBean(BusinessService.class).close();
			System.out.println(context.getBean(PostgreSQL.class));
			System.out.println(context.getBean(PostgreSQL.class));
			System.out.println(context.getBean(PostgreSQL.class));
			System.out.println(context.getBean(PostgreSQL.class));
			
			System.out.println(context.getBean(MySQL.class));
			System.out.println(context.getBean(MySQL.class));
			System.out.println(context.getBean(MySQL.class));
		}
	}
}
