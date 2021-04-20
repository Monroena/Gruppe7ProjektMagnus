package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class LægeLogin implements Initializable {

    @FXML
    private ChoiceBox<String> Patientvælger;

    @FXML
    private TableView<Puls> table;

    @FXML
    private Button patientknap;

    @FXML
    private TableColumn<Puls, Integer> morgen;

    @FXML
    private TableColumn<Puls, Integer> middag;

    @FXML
    private TableColumn<Puls, Integer> aften;

    @FXML
    private TableColumn<Puls, LocalDate> dato;



    ObservableList list = FXCollections.observableArrayList(


    );

    ObservableList<Puls> liste1 = FXCollections.observableArrayList(


            new Puls(150, 130, 120, LocalDate.of(2021, 3, 10)),
            new Puls(130, 120, 145, LocalDate.of(2021, 3, 11)),
            new Puls(124, 126, 120, LocalDate.of(2021, 3, 12)),
            new Puls(163, 132, 115, LocalDate.of(2021, 3, 13))
    );

    ObservableList<Puls> liste2 = FXCollections.observableArrayList(


            new Puls(20, 130, 120, LocalDate.of(2021, 3, 10)),
            new Puls(200, 120, 145, LocalDate.of(2021, 3, 11)),
            new Puls(1224, 126, 120, LocalDate.of(2021, 3, 12)),
            new Puls(163, 132, 115, LocalDate.of(2021, 3, 13))
    );


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setCellvalue(); // den skriver ting ind i rubrikkerne
        loadData();

    }

    @FXML
    void gåTilPatient(ActionEvent event) {

        list.addAll(liste2);


    }
    private void loadData() {
        list.removeAll(list);
        String a = "Erna Decroix";
        String b = "Gustav Meyer";
        String c = "Kirsten Jensen";
        String d = "Louise Poulsen";
        list.addAll(a, b, c, d);
        Patientvælger.getItems().addAll(list);

    }

    private void setCellvalue() {
        morgen.setCellValueFactory(new PropertyValueFactory<Puls, Integer>("morgen"));
        middag.setCellValueFactory(new PropertyValueFactory<Puls, Integer>("middag"));
        aften.setCellValueFactory(new PropertyValueFactory<Puls, Integer>("aften"));
        dato.setCellValueFactory(new PropertyValueFactory<Puls, LocalDate>("dato"));

        table.setItems(liste1);

    }

    private void setCellvalue1() {
        morgen.setCellValueFactory(new PropertyValueFactory<Puls, Integer>("morgen"));
        middag.setCellValueFactory(new PropertyValueFactory<Puls, Integer>("middag"));
        aften.setCellValueFactory(new PropertyValueFactory<Puls, Integer>("aften"));
        dato.setCellValueFactory(new PropertyValueFactory<Puls, LocalDate>("dato"));

        table.setItems(liste2);

    }
}
