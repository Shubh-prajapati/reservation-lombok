package com.reservation.service;

import com.reservation.model.Station;
import com.reservation.repository.StationRepository;


import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class StationService {

    private  static final StationRepository STATION_REPOSITORY = new StationRepository();
    public List<Station> retrieveStation(){
        return  STATION_REPOSITORY.retrieveStaion();
    }


    // Method to insert data into Station database
    public  boolean  insertStation() throws SQLException{

        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter the StationID:");
        Integer stationId=Integer.valueOf(scanner.nextLine());

        System.out.println("Please Enter the UserId: ");
        Integer userId=Integer.valueOf(scanner.nextLine());

        Station station=new Station(stationId,userId);
        if(STATION_REPOSITORY.insertStation(station)){
            System.out.println("Station details are Inserted Successfully...");
        }else {
            System.out.println("Something wrong to Insert the data! ");
        }
        return false;
    }


    // Method to Update User into Station database
    public boolean updateStaion() throws SQLException{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter the StationID:");
        Integer stationId=Integer.valueOf(scanner.nextLine());

        System.out.println("Please Enter the UserId: ");
        Integer userId=Integer.valueOf(scanner.nextLine());


        Station station=new Station(stationId,userId);
        if(STATION_REPOSITORY.updateStaion(station)){
            System.out.println("Station details are Updated Successfully...");
        }else {
            System.out.println("Something wrong to Update the Details! ");
        }
        return false;
    }

    // Method to delete station details from the Database

    public boolean deleteStation() throws SQLException{
        Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter the stationId ");
        Integer id =Integer.valueOf(scanner.nextLine());



        if (STATION_REPOSITORY.deleteStation(id)){
            System.out.println("Station details delete Successfully....");
        }
        else{
            System.out.println("Failed to deleted Station Details!.......");
        }
        return false;

    }




}
