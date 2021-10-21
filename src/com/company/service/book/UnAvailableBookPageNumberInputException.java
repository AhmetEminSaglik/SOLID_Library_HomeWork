package com.company.service.book;

import com.company.exception.BaseException;

public class UnAvailableBookPageNumberInputException extends BaseException {
    public UnAvailableBookPageNumberInputException(String message) {
        super(message);
    }
}
