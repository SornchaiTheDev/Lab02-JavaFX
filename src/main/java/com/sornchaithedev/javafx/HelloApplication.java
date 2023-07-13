package com.sornchaithedev.javafx;

import com.sornchaithedev.services.FXRouter;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "Nong nut narak");
        configRoute();
        FXRouter.goTo("student-profile");
    }

    public static void configRoute()
    {
        String viewPath = "com/sornchaithedev/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
        FXRouter.when("student-profile", viewPath + "student.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}