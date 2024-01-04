package com.exception.handler.Service;

import com.exception.handler.ExceptionHandler.CustomerNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class EmployeeInfo {
    public String getCustomerNameById(Integer customerId) {
        if (customerId >= 100) {
            return "John";
        } else {
            throw new CustomerNotFoundException("Invalid customer id");
        }
    }
}