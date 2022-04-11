package com.hemisferiod.apirest.invoices.dto;

import lombok.Data;
import java.util.Date;

@Data
public class InvoicesDTO {

    private Long id;
    private Long numberInvoices;
    private Date dateInvoices;
    private Long paymentType;
    private Long documentClient;
    private String nameClient;
    private Long subtotal;
    private Long discount;
    private Long iva;
    private Long totalDiscount;
    private Long totalTax;
    private Long total;

}
