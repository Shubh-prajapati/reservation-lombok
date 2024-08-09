package com.reservation.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Train_Details {

    private  int trainNumber;
    private  String sourceStation;
    private String destinationStation;
    private String classType;
    private int currentAvailable;


    public void add(Train_Details trainDetails) {
    }

}
