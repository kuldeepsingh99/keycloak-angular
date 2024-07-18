package com.portal.customer.controller;

import com.portal.customer.bean.MyData;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {


    @GetMapping("/api/v1/customers")
    @PreAuthorize("hasAuthority('ROLE_CUSTOMER_READ')")
    public String customer(){
        return "all-customers";
    }

    @PostMapping("/api/v1/customer")
    @PreAuthorize("hasAuthority('ROLE_CUSTOMER_WRITE')")
    public String handlePostRequest(@RequestBody MyData myData) {
        return "Received POST request with data: " + myData.getName() + ", " + myData.getAge() + " years old.";
    }

    @GetMapping("/api/v2/customers")
    public String unsecuredCustomer(){
        return "all-customers-unsecured";
    }
}
