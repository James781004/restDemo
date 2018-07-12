package com.James.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.James.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findByName(String name);

}
