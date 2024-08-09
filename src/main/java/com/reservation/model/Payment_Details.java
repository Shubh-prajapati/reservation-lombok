package com.reservation.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Payment_Details {

    private int paymentId;
    private long reservationId;
    private  int userId;
    private  String userName;
    private  double amount;



}
