package com.az.ocp.aooadp.factory.impl;

import java.util.Scanner;

import com.az.ocp.aooadp.dao.solution.BookDao;
import com.az.ocp.aooadp.dao.solution.InMemoryBookDao;
import com.az.ocp.aooadp.dao.solution.OracleBookDao;
import com.az.ocp.aooadp.factory.Factory;

public class FactoryImpl extends Factory {

    @Override
    public BookDao createDao() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which DAO do you want to create ? (i = InMemoryBookDao, o = OracleBookDao)");
        String inputString = userInput.next();
        try {
            if (inputString.equals("i")) {
                return new InMemoryBookDao();
            } else if (inputString.equals("b")) {
                return new OracleBookDao();
            } else {
                return null;
            }
        } finally {
            userInput.close();
        }

    }
}
