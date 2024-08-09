package com.reservation.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Reservation {
    private long reservationId;
    private  int trainNumber;
    private int userId;
    private String classType;
    private long pnrNo;
    private int journeyDate;




}
