module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example to javafx.fxml;
    exports com.example;
    requires java.desktop;
    requires java.logging;
    requires java.sql;
    requires jxl;
}
