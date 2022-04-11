package com.hemisferiod.apirest.shared.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "factura")
@Data
public class Invoices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numero_factura")
    private Long numberInvoices;

    @Column(name = "fecha_factura")
    private Date dateInvoices;

    @Column(name = "tipo_pago")
    private Long paymentType;

    @Column(name = "documento_cliente")
    private Long documentClient;

    @Column(name = "nombre_cliente")
    private String nameClient;

    @Column(name = "subtotal")
    private Long subtotal;

    @Column(name = "descuento")
    private Long discount;

    @Column(name = "iva")
    private Long iva;

    @Column(name = "total_descuento")
    private Long totalDiscount;

    @Column(name = "total_impuesto")
    private Long totalTax;

    @Column(name = "total")
    private Long total;

}
