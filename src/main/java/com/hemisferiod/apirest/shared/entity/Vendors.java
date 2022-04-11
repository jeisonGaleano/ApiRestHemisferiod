package com.hemisferiod.apirest.shared.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "vendedores")
@Data
public class Vendors {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "documento")
    private Long documentVendor;

    @Column(name = "nombre")
    private String nameClient;

    @Column(name = "edad")
    private Long age;

    @Column(name = "ciudad")
    private String city;
}
