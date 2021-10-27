package com.company.entity.magazin;

import com.company.entity.book.Book;
import com.company.entity.book.content.Author;

public class Magazin extends Book {
    protected String doiNumber;


    public Magazin(int id, String name, Author author, String subject, int pageNumber, String doiNumber) {
        super(id, name, author, subject, pageNumber);
        this.doiNumber = doiNumber;
    }

    @Override
    public String toString() {
        return "Magazin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", subject='" + subject + '\'' +
                ", pageNumber=" + pageNumber +
                ", doiNumber='" + doiNumber + '\'' +
                '}';
    }
}
