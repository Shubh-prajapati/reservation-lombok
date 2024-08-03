package com.reservation.example.model;

public class User {
    private int user_id;
    private String name;
    private String email;
    private long mobile_no;
    private String address;

    public User(){

    }

    public User(int user_id, String name, String email, long mobile_no, String address) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.mobile_no = mobile_no;
        this.address = address;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(long mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile_no=" + mobile_no +
                ", address='" + address + '\'' +
                '}';
    }

    public void add(User user) {
    }
}
