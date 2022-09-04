package com.example.nine;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.sql.Connection;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;

public class loginController {

    @FXML
    private Button buttonlogin;

    @FXML
    private Button cancelbutton;


    @FXML
    private Button signupbutton;



    @FXML
    private Stage stage;

    @FXML
    private Label loginMessageLabel;

    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField passwordPasswordField;

    @FXML
    private Parent root;

    @FXML
    private Scene scene;

public String username;
public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = usernameTextField.getText();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = passwordPasswordField.getText();

    }

    public void Acceptlogs(){
        setUsername(username);
        setPassword(password);
    }

    @FXML
    public void buttonlogin(ActionEvent event) throws IOException {
        Alert Error = new Alert(Alert.AlertType.ERROR);
        try {
            Acceptlogs();
            DatabaseConnection con = new DatabaseConnection();
            con.connection();
            Statement buttonlogin;


            if (username.isEmpty()|| password.isEmpty()){
                Error.setTitle("fill in the blank");
                usernameTextField.clear();
                passwordPasswordField.clear();
                Error.showAndWait();



            }
          else {
              String querry = ("Select * from registration where username = '"+username+"'AND password = '"+password+"'");
              buttonlogin = con.connection().createStatement();
                ResultSet Correct = null;
                Correct = buttonlogin.executeQuery(querry);
          if(Correct.next()){
              root = FXMLLoader.load(getClass().getResource("hall.fxml"));
              Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
              scene = new Scene(root);
              stage.setScene(scene);
              stage.show();




          }







            }









        } catch (Exception e) {
            throw new RuntimeException(e);
        }


//      if(usernameTextField.getText().isBlank()==false&&passwordPasswordField.getText().isBlank()==false) {
//loginMessageLabel.setText("You tried to login");
//      } else {
//loginMessageLabel.setText("Enter your username and password");
//    }
//String username = usernameTextField.getText();
//      String password = passwordPasswordField.getText();
//        if (new DatabaseConnection().login(username, password) == 1) {
//            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//            alert.setContentText("Login Successful");
//            alert.showAndWait();
//
//
//            Stage stage = (Stage)  buttonlogin.getScene().getWindow();
//            Parent root = FXMLLoader.load(getClass().getResource("dashboard.fxml"));
//            Scene scene = new Scene(root, 556, 401);
//            ;
//            stage.setScene(scene);
//            stage.show();
//
//
//        }else {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setContentText("Wrong Username or Password, Retype!!!");
//            alert.setHeaderText(null);
//            alert.showAndWait();
//            usernameTextField.clear();
//            passwordPasswordField.clear();
//
//
//
//        }
//
//
//
//    root = FXMLLoader.load(getClass().getResource("hall.fxml"));
//    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//    scene = new Scene(root);
//    stage.setScene(scene);
//    stage.show();
//
//}


//
//

//

//
//
//
//
//}

    }



    public void signupbuttonOnAction(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("signup.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



    }
        public void cancelbutton(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.close();


    }


}


