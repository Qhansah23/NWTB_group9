package com.example.nine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.xml.stream.events.StartElement;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class momoController {

   String Name;
   String Network;
   String Number;
   String amount;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = txtname.getText();
    }

    public String getNetwork() {
        return Network;
    }

    public void setNetwork(String network) {
        Network =txtnetwork.getText();
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = txtnumber.getText();
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = txt_amount.getText();
    }

    @FXML
    private TextField txt_amount;


    @FXML
    private Scene scene;

    @FXML
    private Parent root;
    @FXML
    private Button buttonsend;

    @FXML
    public TextField name;

    @FXML
    public TextField network;

    @FXML
    public TextField number;

    @FXML
    private TextField txtname;
@FXML
    private TextField txtnetwork;

@FXML
    private TextField txtnumber;



public  void  tkDaata(){
  setName(Name);
  setNumber(Number);
  setNetwork(Network);
  setAmount(amount);

}
public void buttonsend()throws SQLException{
    //try {
       // tkDaata();
       // DatabaseConnection conn = new DatabaseConnection();
       // conn.connection();
        //PreparedStatement stat;
    }
//}


    public void buttonsendOnAction(ActionEvent event) throws IOException{
        Alert Error = new Alert(Alert.AlertType.ERROR);
   try {
       tkDaata();
       DatabaseConnection con = new DatabaseConnection();
       con.connection();
       Statement buttonlogin;

       if(Name.isEmpty()|| Network.isEmpty()|| Number.isEmpty()||amount.isEmpty()){
           Error.setTitle("fill in the blank");
           txtname.clear();
           txtnetwork.clear();
           txtnumber.clear();
           txt_amount.clear();
           Error.showAndWait();



   }
       else {
           String querry = ("Insert into momo(name, network,number,amount)values(?,?,?,?)");
         PreparedStatement start;
         start = con.connection().prepareStatement(querry);
           start.setString(1,getName());
           start.setString(2,getNetwork());
           start.setString(3,getNumber());
           start.setString(4,getAmount());
           start.execute();

       }
    } catch (SQLException e) {
       throw new RuntimeException(e);
   }
    }}

