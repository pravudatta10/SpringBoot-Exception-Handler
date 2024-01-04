package com.exception.handler.ExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionhandler {
    @ExceptionHandler(value = CustomerNotFoundException.class)
    public ResponseEntity<ExceptionInfo> responseEntity(CustomerNotFoundException cnf) {
        ExceptionInfo exceptionInfo = new ExceptionInfo();
        exceptionInfo.setCode("12457");
        exceptionInfo.setMsg(cnf.getMessage());
        return new ResponseEntity<>(exceptionInfo, HttpStatus.BAD_REQUEST);
    }
}