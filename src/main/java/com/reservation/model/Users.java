package com.reservation.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Users {
    private int userId;
    private String name;
    private String email;
    private long mobileNo;
    private String address;


    public void add(Users users) {
    }
}
