package com.example.weTraveller.exception;


public class NotFoundException extends ServiceException{
    public NotFoundException() {
        super("exception.not_found");
    }
}
