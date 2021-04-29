package org.example.datamodellen;

import java.util.ArrayList;

public class DBtester {

    public static void main(String[] args) {

        Connection MySQL = new Connection();
        MySQL.getMySQLConnection("Bruger1", "Password1", "projektsilledb");
        MySQL.insertMeasurementsIntoTable(1);




        for(int n=0; n<10; n++){
            MySQL.findAllMeasurementsFromPatient(n);
            System.out.println("--------");
        }


    }
}
