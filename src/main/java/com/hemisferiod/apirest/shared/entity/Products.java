package com.hemisferiod.apirest.shared.entity;

import lombok.Data;
import javax.persistence.*;


@Entity
@Table(name = "productos")
@Data
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "codigo")
    private Long codeProduct;

    @Column(name = "producto")
    private String nameProduct;

    @Column(name = "precio_unidad")
    private Long unityPrice;

    @Column(name = "cantidad_stock")
    private Long quantityStock;

}
