package com.hemisferiod.apirest.invoices.repository;

import com.hemisferiod.apirest.shared.entity.Client;
import com.hemisferiod.apirest.shared.entity.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicesRepository extends JpaRepository<Invoices, Integer> {

    Invoices findByNumberInvoices(Long numberInvoices);

}
