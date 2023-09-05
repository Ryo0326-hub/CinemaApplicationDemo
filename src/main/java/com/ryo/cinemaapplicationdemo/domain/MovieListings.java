package com.ryo.cinemaapplicationdemo.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class MovieListings extends Cinema {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "Movie_Title")
    private String title;

    @Column(name = "Movie_Genre")
    private String genre;

    @Column(name = "Duration")
    private int durationMinutes;

    //Director
    @ManyToOne
    private Director director;

}
