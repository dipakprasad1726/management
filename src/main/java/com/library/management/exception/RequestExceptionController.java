package com.library.management.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RequestExceptionController {

  @ExceptionHandler(value = ControlledExceptions.InvalidRequestException.class)
  public ResponseEntity<Object> InvalidRequestException() {
    return new ResponseEntity<>("Invalid request", HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(value = ControlledExceptions.InvalidUserException.class)
  public ResponseEntity<Object> InvalidUserException() {
    return new ResponseEntity<>("Invalid user", HttpStatus.NOT_FOUND);
  }
}
