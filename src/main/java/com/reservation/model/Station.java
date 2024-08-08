package com.reservation.model;

public class Station {

    private int stationId;

    private  int userId;

    public Station(){

    }
    public Station(int stationId, int userId) {
        this.stationId = stationId;
        this.userId = userId;
    }

    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Station{" +
                "station_id=" + stationId +
                ", user_id=" + userId +
                '}';
    }
}
