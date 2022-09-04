package com.example.nine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class welcomeController {

    @FXML
    private Scene scene;
            @FXML
            private Parent root;
    @FXML
    private Button buttonhome;

    @FXML
    void buttonhomeOnAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = (Stage) buttonhome.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
