package com.muates.springbootbasicexample.controller.mutation;

import com.muates.springbootbasicexample.model.dto.request.AddressAddRequest;
import com.muates.springbootbasicexample.model.dto.response.AddressResponse;
import com.muates.springbootbasicexample.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class AddressMutationController {

    private final AddressService addressService;

    @MutationMapping
    public AddressResponse addAddress(@Argument AddressAddRequest request) {
        return addressService.addAddress(request);
    }
}
