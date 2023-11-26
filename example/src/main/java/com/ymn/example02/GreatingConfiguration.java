package com.ymn.example02;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record LanguageInfo(String country,long numberOfSpeak) {};
record AllGreatings(String greating1,String greating2) {};
@Configuration
public class GreatingConfiguration {
	
	@Bean
	public String greatings1() {
		return "Hello";
	}
	
	@Bean
	public LanguageInfo info() {
		return new LanguageInfo("US English",1_000_000_000);
	}
	
	@Bean 
	public String greatings1Info(LanguageInfo info) {
		return "Hello" + " " + info;
	}
	
	@Bean(name="turkishGreating")
	public String greatings2() {
		return "Selam";
	}
	
	@Bean
	@Qualifier("qualifierInfo")
	public LanguageInfo info2() {
		return new LanguageInfo("Turkey",500_000_000);
	}
	
	@Bean
	@Primary
	public LanguageInfo info3() {
		return new LanguageInfo("Fuck the World !",8_000_000_000L);
	}
	
	@Bean
	public String greatings2Info(@Qualifier("qualifierInfo") LanguageInfo info2) {
		return "Selam " + info2;
	}
	
	@Bean
	public AllGreatings allGreatings2(String greatings1) {
		return new AllGreatings(greatings1, greatings2());
	}
}
