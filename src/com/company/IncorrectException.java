package com.company;

public class IncorrectException extends Exception{

    public IncorrectException() {
    }

    public IncorrectException(String message) {
        super(message);
    }

    public IncorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectException(Throwable cause) {
        super(cause);
    }

    public IncorrectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
