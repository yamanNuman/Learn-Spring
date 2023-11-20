package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

<<<<<<< HEAD
//currency-service.url
//currency-service.username
//currency-service.key


=======
>>>>>>> 37e004928bb2f2f64562eec1e1373cd27862b3ad
@ConfigurationProperties(prefix="currency-service")
@Component
public class CurrencyServiceConfiguration {

	private String url;
<<<<<<< HEAD
	private String username;
	private String key;
		
=======
	private String name;
	private String key;
	
>>>>>>> 37e004928bb2f2f64562eec1e1373cd27862b3ad
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
<<<<<<< HEAD
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
=======
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
>>>>>>> 37e004928bb2f2f64562eec1e1373cd27862b3ad
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}
