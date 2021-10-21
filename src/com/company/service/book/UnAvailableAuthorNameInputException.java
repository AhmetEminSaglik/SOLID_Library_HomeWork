package com.company.service.book;

import com.company.exception.BaseException;

public class UnAvailableAuthorNameInputException extends BaseException {
    public UnAvailableAuthorNameInputException(String message) {
        super(message);
    }
}
