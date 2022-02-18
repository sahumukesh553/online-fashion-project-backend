package com.ecommerce.model;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.http.HttpStatus;

import lombok.ToString;
@ToString
public class Message {
	String message;
	private final LocalDateTime timeTamp=LocalDateTime.now();
	private HttpStatus status ;
	public Message(String message, HttpStatus status) {
		super();
		this.message = message;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public LocalDateTime getTimeTamp() {
		return timeTamp;
	}
	

}
