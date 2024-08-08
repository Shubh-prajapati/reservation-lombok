package com.reservation.model;

public class Reservation {
    private long reservationId;
    private  int trainNumber;
    private int userId;
    private String classType;
    private long pnrNo;
    private int journeyDate;

    public Reservation(){

    }

    public Reservation(long reservationId, int trainNumber, int userId, String classType, long pnrNo, int journeyDate) {
        this.reservationId = reservationId;
        this.trainNumber = trainNumber;
        this.userId = userId;
        this.classType = classType;
        this.pnrNo = pnrNo;
        this.journeyDate = journeyDate;
    }

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public long getPnrNo() {
        return pnrNo;
    }

    public void setPnrNo(long pnrNo) {
        this.pnrNo = pnrNo;
    }

    public int getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(int journeyDate) {
        this.journeyDate = journeyDate;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_id=" + reservationId +
                ", train_number=" + trainNumber +
                ", user_id=" + userId +
                ", class_type='" + classType + '\'' +
                ", PNR_NO=" + pnrNo +
                ", journey_date=" + journeyDate +
                '}';
    }
}
