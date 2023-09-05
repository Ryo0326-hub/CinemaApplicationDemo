package com.ryo.cinemaapplicationdemo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Cinema_Users")
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;

    @OneToMany
    @Getter
    @Setter
    private List<Booking> booking;

}
