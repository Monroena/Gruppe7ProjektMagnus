package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

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
    private TableView<Puls> table;

    @FXML
    private TableColumn<Puls, Integer> morgen;

    @FXML
    private TableColumn<Puls, Integer> middag;

    @FXML
    private TableColumn<Puls, Integer> aften;

    @FXML
    private TableColumn<Puls, LocalDate> dato;


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


    ObservableList<Puls> listPuls = FXCollections.observableArrayList(

            new Puls(150, 130, 120, LocalDate.of(2021, 3, 10)),
            new Puls(130, 120, 145, LocalDate.of(2021, 3, 11)),
            new Puls(124, 126, 120, LocalDate.of(2021, 3, 12)),
            new Puls(163, 132, 115, LocalDate.of(2021, 3, 13)),
            new Puls(120, 145, 160, LocalDate.of(2021, 3, 14))
    );



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
        setCellTemperatur();
        setCellPuls();
        setCellSpo2();


    }


    public void setCellPuls() {
        morgen.setCellValueFactory(new PropertyValueFactory<Puls, Integer>("morgen"));
        middag.setCellValueFactory(new PropertyValueFactory<Puls, Integer>("middag"));
        aften.setCellValueFactory(new PropertyValueFactory<Puls, Integer>("aften"));
        dato.setCellValueFactory(new PropertyValueFactory<Puls, LocalDate>("dato"));

        table.setItems(listPuls);
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