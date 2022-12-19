package com.muates.springbootbasicexample.service.impl;

import com.muates.springbootbasicexample.converter.CustomerConverter;
import com.muates.springbootbasicexample.exception.CustomerNotFoundException;
import com.muates.springbootbasicexample.model.dto.request.CustomerAddRequest;
import com.muates.springbootbasicexample.model.dto.request.CustomerUpdateRequest;
import com.muates.springbootbasicexample.model.dto.response.CustomerResponse;
import com.muates.springbootbasicexample.model.entity.Customer;
import com.muates.springbootbasicexample.repository.CustomerRepository;
import com.muates.springbootbasicexample.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerResponse addCustomer(CustomerAddRequest request) {
        Customer customer = CustomerConverter.convertToCustomer(request);

        CustomerResponse response = CustomerConverter
                .convertToResponse(customerRepository.save(customer));

        return response;
    }

    @Override
    public CustomerResponse getCustomer(Long id) {
        Optional<Customer> customer = customerRepository.findById(id);

        if (customer.isEmpty())
            throw new CustomerNotFoundException("CustomerId doesn't exist");

        return CustomerConverter.convertToResponse(customer.get());
    }

    @Override
    public CustomerResponse updateCustomer(CustomerUpdateRequest request) {
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {

    }

    @Override
    public List<CustomerResponse> getCustomers() {
        return null;
    }
}
