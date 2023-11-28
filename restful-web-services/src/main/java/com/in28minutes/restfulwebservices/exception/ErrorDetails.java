package com.in28minutes.restfulwebservices.exception;

import java.time.LocalDateTime;

public class ErrorDetails {
	
	private LocalDateTime timeStamps;
	private String message;
	private String details;
	
	public ErrorDetails(LocalDateTime timeStamps, String message, String details) {
		super();
		this.timeStamps = timeStamps;
		this.message = message;
		this.details = details;
		
	}

	public LocalDateTime getTimeStamps() {
		return timeStamps;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
}
