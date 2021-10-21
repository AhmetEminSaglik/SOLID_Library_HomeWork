package com.company.service.validation.book;

import com.company.service.book.BookService;
import com.company.exception.UnAvailableBookNameInputException;
import com.company.exception.UnAvailableBookSubjectInputException;

public class BookInputAvailableService {

    public static boolean isBookNameAvailableToRegister(String bookname) throws UnAvailableBookNameInputException {
        new BookService().isBookNameAvailableToRegister(bookname);
        return true;
    }

    public static boolean isBookSubjectAvailableToRegister(String bookSubject) throws UnAvailableBookSubjectInputException {
        new BookService().isBookSubjectAvailableToRegister(bookSubject);
        return true;
    }
}
