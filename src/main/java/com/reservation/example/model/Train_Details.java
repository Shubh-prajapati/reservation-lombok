package com.reservation.example.model;

public class Train_Details {

    private  int train_number;
    private  String source_station;
    private String destination_station;
    private String  class_type;
    private int current_available;


    public Train_Details(){

    }

    public Train_Details(int train_number, String source_station, String destination_station, String class_type, int current_available) {
        this.train_number = train_number;
        this.source_station = source_station;
        this.destination_station = destination_station;
        this.class_type = class_type;
        this.current_available = current_available;
    }

    public int getTrain_number() {
        return train_number;
    }

    public void setTrain_number(int train_number) {
        this.train_number = train_number;
    }

    public String getSource_station() {
        return source_station;
    }

    public void setSource_station(String source_station) {
        this.source_station = source_station;
    }

    public String getDestination_station() {
        return destination_station;
    }

    public void setDestination_station(String destination_station) {
        this.destination_station = destination_station;
    }

    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type;
    }

    public int getCurrent_available() {
        return current_available;
    }

    public void setCurrent_available(int current_available) {
        this.current_available = current_available;
    }

    @Override
    public String toString() {
        return "Train_Details{" +
                "train_number=" + train_number +
                ", source_station='" + source_station + '\'' +
                ", destination_station='" + destination_station + '\'' +
                ", class_type='" + class_type + '\'' +
                ", current_available=" + current_available +
                '}';
    }

    public void add(Train_Details trainDetails) {
    }
}
