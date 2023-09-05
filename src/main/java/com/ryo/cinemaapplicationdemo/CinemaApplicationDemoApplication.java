package com.ryo.cinemaapplicationdemo;

import com.ryo.cinemaapplicationdemo.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApplicationDemoApplication {

    //UserRepository
    @Autowired
    UserRepository userRepository;

    @Autowired
    TicketRepository ticketRepository;

    @Autowired
    ScreeningRepository screeningRepository;

    @Autowired
    MovieListingsRepository movieListingsRepository;

    @Autowired
    DirectorRepository directorRepository;

    @Autowired
    CinemaRepository cinemaRepository;

    @Autowired
    BookingRepository bookingRepository;

    public static void main(String[] args) {
        SpringApplication.run(CinemaApplicationDemoApplication.class, args);
    }

}
