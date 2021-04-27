package org.example.datamodellen;

import java.sql.*;
import java.util.ArrayList;

public class Connection {

    private static java.sql.Connection connection = null;
    private static String MYSQLDriver = "jdbc:mysql://" + "localhost:3306/";
    private static String url;

    public Connection() {
    }


    java.sql.Connection getMySQLConnection(String username, String password, String Schema) {
        url = MYSQLDriver + Schema + "?serverTimezone=Europe/Amsterdam&amp";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Connected to MYSQL Schema:"+Schema);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }


    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;


    public void insertMeasurementsIntoTable(int id){

        for(int n=0; n<10; n++) {
            int randomPuls = (int) (40 + (Math.random() * 100));
            double randomTemp = (20 + (Math.random() * 25));
            int randomSpO2 = (int) (100-(6*Math.random()));
            String SQL = "insert into maalinger(temp,puls,SpO2) values(?,?,?);";

            try {
                preparedStatement = connection.prepareStatement(SQL);
                preparedStatement.setDouble(1, randomTemp);
                preparedStatement.setInt(2, randomPuls);
                preparedStatement.setInt(3, randomSpO2);
                preparedStatement.execute();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
    public void findAllMeasurementsFromPatient(int PatientID){
        ArrayList liste= new ArrayList();

        String SQL="SELECT * FROM projektsilledb.maalinger where temp="+PatientID+";";

        try{
            statement=connection.createStatement();
            resultSet=statement.executeQuery(SQL);
            while (resultSet.next()){
                //hvad skal vi have ud?
                System.out.println(
                        "id: "+resultSet.getInt(1)+"\n"+
                                "puls:"+resultSet.getInt("puls")
                );
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
