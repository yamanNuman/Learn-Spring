package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
//JDK 16 ile gelmis bir ozellik
record Person (String name, int age, Address address) {};
record Address (String country, String city) {};

@Configuration
//Spring Configuration class define with @Configuration Annotation
public class HelloWorldConfiguration {

	@Bean
	//Bean annotation add Spring Context
	public String name() {
		return "Xabi";
	}
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		var person = new Person("Steven", 15,new Address("Germany","Hamburg"));
		return person;
	}
	
	@Bean
	public Person person2() {
		return new Person(name(),age(),address2());
	}
	
	@Bean
	public Person person3(String name, int age, Address address) {
		return new Person(name,age,address);
	}
	
	@Bean
	public Person person4(@Qualifier("qualifierAddress") Address address) {
		return new Person("Perotti",28,address);
	}
	
	@Bean
	@Primary
	public Address address() {
		var address = new Address("USA", "Florida");
		return address;
	}
	
	@Bean(name="newAddress")
	public Address address2() {
		return new Address("Turkey", "Kocaeli");
	}
	
	@Bean
	@Qualifier("qualifierAddress")
	public Address address3() {
		return new Address("Spain","Barcelona");
	}
}
