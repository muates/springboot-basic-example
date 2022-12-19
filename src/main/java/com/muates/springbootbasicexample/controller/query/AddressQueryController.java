package com.muates.springbootbasicexample.controller.query;

import com.muates.springbootbasicexample.model.dto.response.AddressResponse;
import com.muates.springbootbasicexample.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@RequiredArgsConstructor
@Controller
public class AddressQueryController {

    private final AddressService addressService;

    @QueryMapping
    public AddressResponse findAddressById(@Argument Long id) {
        return addressService.findAddressById(id);
    }
}
