package com.company.exception;

public class BaseException extends Throwable {

    String message;

    public BaseException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }


}
