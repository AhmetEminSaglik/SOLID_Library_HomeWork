package com.company.registration;

import com.company.service.book.UnAvailableAuthorNameInputException;

public class AuthorService {
    public boolean isAuthorNameAvailableToRegister(String authorName) throws UnAvailableAuthorNameInputException {
        if (authorName.trim().length() > 0) {
            return true;
        }
        throw new UnAvailableAuthorNameInputException("UNAVAILABLE AUTHOR NAME INPUT");

    }
}
