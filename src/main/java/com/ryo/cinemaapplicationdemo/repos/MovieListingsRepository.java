package com.ryo.cinemaapplicationdemo.repos;

import com.ryo.cinemaapplicationdemo.domain.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieListingsRepository extends CrudRepository<Movie, Long> {
}
