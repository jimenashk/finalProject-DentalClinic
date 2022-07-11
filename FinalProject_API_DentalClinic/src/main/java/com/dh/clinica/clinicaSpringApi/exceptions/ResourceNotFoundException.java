package com.dh.clinica.clinicaSpringApi.exceptions;

public class ResourceNotFoundException extends Exception{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}