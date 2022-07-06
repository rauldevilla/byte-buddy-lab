package com.example.bytebuddylab.app;

public class BusinessProcessException extends Exception {

    public BusinessProcessException() {
    }

    public BusinessProcessException(String message) {
        super(message);
    }

    public BusinessProcessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessProcessException(Throwable cause) {
        super(cause);
    }

    public BusinessProcessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
