package com.ryo.cinemaapplicationdemo.domain;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Director {

    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;

    //MovieListings
    @OneToMany( mappedBy = "director")
    @Getter
    private List<MovieListings> movieListings;

    public void setMovieListings(List<MovieListings> movieListings) {
        this.movieListings = movieListings;
    }
}
