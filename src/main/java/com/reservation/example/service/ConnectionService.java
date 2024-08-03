package com.reservation.example.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionService {
    public Connection getConnection() {

        Connection connection=null;
        try {
            String url="jdbc:mysql://localhost:3306/reservationdb";
            String username="root";
            String password=" ";
            connection = DriverManager.getConnection(url ,username,password);
        }catch (SQLException e){
            System.err.println("Connection error: "+e.getMessage());
        }
        return connection;




    }
}
