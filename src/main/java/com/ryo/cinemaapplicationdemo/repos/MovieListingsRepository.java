package com.ryo.cinemaapplicationdemo.repos;

import org.springframework.data.repository.CrudRepository;

public interface MovieListingsRepository extends CrudRepository<com.ryo.cinemaapplicationdemo.domain.MovieListings, Long> {
}
