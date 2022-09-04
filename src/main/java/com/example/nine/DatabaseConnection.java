package com.example.nine;
import java.sql.*;
import java.io.IOException;
import java.sql.DriverManager;


public class DatabaseConnection {

    public  static final String url = "jdbc:mysql://localhost:3306/get";
public  static  final  String username= "root";
public  static  final String password = "";

public Connection connection() throws SQLException {
    return  DriverManager.getConnection(url,username,password);
}


    public int login(String username, String password) {
        return 0;
    }
}
