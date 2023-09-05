package com.ryo.cinemaapplicationdemo.repos;

import com.ryo.cinemaapplicationdemo.domain.Director;
import org.springframework.data.repository.CrudRepository;

public interface DirectorRepository extends CrudRepository<Director, Long> {
}
