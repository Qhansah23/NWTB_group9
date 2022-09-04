package com.example.nine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class paymentController {
    @FXML
    private Button buttonbank;
    @FXML
    private Scene scene;

    @FXML
    private Parent root;

    @FXML
    private Button buttonmomo;

    @FXML
    void buttonbankOnAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("bank.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void buttonmomoOnAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("momo.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }




}
