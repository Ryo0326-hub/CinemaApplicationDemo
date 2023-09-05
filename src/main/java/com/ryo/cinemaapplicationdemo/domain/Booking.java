package com.ryo.cinemaapplicationdemo.domain;

import jakarta.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Screening screening;
}
