package com.rodrigoteixeira.primeiro_projeto_spring.repositories;

import com.rodrigoteixeira.primeiro_projeto_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
