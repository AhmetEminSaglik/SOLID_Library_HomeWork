package com.company.service.registration.db;

import com.company.db.DAOAble;
import com.company.entity.book.Book;
import com.company.service.registration.BookRegistrationService;


public class BookRegistrationDB extends BaseRegistrationToDB<Book> {
    DAOAble<Book> daoAble;

    BookRegistrationService bookRegistrationService;

    public BookRegistrationDB(DAOAble<Book> daoAble) {
        this.daoAble = daoAble;
        bookRegistrationService = new BookRegistrationService(daoAble);
    }

    @Override
    public void register(Book book) {
        bookRegistrationService.registerBook(book);

    }
}
