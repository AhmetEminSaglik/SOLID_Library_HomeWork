package com.company.exception;

public class ExitRequestException extends BaseException {
    String message;
    String respondToRequest = "Exit Request is realized";

    public ExitRequestException(String message) {
        super(message);
    }

    public String getRespondToRequest() {
        return respondToRequest;
    }
}
