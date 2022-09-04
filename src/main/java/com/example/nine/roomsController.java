package com.example.nine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class roomsController {
    @FXML
    private Button buttoncontinue;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;

    @FXML
    private TextField room;

    @FXML
    void buttoncontinueOnActon(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("payment.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





}
