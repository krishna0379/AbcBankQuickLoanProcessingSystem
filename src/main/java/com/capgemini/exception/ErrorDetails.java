package com.capgemini.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorDetails {

	private String message;
	private LocalDateTime timestamp;
}
