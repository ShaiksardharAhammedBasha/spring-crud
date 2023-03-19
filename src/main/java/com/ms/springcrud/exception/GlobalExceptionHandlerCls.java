package com.ms.springcrud.exception;

public class GlobalExceptionHandlerCls extends Exception {
    String message;

    public GlobalExceptionHandlerCls(String message) {
        this.message  = message;
    }
}
