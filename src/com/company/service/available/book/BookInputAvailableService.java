package com.company.service.available.book;

import com.company.service.book.BookService;
import com.company.exception.UnAvailableBookNameInputException;
import com.company.exception.UnAvailableBookSubjectInputException;
import com.company.exception.UnAvailableBookPageNumberInputException;

public class BookInputAvailableService {

    public static boolean isBookNameAvailableToRegister(String bookname) throws UnAvailableBookNameInputException {
        new BookService().isBookNameAvailableToRegister(bookname);
        return true;
    }

    public static boolean isBookSubjectAvailableToRegister(String bookSubject) throws UnAvailableBookSubjectInputException {
        new BookService().isBookSubjectAvailableToRegister(bookSubject);
        return true;
    }

    public static boolean isBookPageNumberAvailableToRegister(int pageNumber) throws UnAvailableBookPageNumberInputException {
        new BookService().isbookPageNumberAvailableToRegister(pageNumber);
        return true;
    }
}
