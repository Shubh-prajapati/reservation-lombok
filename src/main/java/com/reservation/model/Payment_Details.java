package com.reservation.model;

public class Payment_Details {

    private int paymentId;
    private long reservationId;
    private  int userId;
    private  String userName;
    private  double amount;


    public Payment_Details(){

    }
    public Payment_Details(int paymentId, long reservationId, int userId, String userName, double amount) {
        this.paymentId = paymentId;
        this.reservationId = reservationId;
        this.userId = userId;
        this.userName = userName;
        this.amount = amount;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment_Details{" +
                "payment_id=" + paymentId +
                ", reservation_id=" + reservationId +
                ", user_id=" + userId +
                ", user_name='" + userName + '\'' +
                ", amount=" + amount +
                '}';
    }
}
