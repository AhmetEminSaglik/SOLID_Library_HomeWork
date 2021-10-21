package com.company.service.registration;

import com.company.db.DAOAble;
import com.company.entity.book.Book;


public class BookRegistrationService {
    DAOAble<Book> daoAble;

    public BookRegistrationService(DAOAble<Book> daoAble) {
        this.daoAble = daoAble;
    }

    public void registerBook(Book book) {
        daoAble.add(book);
        System.out.println("-) Ekli Booklar : ");
        for (Book tmp : daoAble.getAll()) {
            System.out.println(tmp);
        }
    }

}
