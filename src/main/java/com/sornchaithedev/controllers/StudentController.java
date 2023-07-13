package com.sornchaithedev.controllers;

import com.sornchaithedev.services.FXRouter;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import com.sornchaithedev.models.Student;

import java.io.IOException;

public class StudentController {
    @FXML
    Label studentNameLabel;

    @FXML
    Label studentIDLabel;

    @FXML
    Label studentScoreLabel;

    @FXML
    public void initialize() {
        Student student = new Student("651040581x", "Sornchai Somsakul");
        showStudent(student);
    }

    private void showStudent(Student student) {

        studentNameLabel.setText(student.getName());
        studentIDLabel.setText(student.getId());
        studentScoreLabel.setText("" + student.getScore());
    }

    @FXML
    protected void onHandleButtonClick() {

        try {
            FXRouter.goTo("hello");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}