package com.company.registration;

import com.company.entity.book.content.Author;
import com.company.exception.ExitRequestException;
import com.company.secureinput.SecureInput;
import com.company.service.available.book.AuthorAvailableService;
import com.company.exception.UnAvailableAuthorNameInputException;

public class CreationOfAuthor {
    SecureInput secureInput = new SecureInput();

    public Author getAvailableAuthor() throws ExitRequestException {

        String authorName = getAvailableAuthorName();
        return new Author(authorName);
    }

    private String getAvailableAuthorName() throws ExitRequestException {

        try {
            String name = getAuthorNameInput();
            new AuthorAvailableService().isAuthorNameAvailableToRegister(name);
            return name;
        } catch (UnAvailableAuthorNameInputException ex) {
            System.out.println(ex.getMessage());
            return getAvailableAuthorName();
        }

    }

    private String getAuthorNameInput() throws ExitRequestException {
        System.out.print("Please enter for author name : ");
        return secureInput.getStringInput();
    }


}
