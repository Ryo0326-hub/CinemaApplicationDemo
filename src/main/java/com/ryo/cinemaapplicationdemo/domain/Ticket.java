package com.ryo.cinemaapplicationdemo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Tickets")
@Getter
@Setter
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue
    private Long ID;

    @Column(name = "Ticket_Price")
    private Double price;
    @Column(length = 20,name = "Movie_Name")
    private String movieName;

    @Column(name = "Seat_Number")
    private Double seatNumber;


}
