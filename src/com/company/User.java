package com.company;

import com.company.imps.Reader;

public class User implements Reader {

    private String fullName;
    private Book currentBook;

    public User(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public Book getCurrentBook() {
        return currentBook;
    }

    public void setCurrentBook(Book currentBook) {
        this.currentBook = currentBook;
    }

    @Override
    public void takeBook(Administrator administrator, Book book) {
        administrator.giveBook(this, book);
        System.out.println(this.fullName + " взял книгу "
                + currentBook + " у " + administrator.getFullName());
    }

    @Override
    public void returnBook(Book book) {

    }
}