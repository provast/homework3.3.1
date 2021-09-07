package com.company;

import com.company.building.Storage;

public class Supplier extends User implements com.company.imps.Supplier {

    private Storage storage;

    public Supplier(String fullName, Storage storage) {
        super(fullName);
        this.storage = storage;
    }

    @Override
    public Book[] sendOrder(int[] books) {
        return storage.getBooks(books);
    }

}
