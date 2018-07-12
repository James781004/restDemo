package com.James.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.James.domain.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Long> {
}
