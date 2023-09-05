package com.ryo.cinemaapplicationdemo.domain;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "directors")
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Director {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;

    private String lastName;

    //MovieListings
    @OneToMany( mappedBy = "director")
    private List<Movie> movieListings;

    public void setMovieListings(List<Movie> movieListings) {
        this.movieListings = movieListings;
    }
}
