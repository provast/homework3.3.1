package com.company.building;

import com.company.Book;

public class Storage {

    private Book[] books;

    public Storage(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks(int[] books) {
        Book[] order = new Book[books.length];
        for (int i = 0; i < books.length; i++) {
            order[i] = searchBook(books[i]);
        }
        return order;
    }

    private Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }
}
