package com.hemisferiod.apirest.vendors.controller;

import com.hemisferiod.apirest.client.dto.ClientDTO;
import com.hemisferiod.apirest.shared.response.ResponseModel;
import com.hemisferiod.apirest.vendors.dto.VendorsDTO;
import com.hemisferiod.apirest.vendors.services.VendorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/vendors", produces = MediaType.APPLICATION_JSON_VALUE)
public class VendorsController {

    @Autowired
    VendorsService vendorsService;

    @PostMapping("/create-vendors")
    public ResponseEntity<?> create(@Valid @RequestBody VendorsDTO vendorsDTO) {
        ResponseModel response = vendorsService.create(vendorsDTO);
        return ResponseEntity.ok(response);
    }
}
