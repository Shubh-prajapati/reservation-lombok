package com.reservation.example.service;

import com.reservation.example.model.User;
import com.reservation.example.repository.UserRepository;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class UserServices {

    private  static final UserRepository USER_REPO =new UserRepository();
    private List<User> retrieveUser(){
        return  USER_REPO.retrieveUser();
    }
    // Method to insert data into User database

    public boolean insertUser() throws SQLException{
        Scanner scanner= new Scanner(System.in);

        System.out.println("Pls Enter User id: ");
        Integer id=Integer.valueOf(scanner.nextLine());

        System.out.println("Please Enter Your Full Name:");
        String name=scanner.nextLine();

        System.out.println("Enter Your Email ");
        String email=scanner.nextLine();

        System.out.println("Please Enter Your Mobile Number");
        Long mobile_no=scanner.nextLong();

        System.out.println("Please Enter a Address: ");
        String address=scanner.nextLine();

        User user=new User(id,name,email,mobile_no,address);
        if(USER_REPO.insertUser(user)){
            System.out.println("User Details Inserted Successfully! ");

        }else {
            System.out.println("Failed to insert Customer. ");
        }
        return false;
    }


    //Method  to Update User into User Database
    public  boolean updateUser() throws  SQLException{
     Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter the User Id: ");
        Integer id=Integer.valueOf(scanner.nextLine());

        System.out.println("Please Enter Your Full Name:");
        String name=scanner.nextLine();

        System.out.println("Enter Your Email ");
        String email=scanner.nextLine();

        System.out.println("Please Enter Your Mobile Number");
        Long mobile_no=scanner.nextLong();

        System.out.println("Please Enter a Address: ");
        String address=scanner.nextLine();

        User user=new User(id,name,email,mobile_no,address);

        if(USER_REPO.updateUser(user)){
            System.out.println("User details inserted successfully");
        }
        else
        {
            System.out.println("Failed to Update the user Details.");
        }
        return false;
    }

    // Method to delete user Address of the database
    public boolean deleteUser() throws SQLException{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter the user_id ");
        Integer id =Integer.valueOf(scanner.nextLine());


        if(USER_REPO.deleteUser(id)){
            System.out.println("User details deleted successfully ");

        }else {
            System.out.println("Failed to deleted User Details ");
        }
        return false;
    }

}
