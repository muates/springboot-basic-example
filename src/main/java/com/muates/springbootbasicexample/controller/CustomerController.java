package com.muates.springbootbasicexample.controller;

import com.muates.springbootbasicexample.model.dto.request.CustomerAddRequest;
import com.muates.springbootbasicexample.model.dto.response.CustomerResponse;
import com.muates.springbootbasicexample.service.ICustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private final ICustomerService customerService;

    @PostMapping("/add")
    public CustomerResponse add(@RequestBody CustomerAddRequest request) {
        return customerService.addCustomer(request);
    }


    @GetMapping("/{id}")
    public CustomerResponse getCustomer(@PathVariable Long id) {
        return customerService.getCustomer(id);
    }
}
