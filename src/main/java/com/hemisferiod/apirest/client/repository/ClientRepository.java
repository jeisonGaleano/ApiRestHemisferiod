package com.hemisferiod.apirest.client.repository;

import com.hemisferiod.apirest.shared.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

    Client findByDocumentClient(Long identification);
}
