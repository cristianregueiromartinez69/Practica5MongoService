package com.example.AD.mongoService.excepciones;

/**
 * Excepcion personalizada del Id
 * @author cristian
 * @version 1.0
 */
public class IdExcepcion extends RuntimeException {
    public IdExcepcion(String message) {
        super(message);
    }
}
