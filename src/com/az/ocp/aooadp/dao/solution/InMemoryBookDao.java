package com.az.ocp.aooadp.dao.solution;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class InMemoryBookDao implements BookDao {

    private static Map<String, Book> bookstore = new HashMap<String, Book>(); // storage: core responsibility

    public Collection<Book> findAllBooks() {
        return bookstore.values();
    }

    public Book findBookByIsbn(Book book) {
        return bookstore.get(book.getIsbn());
    }

    @Override
    public void create(Book book) {
        System.out.println("Creating book...");
        bookstore.put(book.getIsbn(), book);
    }

    @Override
    public void delete(Book book) {
        System.out.println("Deleting book...");
        bookstore.remove(book.getIsbn());
    }

    @Override
    public void update(Book book) {
        System.out.println("Updating book...");
        // no operation - for an in-memory database,
        // we update automatically in real time
    }
}
