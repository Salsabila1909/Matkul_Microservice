package com.teknologiinformasi.restapi.costumer.customerService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teknologiinformasi.restapi.costumer.customerService.model.Customer;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}