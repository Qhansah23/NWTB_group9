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

public class bankController {
    @FXML
    private TextField account;

    @FXML
    private TextField txtname;

    @FXML
    private TextField txtbank;
    @FXML
    private TextField txtaccount;
    @FXML
    private  TextField txtamount;



    String Name;
    String Bank;
    String Account;
    String Amount;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = txtname.getText();
    }

    public String getBank() {
        return Bank;
    }

    public void setBank(String bank) {
        Bank = txtbank.getText();
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String account) {
        Account = txtaccount.getText();
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = txtamount.getText();


    }
public void SendData(){
    setName(Name);
    setBank(Bank);
    setAccount(Amount);
    setAmount(Amount);

   // try {
     //   SendData();
      //  DatabaseConnection conn = new DatabaseConnection();
       // conn.connection();
        PreparedStatement stat;
   // } catch (SQLException e) {
   //     throw new RuntimeException(e);
    }
//}
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    private TextField amount;

    @FXML
    private TextField bank;

    @FXML
    private Button buttonsend;

    @FXML
    private TextField name;

   // @FXML
    //void buttonsendOnAction(ActionEvent event) throws IOException{}



  //  @FXML
    void savebuttonOnAction(ActionEvent event) throws IOException {
//try {
   //   SendData();
  //  DatabaseConnection conn = new DatabaseConnection();
  //  conn.connection();
    PreparedStatement stat;
   // String querry = ("Insert into bank(name, bank,account,amount)values(?,?,?,?)");
   // stat = conn.connection().prepareStatement(querry);
   // stat.setString(1,getName());
    //stat.setString(2,getBank());
    //stat.setString(3,getAccount());
   // stat.setString(4,getAmount());
    //stat.execute();
//} catch (SQLException e) {
  //  throw new RuntimeException(e);
}

   // }


    public void buttonsendOnAction(ActionEvent event) {
        try {
            SendData();
            DatabaseConnection conn = new DatabaseConnection();
            conn.connection();
            PreparedStatement stat;
            String querry = ("Insert into bank(name, bank,account,amount)values(?,?,?,?)");
            stat = conn.connection().prepareStatement(querry);
            stat.setString(1,getName());
            stat.setString(2,getBank());
            stat.setString(3,getAccount());
            stat.setString(4,getAmount());
            stat.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);


    }
}}
