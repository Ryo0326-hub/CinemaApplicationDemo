package com.ryo.cinemaapplicationdemo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "tickets")
@Getter
@Setter
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "ticket_price")
    private Double price;

//    @Column(length = 20,name = "movie_name")
//    private String movieName;

    @Column(name = "seat_number")
    private Integer seatNumber;

    //Screening
//    @ManyToOne
//    private Screening screening;

    @ManyToOne
    private Movie movie;


}
