package org.example.datamodellen;

import java.util.ArrayList;

public class DBtester {

    public static void main(String[] args) {

        Connection MySQL = new Connection();
        MySQL.getMySQLConnection("Bruger1", "Password1", "projektsilledb");
        MySQL.insertMeasurementsIntoTable(1);
        MySQL.findAllMeasurementsFromPatient(1);





    }



}
