package com.company;

import com.company.building.Library;

public class Administrator extends User implements com.company.imps.Administrator {

    private Library library;

    public Administrator(String fullName, Library library) {
        super(fullName);
        this.library = library;
    }

    @Override
    public void giveBook(User user, Book book) {
        user.setCurrentBook(book);
    }
}
