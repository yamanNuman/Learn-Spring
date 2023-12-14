package com.in28minutes.rest.webservices.restfulwebservices.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class BasicAuthenticationSecurityConfiguration {
	//Filter Chain
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		//authentication all request
		http.authorizeHttpRequests(auth -> auth.antMatchers(HttpMethod.OPTIONS,"/**").permitAll().anyRequest().authenticated());
		//basic authentication
		http.httpBasic(Customizer.withDefaults());
		//stateless Rest API
		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		//Disable CSRF
		http.csrf(csrf -> csrf.disable());
		return http.build();
		
	}
}
