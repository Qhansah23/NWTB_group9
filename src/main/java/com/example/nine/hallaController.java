package com.example.nine;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class hallaController implements Initializable {
    public String Renoylds;
    public String Oti;
    public String Danquah;
    public String Afrane;



    @FXML
    private Parent root;
    @FXML
    private Scene scene;
    @FXML
    private Button buttonsubmit;

    @FXML
    private TextField hall_txt;


    public String getRenoylds() {
        return Renoylds;
    }

    public String getOti() {
        return Oti;
    }

    public String getDanquah() {
        return Danquah;
    }

    public String getAfrane() {
        return Afrane;

    }

    public  String Hall;

    public String getHall() {
        return Hall;
    }

    public void setHall(String hall) {
        Hall = hall_txt.getText();
    }

    public  void TakeData() {
        setHall(Hall);
    }



    public  void buttonsubmitOnAction() throws SQLException {
        try{
            TakeData();
            DatabaseConnection conn = new DatabaseConnection();
            conn.connection();
            PreparedStatement stat;
            String query = ("INSERT INTO `halls`(`hall`) VALUES (?)");
            stat=conn.connection().prepareStatement(query);
            stat.setString(1, getHall());
            stat.execute();
            Parent root = FXMLLoader.load(getClass().getResource("floorname.fxml"));
            Stage window = (Stage) buttonsubmit.getScene().getWindow();
            window.setScene(new Scene(root));
            window.show();
            System.out.println("Successful");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
