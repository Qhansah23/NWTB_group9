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
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class floornameController {

    @FXML
    private Button buttonnext;

    @FXML
    private Scene scene;
    @FXML
    private Parent root;

    @FXML
    private TextField txt_floor;


    public  String floor;

    public String getFloor() {
        return floor;
    }

    public  void Take() {
        setFloor(floor);
    }

    private void setFloor(String floor1) {
        floor = txt_floor.getText();
    }


    @FXML
    void buttonnextOnAction(ActionEvent event) throws IOException, SQLException {
        Take();
        DatabaseConnection conn = new DatabaseConnection();
        conn.connection();
        PreparedStatement stat;
        String query = ("INSERT INTO `flloor`(`floor`) VALUES (?)");
        stat=conn.connection().prepareStatement(query);
        stat.setString(1, getFloor());
        stat.execute();
        root = FXMLLoader.load(getClass().getResource("payment.fxml"));
        Stage stage = (Stage) buttonnext.getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }




}
