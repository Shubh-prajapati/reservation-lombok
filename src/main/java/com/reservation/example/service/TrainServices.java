package com.reservation.example.service;

import com.reservation.example.model.Train_Details;
import com.reservation.example.repository.Train_DetailsRepository;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TrainServices {
    private  static final Train_DetailsRepository DETAILS_REPOSITORY =new Train_DetailsRepository();


    // Method to retrieve user Address of the database
     public List<Train_Details> retrieveTrain(){
         return  DETAILS_REPOSITORY.retrieveTrain();
     }

     //Method to insert Train details into database
     public boolean insertTrain_Details() throws SQLException {
         Scanner scanner=new Scanner(System.in);

         System.out.println("Enter the Train Number: ");
         Integer train_Number=Integer.valueOf(scanner.nextLine());

         System.out.println("Enter the Your Source Station");
         String source_station=scanner.nextLine();

         System.out.println("Enter Your Destination Station");
         String destination_station=scanner.nextLine();

         System.out.println("Which class do you travel plz Enter it");
         String class_type=scanner.next();

         System.out.println("Current Available");
         Integer current_available=Integer.valueOf(scanner.nextLine());

         Train_Details train_details =new Train_Details(train_Number,source_station,destination_station,class_type,current_available);
         if (DETAILS_REPOSITORY.insertTrain_Details(train_details)){

             System.out.println("Train Details Successfully! ");

         }else{
             System.out.println("Failed to insert ");
         }
         return false;

         }


    //Method to Update User data into database
    public boolean updateTrain_Details() throws SQLException{
         Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the Train Number: ");
        Integer train_Number=Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the Your Source Station");
        String source_station=scanner.nextLine();

        System.out.println("Enter Your Destination Station");
        String destination_station=scanner.nextLine();

        System.out.println("Which class do you travel plz Enter it");
        String class_type=scanner.next();

        System.out.println("Current Available");
        Integer current_available=Integer.valueOf(scanner.nextLine());

        Train_Details train_details=new Train_Details(train_Number,source_station,destination_station,class_type,current_available);

        if (DETAILS_REPOSITORY.updateTrain_Details(train_details)){
            System.out.println("Customer inserted successfully");
        }
        else{
            System.out.println("Failed to Inserted Data!.......");
        }
        return  false;

    }
// Method to delete the train details from the database

    public boolean deleteTrain_Details()throws  SQLException{
         Scanner scanner=new Scanner(System.in);
        System.out.println("Pls Enter the Train_Number: ");
        Integer id=Integer.valueOf(scanner.nextLine());

        if(DETAILS_REPOSITORY.deleteUser(id)){
            System.out.println("Train Details Deleted successfully! ");
        }else {
            System.out.println("Failed to deleted Train Details ");
        }
         return  false;

    }

}

