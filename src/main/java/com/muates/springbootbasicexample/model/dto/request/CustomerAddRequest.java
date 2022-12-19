package com.muates.springbootbasicexample.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerAddRequest {

    private String name;
    private String email;
    private String phone;
    private String address;
}
