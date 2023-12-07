package com.momen.studentSystem.exception;

public class NotFoundException extends RuntimeException{

    public NotFoundException(){}

    public NotFoundException(String message) {
        super(message);
    }
}
