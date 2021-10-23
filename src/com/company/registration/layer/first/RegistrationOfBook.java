package com.company.registration.layer.first;

import com.company.db.access.add.DAOAble;
import com.company.entity.book.Book;
import com.company.exception.ExitRequestException;
import com.company.registration.layer.second.RegistrationBook;

public class RegistrationOfBook {
    DAOAble<Book> daoAble;

    public RegistrationOfBook(DAOAble<Book> daoAble) {
        this.daoAble = daoAble;
    }

    public void registerMultipleBook() {
        while (true) {

            System.out.println("IF you want to exit please  enter  :  \"exit\"");
            try {
                registerSingleBook();

            } catch (ExitRequestException e) {
                System.out.println(e.getRespondToRequest());
                return;
            }
        }
    }


    public void registerSingleBook() throws ExitRequestException {

        RegistrationBook registrationBook = new RegistrationBook(daoAble);
          registrationBook.registerBook();

    }
}
