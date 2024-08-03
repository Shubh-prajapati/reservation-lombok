package com.reservation.example.model;

public class Payment_Details {

    private int payment_id;
    private long reservation_id;
    private  int user_id;
    private  String user_name;
    private  double amount;


    public Payment_Details(){

    }
    public Payment_Details(int payment_id, long reservation_id, int user_id, String user_name, double amount) {
        this.payment_id = payment_id;
        this.reservation_id = reservation_id;
        this.user_id = user_id;
        this.user_name = user_name;
        this.amount = amount;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public long getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(long reservation_id) {
        this.reservation_id = reservation_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
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
                "payment_id=" + payment_id +
                ", reservation_id=" + reservation_id +
                ", user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
