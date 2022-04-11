package com.hemisferiod.apirest.shared.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tipo_pago")
@Data
public class PaymentType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nombre")
    private String name;
}
