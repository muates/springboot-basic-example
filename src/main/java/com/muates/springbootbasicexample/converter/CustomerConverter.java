package com.muates.springbootbasicexample.converter;

import com.muates.springbootbasicexample.model.dto.request.CustomerAddRequest;
import com.muates.springbootbasicexample.model.dto.response.CustomerResponse;
import com.muates.springbootbasicexample.model.entity.Customer;

public class CustomerConverter {

    public static Customer convertToCustomer(CustomerAddRequest request) {
        return Customer.builder()
                .name(request.getName())
                .email(request.getEmail())
                .phone(request.getPhone())
                .address(request.getAddress())
                .build();
    }

    public static CustomerResponse convertToResponse(Customer customer) {
        return CustomerResponse.builder()
                .id(customer.getId())
                .name(customer.getName())
                .email(customer.getEmail())
                .address(customer.getAddress())
                .phone(customer.getPhone())
                .build();
    }
}
