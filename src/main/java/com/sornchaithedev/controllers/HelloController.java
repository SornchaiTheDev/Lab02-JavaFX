package com.sornchaithedev.controllers;

import com.sornchaithedev.services.FXRouter;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
//        welcomeText.setText("Hello World");
        try {
            FXRouter.goTo("student-profile");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}