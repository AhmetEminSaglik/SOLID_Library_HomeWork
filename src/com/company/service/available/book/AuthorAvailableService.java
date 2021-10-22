package com.company.service.available.book;

import com.company.service.book.author.AuthorService;
import com.company.exception.UnAvailableAuthorNameInputException;

public class AuthorAvailableService {
    public boolean isAuthorNameAvailableToRegister(String name) throws UnAvailableAuthorNameInputException {

        return new AuthorService().isAuthorNameAvailableToRegister(name);


    }
}
