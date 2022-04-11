package com.hemisferiod.apirest.products.repository;

import com.hemisferiod.apirest.shared.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

    Products findByCodeProduct(Long code);

}
