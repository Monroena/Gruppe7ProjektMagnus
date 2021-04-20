package org.example.datamodellen;

public class dbTester {

    public static void main(String[] args) {

        Connection MySQL = new Connection();
        MySQL.getMySQLConnection("Bruger1", "Bruger1Password1", "begyndelse3db");
    }
}
