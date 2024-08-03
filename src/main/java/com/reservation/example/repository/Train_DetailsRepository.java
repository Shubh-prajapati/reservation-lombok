package com.reservation.example.repository;

import com.reservation.example.model.Train_Details;
import com.reservation.example.service.ConnectionService;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Train_DetailsRepository {
    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }

    public List<Train_Details> retrieveTrain() {
        List<Train_Details> trainDetails = new ArrayList<>();
        try {
            this.initConnection();

            //Your database query here....
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("Select * FROM train");


            //Iterate over the result set
            while (resultSet.next()) {
                int train_number = resultSet.getInt("train_number");
                String source_station = resultSet.getNString("source_station");
                String destination_station = resultSet.getNString("destination_station");
                String class_type = resultSet.getNString("class_type");
                int current_available = resultSet.getInt("current_available");

                //do something with the data to print it
                Train_Details trainDetails1 = new Train_Details(train_number, source_station, destination_station, class_type, current_available);
                trainDetails.add(trainDetails1);

            }
        } catch (SQLException e) {
            System.err.println("SQL err: " + e.getMessage());
        } finally {
            //closed the connection here
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error in closing connection: " + e.getMessage());

                }

            }
        }
        return trainDetails;
    }

    //Method to insert user data into database

    public boolean insertTrain_Details(Train_Details train_details) throws SQLException {
        this.initConnection();

        String query = "INSERT INTO user VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setInt(1, train_details.getTrain_number());
            preparedStatement.setString(2, train_details.getClass_type());
            preparedStatement.setString(3, train_details.getSource_station());
            preparedStatement.setString(4, train_details.getDestination_station());
            preparedStatement.setInt(5, train_details.getCurrent_available());

            System.out.println("Update  details of train to train Table: " + train_details);
            int rowInserted = preparedStatement.executeUpdate();

            return rowInserted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateTrain_Details(Train_Details trainDetails) throws SQLException {
        this.initConnection();

        String query="UPDATE Train SET train_number = ?, class_type = ?, source_station= ? destination_station = ?  current_available = ? WHERE ID=?  ";
        try(PreparedStatement preparedStatement=connection.prepareStatement(query)){

            preparedStatement.setInt(1,trainDetails.getTrain_number());
            preparedStatement.setString(2, trainDetails.getClass_type());
            preparedStatement.setString(3, trainDetails.getSource_station());
            preparedStatement.setString(4, trainDetails.getDestination_station());
            preparedStatement.setInt(5, trainDetails.getCurrent_available());


            System.out.println("Updating user of details to user Table: "+trainDetails);
            int rowInserted =preparedStatement.executeUpdate();

            return rowInserted>0;
        }catch(SQLException e){
            e.printStackTrace();
        }
        return false;

    }

    // Method to update train data into database
    public boolean deleteUser(int train_number) throws SQLException {

        this.initConnection();

        String query = "DELETE FROM train_details WHERE train_number=?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, train_number);
            System.out.println("Deleting train  details from the User Table: " + train_number);
            int rowInserted = preparedStatement.executeUpdate();

            return rowInserted > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return  false;

    }



}
