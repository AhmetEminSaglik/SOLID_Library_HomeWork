package com.company.service.registration.db;

import com.company.PrintDbList;
import com.company.db.access.add.DAOAble;
import com.company.entity.book.Book;
import com.company.registered.subitem.ReadRegisteredBook;
import com.company.service.registration.BookRegistrationService;

import java.util.List;


public class BookRegistrationDB /*extends BaseRegistrationToDB<Book> */ implements RegisterAbleToDB<Book> {
    DAOAble<Book> daoAble;

    BookRegistrationService bookRegistrationService;

    public BookRegistrationDB(DAOAble<Book> daoAble) {
        this.daoAble = daoAble;
        bookRegistrationService = new BookRegistrationService(daoAble);
    }

    @Override
    public void register(Book book) {
//        bookRegistrationService.registerBook(book);
        daoAble.add(book);
        printList(getBookListInDb());

    }

    private List getBookListInDb() {
        return new ReadRegisteredBook(daoAble).getList();

    }

    private void printList(List list) {
        PrintDbList.printList(list);
    }
}
