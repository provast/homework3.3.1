package com.company;

import com.company.building.Library;
import com.company.building.Storage;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1940);
        Book book2 = new Book("Мёртвые души", "Николай Гоголь", 1842);
        Book book3 = new Book("Собачье сердце", "Михаил Булгаков", 1925);
        Book book4 = new Book("Война и мир", "Лев Толстой", 1868);
        Book book5 = new Book("Преступление и наказание", "Федор Достоевский", 1866);

        Storage storage = new Storage(new Book[]{book1, book2, book3, book4, book5});
        Supplier supplier = new Supplier("Федоров Максим Владимирович", storage);

        Library library = new Library();
        Librarian librarian = new Librarian("Печкин Иван Олегович", library);
        librarian.orderBook(supplier, new int[]{1, 3, 5});

        Administrator administrator = new Administrator("Уткина Ольга Сергеевна", library);

        User user1 = new User("Иванов Петр Иванович");
        user1.takeBook(administrator, book1);

        User user2 = new User("Котова Мария Сергеевна");
        user2.takeBook(administrator, book5);

        librarian.takeBook(administrator, book3);

    }
}
