package com.muates.springbootbasicexample.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class CustomExceptionHandler {

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<?> customerHandler(CustomerNotFoundException e) {
        List<String> detail = new ArrayList<>();
        detail.add(e.getMessage());
        ErrorResponse errorResponse = new ErrorResponse("Customer Not Found", detail);
        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}
