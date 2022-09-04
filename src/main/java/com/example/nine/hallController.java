package com.example.nine;
import javafx.application.Platform;
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


public class hallController {



    @FXML
    private Button buttonnext;

    @FXML
    private Scene scene;

    @FXML
    private Parent root;

    @FXML
    private TextField hall;


    @FXML
    private Button buttonhalls;

    @FXML
    private Button buttonlog;

    @FXML
    private Button buttonstudent;

    @FXML
    private Button floornamebutton;



    @FXML
    void buttonhallsOnAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("halla.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void buttonlogOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void buttonstudentOnAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("rooms.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void floornamebuttonOnAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("floorname.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

   private Button getButtonnext;

    @FXML
    void buttonnext(ActionEvent event) throws IOException {

    }







}
