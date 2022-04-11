package com.hemisferiod.apirest.invoices.controller;


import com.hemisferiod.apirest.invoices.dto.InvoicesDTO;
import com.hemisferiod.apirest.invoices.repository.InvoicesRepository;
import com.hemisferiod.apirest.invoices.services.InvoicesService;
import com.hemisferiod.apirest.shared.response.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/invoices", produces = MediaType.APPLICATION_JSON_VALUE)
public class InvoicesController {

    @Autowired
    InvoicesService invoicesService;

    @PostMapping("/create-invoices")
    public ResponseEntity<?> create(@Valid @RequestBody InvoicesDTO invoicesDTO) {
        ResponseModel response = invoicesService.create(invoicesDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/get-invoices/{id}")
    public ResponseEntity<?> findInvoicesById(@PathVariable Long id) {
        ResponseModel response = invoicesService.findInvoicesById(id);
        return ResponseEntity.ok(response);
    }

}
