package com.muates.springbootbasicexample.controller.query;

import com.muates.springbootbasicexample.model.dto.response.CustomerResponse;
import com.muates.springbootbasicexample.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class CustomerQueryController {

    private final CustomerService customerService;

    @QueryMapping
    public CustomerResponse findCustomerId(@Argument Long id) {
        return customerService.getCustomer(id);
    }
}
