package com.company.entity.magazin;

import com.company.entity.book.Book;
import com.company.entity.book.content.Author;

public class Magazin extends Book {
    String doiNumber;


    public Magazin(int id, String name, Author author, String subject, int pageNumber, String doiNumber) {
        super(id, name, author, subject, pageNumber);
        this.doiNumber = doiNumber;
    }
}
