package com.company.entity.book;

import com.company.entity.Entity;
import com.company.entity.book.content.Author;

public class Book extends Entity<Book> {

    String name;
    Author author;
    String subject;
    int pageNumber;


    public Book(String name, Author author, String subject, int pageNumber) {
        this.name = name;
        this.author = author;
        this.subject = subject;
        this.pageNumber = pageNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", Subject='" + subject + '\'' +
                ", pageNumber=" + pageNumber +
                '}';
    }
}
