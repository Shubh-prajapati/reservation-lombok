package com.reservation.example.repository;

import com.reservation.example.model.Payment_Details;

import com.reservation.example.service.ConnectionService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Payment_DetailsRepository {
    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }
    public List<Payment_Details> retrievePayment_Details() throws SQLException {

        List<Payment_Details>paymentDetails =new ArrayList<>();
            //use the connection to execute  SQL queries and interact with the database

             try{
                this.initConnection();

                //Your database query Operation here....
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("Select * from payment");


                //Iterate over the result set
                while (resultSet.next()){
                    int payment_id=resultSet.getInt("payment_details");
                    long reservation=resultSet.getLong("reservation_id");
                    int user_id=resultSet.getInt("user_id");
                    String user_name=resultSet.getString("user_name");
                    double amount=resultSet.getDouble("amount");



                }
            }catch(SQLException e){
                System.err.println("SQL err: "+ e.getMessage());
            }finally {
                 //close the connection here

                 if (connection != null) {
                     try {
                         connection.close();
                     } catch (SQLException e) {
                         System.err.println("Error closing connection: " + e.getMessage());
                     }
                 }
             }
        return  paymentDetails;
    }

    //Method to insert payment details data into database

    public  boolean insertPayment_Details(Payment_Details paymentDetails)throws SQLException{
     this.initConnection();
     String query="UPDATE payment_details SET payment_id = ?, reservation_id=? ,user_id =?, user_name=? ,amount=?";
     try(PreparedStatement preparedStatement=connection.prepareStatement(query)){


         preparedStatement.setLong(1,paymentDetails.getPayment_id());
         preparedStatement.setLong(2,paymentDetails.getReservation_id());
         preparedStatement.setInt(3,paymentDetails.getUser_id());
         preparedStatement.setString(4,paymentDetails.getUser_name());
         preparedStatement.setDouble(5,paymentDetails.getAmount());


         System.out.println("Updating Payment_details into the payment table");
         int rowInserted=preparedStatement.executeUpdate();

         return  rowInserted>0;
     }catch (SQLException e){
         e.printStackTrace();
     }
     return false;
    }
    // Method to delete payment_details from database

    public boolean deletePayment_details(int payment_id)throws SQLException{
        this.initConnection();

        String query="DELETE FROM payment WHERE payment_id";
        try(PreparedStatement preparedStatement=connection.prepareStatement(query)){
            preparedStatement.setInt(1,payment_id);
            System.out.println("Deleting payment details from the payment table: "+payment_id);
            int rowInserted=preparedStatement.executeUpdate();

            return  rowInserted>0;

        }catch (SQLException e){
            e.printStackTrace();
        }
            return false;
    }

}
