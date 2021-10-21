package com.company.registration;

import com.company.service.book.UnAvailableAuthorNameInputException;

public class AuthorAvailableService {
    public boolean isAuthorNameAvailableToRegister(String name) throws UnAvailableAuthorNameInputException {

        return new AuthorService().isAuthorNameAvailableToRegister(name);


    }
}
