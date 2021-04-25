package org.example.datamodellen;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBtester {

    public static void main(String[] args) {

        Connection MySQL = new Connection();
        MySQL.getMySQLConnection("Bruger1", "Bruger1Password1", "projektsilledb");

        MySQL.insertMeasurementsIntoTable(1);
    }


}
