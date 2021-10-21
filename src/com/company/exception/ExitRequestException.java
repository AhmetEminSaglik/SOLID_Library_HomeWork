package com.company.exception;

public class ExitRequestException extends BaseException {
    String message;

    public ExitRequestException(String message) {
        super(message);
    }
}
