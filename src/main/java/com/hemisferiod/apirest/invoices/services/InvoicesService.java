package com.hemisferiod.apirest.invoices.services;

import com.hemisferiod.apirest.invoices.dto.InvoicesDTO;
import com.hemisferiod.apirest.invoices.repository.InvoicesRepository;
import com.hemisferiod.apirest.shared.entity.Invoices;
import com.hemisferiod.apirest.shared.message.Message;
import com.hemisferiod.apirest.shared.response.ResponseModel;
import com.hemisferiod.apirest.utils.Time;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InvoicesService {

    @Autowired
    InvoicesRepository invoicesRepository;

    public ResponseModel create(InvoicesDTO invoicesDTO) {
        Invoices invoices = new Invoices();
        invoices = invoicesRepository.findByNumberInvoices(invoicesDTO.getNumberInvoices());
        if (invoices != null && invoices.getNameClient() != null){
            return new ResponseModel(Time.getTime(), "", 201, Message.Success.SUCCESS);
        }
        invoices.setNumberInvoices(invoicesDTO.getNumberInvoices());
        invoices.setDateInvoices(invoicesDTO.getDateInvoices());
        invoices.setNameClient(invoicesDTO.getNameClient());
        invoices.setDocumentClient(invoicesDTO.getDocumentClient());
        invoices.setDiscount(invoicesDTO.getDiscount());
        invoices.setPaymentType(invoicesDTO.getPaymentType());
        invoices.setSubtotal(invoicesDTO.getSubtotal());
        invoices.setIva(invoicesDTO.getIva());
        invoices.setTotal(invoicesDTO.getTotal());
        invoices.setTotalTax(invoicesDTO.getTotalTax());
        invoices.setTotalDiscount(invoicesDTO.getTotalDiscount());
        return new ResponseModel(Time.getTime(), invoicesRepository.save(invoices), 200, Message.Success.CLIENT_CREATED);
    }

    public ResponseModel findInvoicesById(Long id) {
        Invoices invoices = new Invoices();
        invoices = invoicesRepository.findByNumberInvoices(id);
        return new ResponseModel(Time.getTime(), invoices, 200, Message.Success.CLIENT_CREATED);
    }


}
