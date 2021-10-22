package com.company.service.registration;

import com.company.db.DAOAble;
import com.company.entity.book.Book;

import java.util.ArrayList;
import java.util.List;


public class BookRegistrationService {
    DAOAble<Book> daoAble;
    List<Book> bookList = new ArrayList<Book>();

    public BookRegistrationService(DAOAble<Book> daoAble) {
        this.daoAble = daoAble;
    }

    public void registerBook(Book book) {
        daoAble.add(book);
        System.out.println("-) Ekli Booklar : ");

//        RequestedTypeEntityDB<Book> requestedTypeEntityDB = new RequestedTypeEntityDB<>(daoAble); ????? CALISMIYOR????


//        int index = 0;
//        getBookList(index);
////        bookList = getBookList(index);
//        for(Book tmp : bookList){
//            System.out.println(tmp);
//        }

       /* try {
        } catch (ClassCastException ex) {
            System.out.println(ex.getMessage());
        }
        for (Book tmp : list) {

            System.out.println(tmp);
        }*/
    }

//    private void getBookList(int index) {
//
//        try {
//            if (index < daoAble.getAll().size()) {
//                Book book = (Book) (daoAble.getAll().get(index));
//                bookList.add(book);
//                index++;
//                getBookList(index);
//            }
//        } catch (ClassCastException ex) {
//            index++;
//            getBookList(index);
//        }
////        return bookList;
//    }

}
