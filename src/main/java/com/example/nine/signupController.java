package com.example.nine;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class signupController {
    public String FirstName;
    public  String LastName;
    public  String UserName;
    public String Password;
    public String Email;
    public  String Gender;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firsname.getText();

    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastname.getText();
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = username.getText();
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
       this.Password  = txt_password.getText();
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = txt_email.getText();
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = txt_gender.getText();
    }

    @FXML
    private TextField txt_email;

    @FXML
    private TextField firsname;
    @FXML
    private Button btn_signup;

    @FXML
    private TextField txt_gender;
    @FXML
    private TextField txt_password;

    @FXML
    private Scene scene;
    @FXML
    private Parent root;

    @FXML
    private TextField lastname;

    @FXML
    private PasswordField password;


    @FXML
    private TextField username;


//    @FXML
//    void signupbuttonOnAction(ActionEvent event) throws IOException {
//        root = FXMLLoader.load(getClass().getResource("hall.fxml"));
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
//
//
//
//
//
//    }

    public  void AcceptData(){
        setFirstName(FirstName);
        setLastName(LastName);
        setEmail(Email);
        setUserName(UserName);
        setPassword(Password);
        setGender(Gender);




    }


    public void SignupClick(ActionEvent event) {
        Alert Error = new Alert(Alert.AlertType.ERROR);
        try {
            AcceptData();
            DatabaseConnection con = new DatabaseConnection();
            con.connection();
            Statement SignupClick;
       if(FirstName.isEmpty()|| LastName.isEmpty()||Email.isEmpty()|| UserName.isEmpty()|| Password.isEmpty()|| Gender.isEmpty()){
           Error.setTitle("fill in the blank");
           firsname.clear();
           lastname.clear();
           username.clear();
           password.clear();
           txt_email.clear();
           txt_gender.clear();
           Error.showAndWait();
       }
       else{
           String querry = ("Insert into registration(firstname, lastname,username,password,email, gender)values(?,?,?,?,?,?)");
           PreparedStatement start;
           start = con.connection().prepareStatement(querry);
           start.setString(1,getFirstName());
           start.setString(2,getLastName());
           start.setString(3,getUserName());
           start.setString(4,getPassword());
           start.setString(5,getEmail());
           start.setString(6,getGender());
           start.execute();

           root = FXMLLoader.load(getClass().getResource("hall.fxml"));
           Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
           scene = new Scene(root);
           stage.setScene(scene);
           stage.show();

       }





















        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }








}








