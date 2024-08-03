package com.reservation.example.model;

public class Station {

    private int station_id;

    private  int user_id;

    public Station(){

    }
    public Station(int station_id, int user_id) {
        this.station_id = station_id;
        this.user_id = user_id;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Station{" +
                "station_id=" + station_id +
                ", user_id=" + user_id +
                '}';
    }
}
