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

public class facilitiesController {

    @FXML
    private Button buttonlogout;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;


    @FXML
    void buttonlogoutOnAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("hella.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
@FXML
private Button buttonback;

    public void buttonback(ActionEvent event) throws IOException {
      //root = FXMLLoader.load(getClass().getResource("hella.fxml"));
     //  Stage window = (Stage) buttonback.getScene().getWindow();
      //window.setTitle("floorname");
       //window.show();
    }

    public void buttonbackOnAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("payment.fxml"));
        Stage window = (Stage) buttonback.getScene().getWindow();
        window.setTitle("floorname");
        window.show();
    }


    }
//}
