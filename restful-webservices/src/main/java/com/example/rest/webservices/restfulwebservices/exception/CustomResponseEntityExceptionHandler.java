package com.example.rest.webservices.restfulwebservices.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

/****************************************************************************
 * This is the handler for all the exceptions thrown from this application
 *
 * @author ankurshukla
 ****************************************************************************/
@ControllerAdvice
@RestController
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception e, WebRequest request) {

        CustomExceptionModeller exceptionResponse = new CustomExceptionModeller(new Date(), e.getMessage(), request.getDescription(true));

        return new ResponseEntity(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UserNotFoundException.class)
    public final ResponseEntity<Object> handleUserNotFoundExceptions(UserNotFoundException e, WebRequest request) {

        CustomExceptionModeller exceptionResponse = new CustomExceptionModeller(new Date(), e.getMessage(), request.getDescription(true));

        return new ResponseEntity(exceptionResponse, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CannotDeleteException.class)
    public final ResponseEntity<Object> CannotDeleteUserExceptions(CannotDeleteException e, WebRequest request) {

        CustomExceptionModeller exceptionResponse = new CustomExceptionModeller(new Date(), e.getMessage(), request.getDescription(true));

        return new ResponseEntity(exceptionResponse, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        CustomExceptionModeller exceptionResponse = new CustomExceptionModeller(new Date(), ex.getMessage(), ex.getBindingResult().getFieldError().getDefaultMessage());

        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
