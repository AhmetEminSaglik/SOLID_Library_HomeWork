package com.company.registration;

import com.company.db.DAOAble;
import com.company.exception.ExitRequestException;
import com.company.entity.book.content.Author;
import com.company.exception.UnAvailableBookNameInputException;
import com.company.exception.UnAvailableBookSubjectInputException;
import com.company.service.validation.book.BookInputAvailableService;

public class RegistrationBook extends Registration {


    public RegistrationBook(DAOAble daoAble) {
        super(daoAble);
    }

    public void registerBookAsMuchAsWeWant() {

        String bookName, subject;
        int pageNumber;
        Author author;

        while (true) {
            System.out.println("IF you want to exit please  enter  :  \"exit\"");
            try {
                bookName = getAvailableBookName();
                subject = getAvailableSubject();


            } catch (ExitRequestException e) {
                System.out.println("Exit Request is realized");
                return;
            }


        }

    }

    private boolean exitRequestCheck(String input) throws ExitRequestException {
        if (input.equalsIgnoreCase("exit")) {
            throw new ExitRequestException("Exit request");
        }
        return false;
    }

    private String getAvailableBookName() throws ExitRequestException {
        try {
            String bookName = getBookNameInput();
            exitRequestCheck(bookName);
            BookInputAvailableService.isBookNameAvailableToRegister(bookName);
            return bookName;
        } catch (UnAvailableBookNameInputException ex) {
            System.out.println(ex.getMessage());
            return getAvailableBookName();
        }
    }

    private String getBookNameInput() {
        System.out.print("Please enter for Book Name : ");
        return secureInput.getStringInput();
    }


    private String getAvailableSubject() throws ExitRequestException {
        try {
            String subject = getSubjectInput();
            exitRequestCheck(subject);
            BookInputAvailableService.isBookSubjectAvailableToRegister(subject);
            return subject;
        } catch (UnAvailableBookSubjectInputException ex) {
            System.out.println(ex.getMessage());
            return getAvailableSubject();
        }

    }

    private String getSubjectInput() {
        System.out.print("Please enter for Subject : ");
        return secureInput.getStringInput();
    }

}
