package com.company.registration.layer.second;

import com.company.db.access.add.DAOAble;
import com.company.entity.book.Book;
import com.company.exception.ExitRequestException;
import com.company.entity.book.content.Author;
import com.company.exception.UnAvailableBookNameInputException;
import com.company.exception.UnAvailableBookSubjectInputException;
import com.company.registration.CreationOfAuthor;
import com.company.registration.Registration;
import com.company.exception.UnAvailableBookPageNumberInputException;
import com.company.service.registration.BookRegistrationService;
import com.company.service.registration.db.BookRegistrationDB;
import com.company.service.available.book.BookInputAvailableService;

public class RegistrationBook extends Registration {


    public RegistrationBook(DAOAble daoAble) {
        super(daoAble);
    }

    public Book createBook() throws ExitRequestException {
        int id;
        String bookName, subject;
        int pageNumber;
        Author author;

        id = getIdOfMateryal();
        bookName = getAvailableBookName();
        subject = getAvailableSubject();
        author = getAvailableAuthor();
        pageNumber = getAvailablePageNumber();


        Book book = new Book(id, bookName, author, subject, pageNumber);
        return book;
    }

    public void registerBook() throws ExitRequestException {
        Book book = createBook();

        registerbook(book);


    }

    private int getIdOfMateryal() {
        // Db'ye erisip oradaki materyal sayisini alip +1 ekleyip dondurecem
        return (int) Math.random() * 50;

    }

    private void registerbook(Book book) {
//        BaseRegistrationToDB<Book> bookRegistration = new BookRegistrationDB(daoAble);
//        BookRegistrationDB bookRegistration = new BookRegistrationDB(daoAble);
//        bookRegistration.register(book);
        BookRegistrationService bookRegistrationService = new BookRegistrationService(daoAble);
        bookRegistrationService.registerBook(book);


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
        } catch (UnAvailableBookPageNumberInputException ex) {
//            e.printStackTrace();
            System.out.println(ex.getMessage());
            return getAvailablePageNumber();
        }
//        exitRequestCheck(bookPageNumber);

    }

    private int getBookPageNumberInput() throws ExitRequestException {
        System.out.print("Please enter for Book Page Number : ");
        return secureInput.getPozitiveInput();
    }
}
