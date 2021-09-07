package com.company.building;

import com.company.Book;
import com.company.Supplier;

public class Library {

    private Book[] books;

    public void addBook(Supplier supplier, int[] bookIds) {
        this.books = supplier.sendOrder(bookIds);
    }
}
