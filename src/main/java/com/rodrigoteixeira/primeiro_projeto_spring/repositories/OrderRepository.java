package com.rodrigoteixeira.primeiro_projeto_spring.repositories;

import com.rodrigoteixeira.primeiro_projeto_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
