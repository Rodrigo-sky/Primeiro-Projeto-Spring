package com.rodrigoteixeira.course.entities;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private long id;
    private String nome;
    private String email;
    private String phone;
    private String password;
}
