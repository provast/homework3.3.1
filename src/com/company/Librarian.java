package com.company;

import com.company.building.Library;

public class Librarian extends User implements com.company.imps.Librarian {

    private Library library;

    public Librarian(String fullName, Library library) {
        super(fullName);
        this.library = library;
    }

    @Override
    public void orderBook(Supplier supplier, int[] books) {
        library.addBook(supplier, books);
        System.out.println("библиотекарь " + getFullName()
                + " заказал книги у поставщика " + supplier.getFullName());
    }


}
