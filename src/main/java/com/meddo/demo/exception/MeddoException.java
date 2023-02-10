package com.meddo.demo.exception;


public class MeddoException extends RuntimeException{
    public MeddoException(String error) {
        super(error);
    }

    public MeddoException(String error, Throwable cause) {
        super(error, cause);
    }
}
