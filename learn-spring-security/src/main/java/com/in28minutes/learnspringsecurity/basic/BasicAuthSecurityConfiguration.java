package com.in28minutes.learnspringsecurity.basic;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

//@Configuration
public class BasicAuthSecurityConfiguration {

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(auth -> {
			auth.anyRequest().authenticated();
		});

		http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.csrf(csrf -> csrf.disable());
		http.headers(h -> {
			h.frameOptions(f -> f.sameOrigin());
		});
		http.httpBasic(Customizer.withDefaults());
		
		return http.build();
	}

	@Bean
	public UserDetailsService userDetailService(DataSource dataSource) {
		var user = User.withUsername("user")
				.password("dummy")
				.passwordEncoder(str -> passwordEncoder().encode(str))
				.roles("USER").build();
		var admin = User.withUsername("admin")
				.password("dummy")
				.passwordEncoder(str -> passwordEncoder().encode(str))
				.roles("ADMIN").build();
		
		var jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
		jdbcUserDetailsManager.createUser(user);
		jdbcUserDetailsManager.createUser(admin);
		return jdbcUserDetailsManager;
	}

	@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2)
				.addScript(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION).build();
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
