package com.hemisferiod.apirest.client.controller;

import com.hemisferiod.apirest.client.dto.ClientDTO;
import com.hemisferiod.apirest.client.services.ClientService;
import com.hemisferiod.apirest.shared.response.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/client", produces = MediaType.APPLICATION_JSON_VALUE)
public class ClientController {

    @Autowired
    ClientService clientService;

    @PostMapping("/create-client")
    public ResponseEntity<?> create(@Valid @RequestBody ClientDTO clientDTO) {
        ResponseModel response = clientService.create(clientDTO);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update-client")
    public ResponseEntity<?> update(@Valid @RequestBody ClientDTO clientDTO) {
        ResponseModel response = clientService.update(clientDTO);
        return ResponseEntity.ok(response);
    }


}
