package com.rodrigoteixeira.primeiro_projeto_spring.services;

import com.rodrigoteixeira.primeiro_projeto_spring.entities.Order;
import com.rodrigoteixeira.primeiro_projeto_spring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return OrderService.this.orderRepository.findAll();
    }

    public Order findById(long id) {
        Optional<Order> user = OrderService.this.orderRepository.findById(id);

        return user.orElse(null);
    }
}
