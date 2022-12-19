package com.muates.springbootbasicexample.controller.mutation;

import com.muates.springbootbasicexample.model.dto.request.CustomerAddRequest;
import com.muates.springbootbasicexample.model.dto.response.CustomerResponse;
import com.muates.springbootbasicexample.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class CustomerMutationController {

    private final CustomerService customerService;

    @MutationMapping
    public CustomerResponse addCustomer(@Argument CustomerAddRequest request) {
        return customerService.addCustomer(request);
    }
}
