package com.company.entity.book;

import com.company.entity.book.content.Author;

public class Book extends Materyal {

    protected String name;
    protected Author author;
    protected String subject;
    protected int pageNumber;


    public Book(int id, String name, Author author, String subject, int pageNumber) {
        super(id);
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

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public String getSubject() {
        return subject;
    }

    public int getPageNumber() {
        return pageNumber;
    }
}
