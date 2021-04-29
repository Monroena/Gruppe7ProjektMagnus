module org.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.java;

    opens org.example to javafx.fxml;
    exports org.example;
    exports org.example.datamodellen;
    opens org.example.datamodellen to javafx.fxml;
}