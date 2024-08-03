package com.reservation.example.model;

public class Reservation {
    private long  reservation_id;
    private  int train_number;

    private int user_id;

    private String class_type;

    private long PNR_NO;

    private int journey_date;


    public Reservation(){

    }

    public Reservation(long reservation_id, int train_number, int user_id, String class_type, long PNR_NO, int journey_date) {
        this.reservation_id = reservation_id;
        this.train_number = train_number;
        this.user_id = user_id;
        this.class_type = class_type;
        this.PNR_NO = PNR_NO;
        this.journey_date = journey_date;
    }

    public long getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(long reservation_id) {
        this.reservation_id = reservation_id;
    }

    public int getTrain_number() {
        return train_number;
    }

    public void setTrain_number(int train_number) {
        this.train_number = train_number;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getClass_type() {
        return class_type;
    }

    public void setClass_type(String class_type) {
        this.class_type = class_type;
    }

    public long getPNR_NO() {
        return PNR_NO;
    }

    public void setPNR_NO(long PNR_NO) {
        this.PNR_NO = PNR_NO;
    }

    public int getJourney_date() {
        return journey_date;
    }

    public void setJourney_date(int journey_date) {
        this.journey_date = journey_date;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_id=" + reservation_id +
                ", train_number=" + train_number +
                ", user_id=" + user_id +
                ", class_type='" + class_type + '\'' +
                ", PNR_NO=" + PNR_NO +
                ", journey_date=" + journey_date +
                '}';
    }
}
