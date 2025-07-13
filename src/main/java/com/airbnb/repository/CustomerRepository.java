package com.airbnb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airbnb.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
