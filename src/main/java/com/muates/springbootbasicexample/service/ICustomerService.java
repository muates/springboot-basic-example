package com.muates.springbootbasicexample.service;

import com.muates.springbootbasicexample.model.dto.request.CustomerAddRequest;
import com.muates.springbootbasicexample.model.dto.request.CustomerUpdateRequest;
import com.muates.springbootbasicexample.model.dto.response.CustomerResponse;

import java.util.List;

public interface ICustomerService {
    CustomerResponse addCustomer(CustomerAddRequest request);
    CustomerResponse getCustomer(Long id);
    CustomerResponse updateCustomer(CustomerUpdateRequest request);
    void deleteCustomer(Long id);
    List<CustomerResponse> getCustomers();
}
