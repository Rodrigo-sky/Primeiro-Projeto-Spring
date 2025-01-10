package com.rodrigoteixeira.primeiro_projeto_spring.config;

import com.rodrigoteixeira.primeiro_projeto_spring.entities.Category;
import com.rodrigoteixeira.primeiro_projeto_spring.entities.Order;
import com.rodrigoteixeira.primeiro_projeto_spring.entities.Product;
import com.rodrigoteixeira.primeiro_projeto_spring.entities.User;
import com.rodrigoteixeira.primeiro_projeto_spring.entities.enums.OrderStatus;
import com.rodrigoteixeira.primeiro_projeto_spring.repositories.CategoryRepository;
import com.rodrigoteixeira.primeiro_projeto_spring.repositories.OrderRepository;
import com.rodrigoteixeira.primeiro_projeto_spring.repositories.ProductRepository;
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

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) {
        Category cat1 = Category.builder().name("Electronics").build();
        Category cat2 = Category.builder().name("Books").build();
        Category cat3 = Category.builder().name("Computers").build();

        Product p1 = Product.builder().name("The Lord of the Rings").description("Lorem ipsum dolor sit amet, consectetur.").price(90.5).imgUrl("").build();
        Product p2 = Product.builder().name("Smart TV").description("Nulla eu imperdiet purus. Maecenas ante.").price(2190.0).imgUrl("").build();
        Product p3 = Product.builder().name("Macbook Pro").description("Nam eleifend maximus tortor, at mollis.").price(1250.0).imgUrl("").build();
        Product p4 = Product.builder().name("PC Gamer").description("Donec aliquet odio ac rhoncus cursus.").price(1200.0).imgUrl("").build();
        Product p5 = Product.builder().name("Rails for Dummies").description("Cras fringilla convallis sem vel faucibus.").price(100.99).imgUrl("").build();

        categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
        productRepository.saveAll(Arrays.asList(p1,p2,p3,p4, p5));

        User u1 = User.builder().nome("Maria Brown").email("maria@gmail.com").phone("988888888").password("123456").build();
        User u2 = User.builder().nome("Alex Green").email("alex@gmail.com").phone("977777777").password("123456").build();

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);


        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
    }
}
