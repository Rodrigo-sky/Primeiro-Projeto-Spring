package com.rodrigoteixeira.primeiro_projeto_spring.repositories;

import com.rodrigoteixeira.primeiro_projeto_spring.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderitemRepository extends JpaRepository<OrderItem, Long> {

}
