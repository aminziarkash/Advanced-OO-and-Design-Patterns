package com.az.ocp.aooadp.dao.solution;


public class OracleBookDao implements BookDao {

    @Override
    public void create(Book book) {
        System.out.println("Creating book in oracle db");
    }

    @Override
    public void update(Book book) {
        System.out.println("Updating book in oracle db");
    }

    @Override
    public void delete(Book book) {
        System.out.println("Deleting book in oracle db");
    }
}
