package com.exception.handler.controller;

import com.exception.handler.Service.EmployeeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeInfo employeeInfo;

    @GetMapping("/getEmployee/{customerId}")
    public String getCustomerName(@PathVariable Integer customerId)  {
        return employeeInfo.getCustomerNameById(customerId);
    }
}