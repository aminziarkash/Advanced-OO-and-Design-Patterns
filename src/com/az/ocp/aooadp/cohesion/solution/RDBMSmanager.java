package com.az.ocp.aooadp.cohesion.solution;

public class RDBMSmanager {

    // RDBMSmanager stuff
    
    DBconnection getRDBMS() {
        return new DBconnection();
    }
}
