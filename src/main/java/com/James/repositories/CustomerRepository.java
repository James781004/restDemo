package com.James.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.James.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
