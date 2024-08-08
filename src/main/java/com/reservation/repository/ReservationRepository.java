package com.reservation.repository;

import com.reservation.model.Reservation;
import com.reservation.service.ConnectionService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservationRepository {
    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }

    public List<Reservation> retrieveReservation() {
        List<Reservation> reservation = new ArrayList<>();

        //Use the connection to execute SQL queries and interact with database
        try {
            this.initConnection();

            //Your database query Operation here.......
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM RESERVATION");


            //Iterator over the result set
            while (resultSet.next()) {
                long reservation_id = resultSet.getLong("reservation_id");
                int train_number = resultSet.getInt("train_number");
                int user_id = resultSet.getInt("user_id");
                String class_type = resultSet.getString("class_type");
                long PNR_NO = resultSet.getLong("PNR_NO");
                int journey_date = resultSet.getInt("journey_date");

                //Do something with the data print it

                Reservation reservation1 = new Reservation(reservation_id, train_number, user_id, class_type, PNR_NO, journey_date);
                reservation.add(reservation1);
            }


        } catch (SQLException e) {
            System.err.println("SQL err: " + e.getMessage());
        } finally {
            //close the connection here
            if (connection != null) {
                try {
                    connection.close();

                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }


            }
        }
        return reservation;
    }


    //Method to insert user data into Database

    public boolean insertReservation(Reservation reservation) throws SQLException {
        this.initConnection();
        String query = "INSERT INTO reservation VALUES(?,?,?,?,?,?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {


            preparedStatement.setLong(1, reservation.getReservationId());
            preparedStatement.setInt(2, reservation.getTrainNumber());
            preparedStatement.setString(3, reservation.getClassType());
            preparedStatement.setLong(4, reservation.getPnrNo());
            preparedStatement.setInt(5, reservation.getJourneyDate());

            System.out.println("Update reservation details to reservation table: " + reservation);
            int rowInserted = preparedStatement.executeUpdate();


            return rowInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return false;
    }
// Method to delete user data from database

    public boolean deleteReservation(long reservation_id) throws SQLException {
        this.initConnection();

        String query = "DELETE FROM reservation WHERE reservation_id";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setLong(1, reservation_id);
            System.out.println("Deleting reservation from the Reservation Table: " + reservation_id);
            int rowInserted = preparedStatement.executeUpdate();

            return rowInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


}
