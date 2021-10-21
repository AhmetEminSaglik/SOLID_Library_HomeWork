package com.company.registration;

import com.company.db.DAOAble;
import com.company.entity.book.Book;
import com.company.exception.ExitRequestException;
import com.company.entity.book.content.Author;
import com.company.exception.UnAvailableBookNameInputException;
import com.company.exception.UnAvailableBookSubjectInputException;
import com.company.service.book.UnAvailableBookPageNumberInputException;
import com.company.service.registration.db.BaseRegistrationToDB;
import com.company.service.registration.db.BookRegistrationDB;
import com.company.service.validation.book.BookInputAvailableService;

public class RegistrationBook extends Registration {


    public RegistrationBook(DAOAble daoAble) {
        super(daoAble);
    }

    public void registerBook() throws ExitRequestException {

        String bookName, subject;
        int pageNumber;
        Author author;


        System.out.println("IF you want to exit please  enter  :  \"exit\"");

        bookName = getAvailableBookName();
        subject = getAvailableSubject();
        author = getAvailableAuthor();
        pageNumber = getAvailablePageNumber();


        Book book = new Book(bookName, author, subject, pageNumber);

        registerbook(book);


    }

    private void registerbook(Book book) {
        BaseRegistrationToDB bookRegistration = new BookRegistrationDB(daoAble);
        bookRegistration.register(book);

    }

    private String getAvailableBookName() throws ExitRequestException {
        try {
            String bookName = getBookNameInput();
//            exitRequestCheck(bookName);
            BookInputAvailableService.isBookNameAvailableToRegister(bookName);
            return bookName;
        } catch (UnAvailableBookNameInputException ex) {
            System.out.println(ex.getMessage());
            return getAvailableBookName();
        }
    }

    private Author getAvailableAuthor() throws ExitRequestException {
        Author author = new CreationOfAuthor().getAvailableAuthor();
        return author;
    }

    private String getBookNameInput() throws ExitRequestException {
        System.out.print("Please enter for Book Name : ");
        return secureInput.getStringInput();
    }


    private String getAvailableSubject() throws ExitRequestException {
        try {
            String subject = getSubjectInput();
//            exitRequestCheck(subject);
            BookInputAvailableService.isBookSubjectAvailableToRegister(subject);
            return subject;
        } catch (UnAvailableBookSubjectInputException ex) {
            System.out.println(ex.getMessage());
            return getAvailableSubject();
        }

    }

    private String getSubjectInput() throws ExitRequestException {
        System.out.print("Please enter for Subject : ");
        return secureInput.getStringInput();
    }

    private int getAvailablePageNumber() throws ExitRequestException {
        try {
            int bookPageNumber = getBookPageNumberInput();
            BookInputAvailableService.isBookPageNumberAvailableToRegister(bookPageNumber);
            return bookPageNumber;
        } catch (UnAvailableBookPageNumberInputException e) {
            e.printStackTrace();
            return getAvailablePageNumber();
        }
//        exitRequestCheck(bookPageNumber);

    }

    private int getBookPageNumberInput() throws ExitRequestException {
        System.out.print("Please enter for Book Page Number : ");
        return secureInput.getPozitiveInput();
    }
}
