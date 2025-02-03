package com.rodrigoteixeira.primeiro_projeto_spring.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{

    @Serial
    private static final long serialVersionUID = 1L;

    public DatabaseException(String mensagem) {
        super(mensagem);
    }
}
