package com.az.ocp.aooadp.factory;

import com.az.ocp.aooadp.dao.solution.BookDao;

//FACTORY DESIGN PATTERN

public abstract class Factory {

    /**
     * Creates the Book DAO
     * @return
     */
    public abstract BookDao createDao();

}
