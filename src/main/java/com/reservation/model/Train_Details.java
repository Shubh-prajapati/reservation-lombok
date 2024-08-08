package com.reservation.model;

public class Train_Details {

    private  int trainNumber;
    private  String sourceStation;
    private String destinationStation;
    private String classType;
    private int currentAvailable;

    public Train_Details(){

    }

    public Train_Details(int trainNumber, String sourceStation, String destinationStation, String classType, int currentAvailable) {
        this.trainNumber = trainNumber;
        this.sourceStation = sourceStation;
        this.destinationStation = destinationStation;
        this.classType = classType;
        this.currentAvailable = currentAvailable;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getSourceStation() {
        return sourceStation;
    }

    public void setSourceStation(String sourceStation) {
        this.sourceStation = sourceStation;
    }

    public String getDestinationStation() {
        return destinationStation;
    }

    public void setDestinationStation(String destinationStation) {
        this.destinationStation = destinationStation;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public int getCurrentAvailable() {
        return currentAvailable;
    }

    public void setCurrentAvailable(int currentAvailable) {
        this.currentAvailable = currentAvailable;
    }

    @Override
    public String toString() {
        return "Train_Details{" +
                "train_number=" + trainNumber +
                ", source_station='" + sourceStation + '\'' +
                ", destination_station='" + destinationStation + '\'' +
                ", class_type='" + classType + '\'' +
                ", current_available=" + currentAvailable +
                '}';
    }

    public void add(Train_Details trainDetails) {
    }
}
