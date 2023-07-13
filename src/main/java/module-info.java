module com.sornchaithedev.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sornchaithedev.javafx to javafx.fxml;
    exports com.sornchaithedev.javafx;
    exports com.sornchaithedev.controllers;
    opens com.sornchaithedev.controllers to javafx.fxml;
}