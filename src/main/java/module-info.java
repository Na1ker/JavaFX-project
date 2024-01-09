module org.example.uzash {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;
    requires java.desktop;


    opens org.example.uzash to javafx.fxml;
    exports org.example.uzash;
}