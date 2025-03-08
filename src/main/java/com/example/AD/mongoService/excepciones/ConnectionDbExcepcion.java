package com.example.AD.mongoService.excepciones;

public class ConnectionDbExcepcion extends RuntimeException {
    public ConnectionDbExcepcion(String message) {
        super(message);
    }
}
