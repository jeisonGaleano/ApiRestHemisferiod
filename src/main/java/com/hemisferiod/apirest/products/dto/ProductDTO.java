package com.hemisferiod.apirest.products.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class ProductDTO {

    private Long id;
    private Long codeProduct;
    private String nameProduct;
    private Long unityPrice;
    private Long quantityStock;

}
