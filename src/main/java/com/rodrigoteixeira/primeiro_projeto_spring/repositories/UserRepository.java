package com.rodrigoteixeira.primeiro_projeto_spring.repositories;

import com.rodrigoteixeira.primeiro_projeto_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
