package com.example.springbackend.exception;

public class RestrictedInfoException extends Exception {
    @Override
    public String getMessage() {
        return "classified info";
    }
}
