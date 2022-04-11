package com.hemisferiod.apirest.shared.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "documento")
    private Long documentClient;

    @Column(name = "nombre")
    private String nameClient;

    @Column(name = "edad")
    private String age;

    @Column(name = "ciudad")
    private String city;

}
