package com.ryo.cinemaapplicationdemo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Screening {

    @Id
    @GeneratedValue
    private Long id;

    //Cinema
    @ManyToOne
    private Cinema cinema;

    //Ticket
    @OneToMany
    @Getter
    @Setter
    private List<Ticket> ticket;

    @OneToMany
    @Getter
    @Setter
    private List<Booking> booking;

}
