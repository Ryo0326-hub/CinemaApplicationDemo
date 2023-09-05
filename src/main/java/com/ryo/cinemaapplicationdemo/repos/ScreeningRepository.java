package com.ryo.cinemaapplicationdemo.repos;

import com.ryo.cinemaapplicationdemo.domain.Screening;
import org.springframework.data.repository.CrudRepository;

public interface ScreeningRepository extends CrudRepository<Screening, Long> {
}
