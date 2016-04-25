package com.az.ocp.aooadp.dao.solution;

public interface BookDao {
    
    /**
     * Creates the a book
     * @param book
     */
    void create(Book book);
    
    /**
     * Updates the book
     * @param book
     */
    void update(Book book);
    
    /**
     * Deletes the book
     * @param book
     */
    void delete(Book book);
}