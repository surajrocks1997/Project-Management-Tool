package com.pjtmgmt.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class ProjectIdException extends RuntimeException{

	public ProjectIdException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	
}
