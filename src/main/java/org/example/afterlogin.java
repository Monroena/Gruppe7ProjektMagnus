package org.example;

import com.mysql.cj.xdevapi.Table;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class afterlogin implements Initializable {

    @FXML
    private TabPane tabpain;

    //TemperaturGUI - - - - - - - - - - - - - - - - START
    @FXML
    private TableView<Temperatur> tableTemperatur;

    @FXML
    private TableColumn<Temperatur, LocalDate> datotemp;

    @FXML
    private TableColumn<Temperatur, Double> morgentemp;

    @FXML
    private TableColumn<Temperatur, Double> middagtemp;

    @FXML
    private TableColumn<Temperatur, Double> aftentemp;


    //TemperaturGUI - - - - - - - - - - - - - - - - SLUT


    //PulsGUI - - - - - - - - - - - - - - - - - - - START


    @FXML
    private TableView<Maalinger> table;

    @FXML
    private TableColumn<Maalinger, String> id;

    @FXML
    private TableColumn<Maalinger, String> temp;

    @FXML
    private TableColumn<Maalinger, String> puls;

    @FXML
    private TableColumn<Maalinger, String> spo2;

    @FXML
    private TableColumn<Maalinger, String> cpr;


    //PulsGUI - - - - - - - - - - - - - -  - - - - - -SLUT



    //SpO2GUI - - - - - - - - - - - - - - - - - - - - START

    @FXML
    private TableView<Spo2> tableSpo2;

    @FXML
    private TableColumn<Spo2, LocalDate> datoSpo2;

    @FXML
    private TableColumn<Spo2, Double> morgenSpo2;

    @FXML
    private TableColumn<Spo2, Double> middagSpo2;

    @FXML
    private TableColumn<Spo2, Double> aftenSpo2;

//SpO2GUI - - - - - - - - - - - - - - - - - - - - SLUT


    ObservableList<Maalinger> listPuls = FXCollections.observableArrayList();



    ObservableList<Temperatur> listTemperatur = FXCollections.observableArrayList(

            new Temperatur(37.5, 38.7, 40.0, LocalDate.of(2021, 3, 10)),
            new Temperatur(38.3, 38.9, 40.2, LocalDate.of(2021, 3, 11)),
            new Temperatur(36.5, 39.6, 38.0, LocalDate.of(2021, 3, 12)),
            new Temperatur(38.5, 36.7, 37.6, LocalDate.of(2021, 3, 13))
    );


    ObservableList<Spo2> listSpo2 = FXCollections.observableArrayList(

            new Spo2(93.2, 97.1, 98.5, LocalDate.of(2021,3,10)),
            new Spo2(89.1, 99.1, 95.3, LocalDate.of(2021,3,11)),
            new Spo2(87.2, 96.3, 100, LocalDate.of(2021,3,12)),
            new Spo2(87.5, 95.0, 86.1, LocalDate.of(2021,3,13))
    );



    @Override
    public void initialize(URL url, ResourceBundle rb) {


            try {
                java.sql.Connection MySQL = org.example.datamodellen.Connection.getMySQLConnection("Bruger1",
                        "Password1", "projektsilledb");
                ResultSet RS = MySQL.createStatement().executeQuery("SELECT * FROM projektsilledb.maalinger");

       
       

                while (RS.next()) {
                    listPuls.add(new Maalinger(RS.getString("ID"), RS.getString("temp"),
                            RS.getString("puls"), RS.getString("spo2"),
                            RS.getString("CPR")));

                }
            }catch (SQLException ex){
                Logger.getLogger(Table.class.getName()).log(Level.SEVERE,null,ex);
            }

        id.setCellValueFactory(new PropertyValueFactory<>("id"));
        temp.setCellValueFactory(new PropertyValueFactory<>("temp"));
        puls.setCellValueFactory(new PropertyValueFactory<>("puls"));
        spo2.setCellValueFactory(new PropertyValueFactory<>("spo2"));
        cpr.setCellValueFactory(new PropertyValueFactory<>("CPR"));

        table.setItems(listPuls);


         //   setCellTemperatur();
        //setCellPuls();
        //setCellSpo2();


    }

    public void setCellTemperatur() {
        morgentemp.setCellValueFactory(new PropertyValueFactory<Temperatur, Double>("morgen"));
        middagtemp.setCellValueFactory(new PropertyValueFactory<Temperatur, Double>("middag"));
        aftentemp.setCellValueFactory(new PropertyValueFactory<Temperatur, Double>("aften"));
        datotemp.setCellValueFactory(new PropertyValueFactory<Temperatur, LocalDate>("dato"));

        tableTemperatur.setItems(listTemperatur);

    }
    public void setCellSpo2() {
        morgenSpo2.setCellValueFactory(new PropertyValueFactory<Spo2, Double>("morgen"));
        middagSpo2.setCellValueFactory(new PropertyValueFactory<Spo2, Double>("middag"));
        aftenSpo2.setCellValueFactory(new PropertyValueFactory<Spo2, Double>("aften"));
        datoSpo2.setCellValueFactory(new PropertyValueFactory<Spo2, LocalDate>("dato"));

        tableSpo2.setItems(listSpo2);

    }
}