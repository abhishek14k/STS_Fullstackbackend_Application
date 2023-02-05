package com.demo.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException{

	public UserNotFoundException(Long id) {
		super("Cannot not find the user with id: "+id);
	}
}