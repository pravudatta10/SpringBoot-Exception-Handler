package com.exception.handler.ExceptionHandler;

import lombok.NoArgsConstructor;


public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException() {
        // TODO Auto-generated constructor stub
    }

    public CustomerNotFoundException(String msg) {
        super(msg);
    }
}