package com.rodrigoteixeira.primeiro_projeto_spring.config;

import com.rodrigoteixeira.primeiro_projeto_spring.entities.Category;
import com.rodrigoteixeira.primeiro_projeto_spring.entities.Order;
import com.rodrigoteixeira.primeiro_projeto_spring.entities.User;
import com.rodrigoteixeira.primeiro_projeto_spring.entities.enums.OrderStatus;
import com.rodrigoteixeira.primeiro_projeto_spring.repositories.CategoryRepository;
import com.rodrigoteixeira.primeiro_projeto_spring.repositories.OrderRepository;
import com.rodrigoteixeira.primeiro_projeto_spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) {
        User u1 = User.builder().nome("Maria Brown").email("maria@gmail.com").phone("988888888").password("123456").build();
        User u2 = User.builder().nome("Alex Green").email("alex@gmail.com").phone("977777777").password("123456").build();

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
    }
}
