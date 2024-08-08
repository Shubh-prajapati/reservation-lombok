package com.reservation.service;

import com.reservation.model.Reservation;
import com.reservation.repository.ReservationRepository;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ReservationServices {
    private  static final ReservationRepository RESERVATION_REPOSITORY =new ReservationRepository();
    public List<Reservation> retrieveReservation(){

        return  RESERVATION_REPOSITORY.retrieveReservation();
    }
    // Method to insert data into Reservation database

    public boolean insertReservation() throws SQLException{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the ReservationID: ");
        Long reservationId=Long.valueOf(scanner.nextLine());

        System.out.println("Enter the Train Number ");
        Integer trainNumber=Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the User Id: ");
        Integer userId=Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the Class which coach you wanna Journey ");
        String classType=scanner.nextLine();

        System.out.println("Enter the PNR No to Check the Booking Status! ");
        Long pnrNo=scanner.nextLong();

        System.out.println("Enter the Journey Date");
        Integer journeyDate=Integer.valueOf(scanner.nextLine());

        Reservation reservation=new Reservation(reservationId,trainNumber,userId,classType,pnrNo,journeyDate);
        if(RESERVATION_REPOSITORY.insertReservation(reservation)){
            System.out.println("Reservation Details Inserted Successfully");
        }else{
            System.out.println("Failed to insert Data!.....");
        }
        return false;
    }


    //Method to Update User into Reservation Database
    public boolean updateReservation()throws SQLException{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the ReservationID: ");
        Long reservationId=Long.valueOf(scanner.nextLine());

        System.out.println("Enter the Train Number ");
        Integer trainNumber=Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the User Id: ");
        Integer userId=Integer.valueOf(scanner.nextLine());

        System.out.println("Enter the Class which coach you wanna Journey ");
        String classType=scanner.nextLine();

        System.out.println("Enter the PNR No to Check the Booking Status! ");
        Long pnrNo=scanner.nextLong();

        System.out.println("Enter the Journey Date");
        Integer journeyDate=Integer.valueOf(scanner.nextLine());

        Reservation reservation=new Reservation(reservationId,trainNumber,userId,classType,pnrNo,journeyDate);
        if(RESERVATION_REPOSITORY.insertReservation(reservation)){
            System.out.println("Reservation Details Updated Successfully");
        }else{
            System.out.println("Failed to Updated Data!.....");
        }
        return false;
    }

    // Method to delete user Reservation Details from the database
    public boolean deleteReservation() throws SQLException{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter the user_id ");
        Integer reservationId =Integer.valueOf(scanner.nextLine());


        if(RESERVATION_REPOSITORY.deleteReservation(reservationId)){
            System.out.println("User details deleted successfully ");

        }else {
            System.out.println("Failed to deleted User Details ");
        }
        return false;
    }



}
