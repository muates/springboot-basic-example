package com.muates.springbootbasicexample.service;

import com.muates.springbootbasicexample.model.dto.request.AddressAddRequest;
import com.muates.springbootbasicexample.model.dto.response.AddressResponse;

public interface AddressService {
    AddressResponse addAddress(AddressAddRequest request);
    AddressResponse findAddressById(Long id);
}
