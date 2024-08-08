package com.reservation.service;

import com.reservation.model.Payment_Details;
import com.reservation.repository.Payment_DetailsRepository;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Payment_DetailsServices {
    private  static final Payment_DetailsRepository PAYMENT_DETAILS_REPOSITORY =new Payment_DetailsRepository();
    public List<Payment_Details> retrievePayment_Details() throws SQLException {
        return PAYMENT_DETAILS_REPOSITORY.retrievePayment_Details();
    }


    //Method to insert data into PaymentDetails Database
    public boolean insertUser() throws SQLException{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the PaymentId for Payment  ");
        Integer paymentId=new Integer(scanner.nextLine());

        System.out.println("Enter the ReservationId  ");
        Long reservationId=scanner.nextLong();

        System.out.println("Enter the UserId ");
        Integer userId=new Integer(scanner.nextLine());

        System.out.println("Enter the User Name: ");
        String userName=scanner.nextLine();

        System.out.println("Enter amount will Pay");
        Double amount=scanner.nextDouble();



        Payment_Details paymentDetails=new Payment_Details(paymentId,reservationId,userId,userName,amount);
        if(PAYMENT_DETAILS_REPOSITORY.insertPayment_Details(paymentDetails)){
            System.out.println("Payment Details Inserted Successfully");

        }else {
            System.out.println("Failed to inserted Data");
        }
        return false;
    }
//Method to Update Payment Details into database
public  boolean updatePaymentDetails() throws  SQLException{
        Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the PaymentId for Payment  ");
    Integer paymentId=new Integer(scanner.nextLine());

    System.out.println("Enter the ReservationId  ");
    Long reservationId=scanner.nextLong();

    System.out.println("Enter the UserId ");
    Integer userId=new Integer(scanner.nextLine());

    System.out.println("Enter the User Name: ");
    String userName=scanner.nextLine();

    System.out.println("Enter amount will Pay");
    Double amount=scanner.nextDouble();

    Payment_Details paymentDetails=new Payment_Details(paymentId,reservationId,userId,userName,amount);
    if(PAYMENT_DETAILS_REPOSITORY.insertPayment_Details(paymentDetails)){
        System.out.println("Payment Details Updated Successfully");

    }else {

        System.out.println("Failed to Updated Data");
    }
    return false;
}

//Method to delete Payment details from database
    public boolean deletePayment_Details() throws SQLException{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Enter the Payment_id");
        Integer paymentId =Integer.valueOf(scanner.nextLine());

        if(PAYMENT_DETAILS_REPOSITORY.deletePayment_details(paymentId)){
            System.out.println("Payment details Delete Successfully");

        }else {
            System.out.println("Failed to delete Payment Details");
        }
        return false;
    }


}
