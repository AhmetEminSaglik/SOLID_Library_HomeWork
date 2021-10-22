package com.company.service.book.author;

import com.company.exception.UnAvailableAuthorNameInputException;

public class AuthorService {
    public boolean isAuthorNameAvailableToRegister(String authorName) throws UnAvailableAuthorNameInputException {
        if (authorName.trim().length() > 0) {
            return true;
        }
        throw new UnAvailableAuthorNameInputException("UNAVAILABLE AUTHOR NAME INPUT");

    }
}
