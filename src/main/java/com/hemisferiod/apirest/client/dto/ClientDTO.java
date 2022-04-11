package com.hemisferiod.apirest.client.dto;

import lombok.Data;

@Data
public class ClientDTO {

    private Long id;
    private Long documentClient;
    private String nameClient;
    private String age;
    private String city;

}
