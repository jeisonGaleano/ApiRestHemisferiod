package com.hemisferiod.apirest.vendors.repository;

import com.hemisferiod.apirest.shared.entity.Vendors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorsRepository extends JpaRepository<Vendors, Integer> {

    Vendors findByDocumentVendor(Long document);
}
