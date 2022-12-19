package com.muates.springbootbasicexample.converter;

import com.muates.springbootbasicexample.model.dto.request.AddressAddRequest;
import com.muates.springbootbasicexample.model.dto.response.AddressResponse;
import com.muates.springbootbasicexample.model.entity.Address;

public class AddressConverter {

    public static Address convertToAddress(AddressAddRequest request) {
        if (request == null)
            return null;

        return Address.builder()
                .country(request.getCountry())
                .city(request.getCity())
                .neighbourhood(request.getNeighbourhood())
                .street(request.getStreet())
                .build();
    }

    public static AddressResponse convertToResponse(Address address) {
        if (address == null)
            return null;

        return AddressResponse.builder()
                .id(address.getId())
                .country(address.getCountry())
                .city(address.getCity())
                .neighbourhood(address.getNeighbourhood())
                .street(address.getStreet())
                .customer(CustomerConverter
                        .convertToResponse(address.getCustomer()))
                .build();
    }
}
