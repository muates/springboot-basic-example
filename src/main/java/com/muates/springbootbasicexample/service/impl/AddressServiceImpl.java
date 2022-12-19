package com.muates.springbootbasicexample.service.impl;

import com.muates.springbootbasicexample.converter.AddressConverter;
import com.muates.springbootbasicexample.model.dto.request.AddressAddRequest;
import com.muates.springbootbasicexample.model.dto.response.AddressResponse;
import com.muates.springbootbasicexample.model.entity.Address;
import com.muates.springbootbasicexample.model.entity.Customer;
import com.muates.springbootbasicexample.repository.AddressRepository;
import com.muates.springbootbasicexample.repository.CustomerRepository;
import com.muates.springbootbasicexample.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;
    private final CustomerRepository customerRepository;

    @Override
    public AddressResponse addAddress(AddressAddRequest request) {
        Customer existCustomer = customerRepository.findById(request.getCustomerId())
                .orElseThrow(() -> new RuntimeException());

        Address address = AddressConverter.convertToAddress(request);
        address.setCustomer(existCustomer);

        return AddressConverter.convertToResponse(addressRepository.save(address));
    }

    @Override
    public AddressResponse findAddressById(Long id) {
        Address existAddress = addressRepository.findById(id)
                .orElseThrow(() -> new RuntimeException());

        return AddressConverter.convertToResponse(existAddress);
    }
}
