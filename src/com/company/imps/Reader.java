package com.company.imps;

import com.company.Administrator;
import com.company.Book;

public interface Reader {

    void takeBook(Administrator administrator, Book book);

    void returnBook(Book book);
}
