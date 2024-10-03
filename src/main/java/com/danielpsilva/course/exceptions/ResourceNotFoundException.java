package com.danielpsilva.course.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Long id) {
		super("Resouce not  found. Id " + id);
	}
}
