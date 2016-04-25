package com.az.ocp.aooadp.dao.solution;

// DAO PATTERN SOLUTION (Only responsible for being a Book )

public class Book {

    private String isbn;

    private String title;

    private String author;

    // getters and setters

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
