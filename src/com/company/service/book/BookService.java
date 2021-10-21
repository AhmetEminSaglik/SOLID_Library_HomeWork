package com.company.service.book;

import com.company.exception.UnAvailableBookNameInputException;
import com.company.exception.UnAvailableBookSubjectInputException;

public class BookService {

    public boolean isBookNameAvailableToRegister(String bookName) throws UnAvailableBookNameInputException {

        if(bookName.trim().length()>0){
            return true;
        }
        throw  new UnAvailableBookNameInputException("UNAVAILABLE BOOK NAME INPUT");
    }
    public boolean isBookSubjectAvailableToRegister(String bookSubject) throws UnAvailableBookSubjectInputException {
        if(bookSubject.trim().length()>0){
            return true;
        }
        throw  new UnAvailableBookSubjectInputException("UNAVAILABLE BOOK SUBJECT INPUT");
    }
}
