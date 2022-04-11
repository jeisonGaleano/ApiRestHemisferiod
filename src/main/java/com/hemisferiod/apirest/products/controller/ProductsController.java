package com.hemisferiod.apirest.products.controller;


import com.hemisferiod.apirest.client.dto.ClientDTO;
import com.hemisferiod.apirest.products.dto.ProductDTO;
import com.hemisferiod.apirest.products.service.ProductService;
import com.hemisferiod.apirest.shared.response.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "api/products", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProductsController {

    @Autowired
    ProductService productService;

    @PostMapping("/create-product")
    public ResponseEntity<?> create(@Valid @RequestBody ProductDTO productDTO) {
        ResponseModel response = productService.create(productDTO);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update-product")
    public ResponseEntity<?> update(@Valid @RequestBody ProductDTO productDTO) {
        ResponseModel response = productService.update(productDTO);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/update-stock")
    public ResponseEntity<?> updateStock(@Valid @RequestBody ProductDTO productDTO) {
        ResponseModel response = productService.increaseStock(productDTO);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/stock-product-all")
    public ResponseEntity<?> findStockAll() {
        ResponseModel response = productService.findStockAll();
        return ResponseEntity.ok(response);
    }

}
