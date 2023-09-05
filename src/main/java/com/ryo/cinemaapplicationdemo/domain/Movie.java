package com.ryo.cinemaapplicationdemo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "movies")
@Getter
@Setter
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "movie_title")
    private String title;

    @Column(name = "movie_genre")
    private String genre;

    @Column(name = "duration")
    private int durationMinutes;

    //Director
    @ManyToOne
    private Director director;

    @OneToMany(mappedBy = "movie")
    private List<Ticket> tickets;

}
