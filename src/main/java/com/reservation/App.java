package com.reservation;
import com.reservation.service.*;
import java.sql.SQLException;
import java.util.Scanner;


public class  App
{
    public static void main( String[] args ) throws SQLException {
        UserServices userServices=new UserServices();
        TrainServices trainServices=new TrainServices();
        StationService stationService=new StationService();
        ReservationServices reservationServices=new ReservationServices();
        Payment_DetailsServices paymentDetailsServices=new Payment_DetailsServices();


        Scanner sc=new Scanner(System.in);
        int choice=0;
        int choice1=0;
        int choice2=0;
        int choice3=0;
        int choice4=0;
        int choice5=0;

        do{

            System.out.println("*** TRAIN RESERVATION MANAGEMENT ***");
            System.out.println("---------------------------------------");
            System.out.println("Select Operation: ");

            System.out.println("1. Create UserDetails ");
            System.out.println("2. Update Any Details ");
            System.out.println("3. Delete Any Details ");
            System.out.println("4. Retrieve Any Details");
            System.out.println("0. Exit ");


            System.out.println("Enter Your Choice ");
            choice =Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:{
                    System.out.println("Performing the Create Operation on User");
                    userServices.insertUser();

                    System.out.println("Now insert your Train details");
                    trainServices.insertTrain_Details();

                }
                break;
                case 2:
                {
                    System.out.println("Performing UPDATE operation ");
                    System.out.println("1. Your Own Details");
                    System.out.println("2. Your Own User Details");
                    System.out.println("0. Exit");

                }
                //Add Your Update Logic Here
                    do {
                        System.out.println("Enter which Entity you want to Update");
                        choice2=Integer.parseInt(sc.nextLine());
                        switch (choice2){
                            case 1:{
                                System.out.println("Updating User");
                                userServices.updateUser();
                            }
                            break;
                            case 2:{
                                System.out.println("Updating Train Details");
                                trainServices.updateTrain_Details();
                            }
                            break;
                        }

                    }while (choice2 !=0);
                    sc.close();
                    break;

                case 3:
                    System.out.println("Performing the DELETE Operation! ");
                    System.out.println("1. User");
                    System.out.println("2. Train Details ");
                    System.out.println("0. Exit");

                    // Add Your Delete Logic here
                    do{
                        System.out.println("Performing the DELETE Operation ");
                        choice3=Integer.parseInt(sc.nextLine());
                        switch (choice3){
                            case 1:{
                                userServices.deleteUser();
                            }
                            break;
                            case 2:{
                                trainServices.deleteTrain_Details();
                            }break;
                        }
                    }while (choice3 !=0);
                    sc.close();
                    break;

                case 4:
                    System.out.println("Perform RETRIEVE Operation on");
                    System.out.println("1. User Details ");
                    System.out.println("2. Train Details ");
                    System.out.println("3. Station Details ");
                    System.out.println("4. Reservation Details ");
                    System.out.println("5. Payment details ");

                    System.out.println("0. Exit");


                    System.out.println("Enter Your Choice : ");
                    switch (choice4) {
                        case 1:{
                            System.out.println("Retrieving Train Details ");

                            trainServices.retrieveTrain().forEach(trainDetails -> {
                                System.out.println("Train Number: "+trainDetails.getTrainNumber()+
                                                        "Source Station: "+trainDetails.getSourceStation()+
                                                            "Destination Station: "+trainDetails.getDestinationStation()+
                                                                "Class Type: "+trainDetails.getClassType()+
                                                                   "Current Available"+trainDetails.getCurrentAvailable());
                            });
                            break;
                        }
                        case 2:{
                            System.out.println("Enter the User Details: ");

                            userServices.retrieveUser().forEach(user -> {
                                System.out.println("User Id: "+user.getUserId()+
                                                        "Name :"+user.getName()+
                                                          "Email: "+user.getEmail()+
                                                             "Mobile Number"+user.getMobileNo()+
                                                                 "Address "+user.getAddress());
                            });
                           break;
                        }
                        case 3:{

                            System.out.println("Enter Station Details: ");


                            stationService.retrieveStation().forEach(station ->
                                    System.out.println("Station Id: "+station.getStationId()+
                                                         "User Id: "+station.getUserId()));
                            break;
                        }

                        case 4: {
                            System.out.println("Enter Reservation Details");

                            reservationServices.retrieveReservation().forEach(reservation ->
                                    System.out.println("Reservation Id: " +reservation.getReservationId() +
                                                          "Train Number: " +reservation.getTrainNumber() +
                                                            "User Id: " + reservation.getUserId()+
                                                                "Class Type: "+reservation.getClassType()+
                                                                    "pnrNO"+reservation.getPnrNo()+
                                                                        "journeyDate"+reservation.getJourneyDate()));
                        }
                        break;
                    }

                case 5:{
                    System.out.println("Enter Payment Details");

                    paymentDetailsServices.retrievePayment_Details().forEach(payment_details ->
                                    System.out.println("Payment Id: "+payment_details.getPaymentId()+
                                                            "Reservation Id: "+payment_details.getUserId()+
                                                                "User Id:"+payment_details.getUserId()+
                                                                    "User Name: "+payment_details.getUserName()+
                                                                        "Amount "+payment_details.getAmount()));
                }
                break;

                case 0:
                    System.out.println("Exiting Program");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
            while (choice4!=0);
            sc.close();

        }
        while (choice !=0);
        sc.close();
    }
}
