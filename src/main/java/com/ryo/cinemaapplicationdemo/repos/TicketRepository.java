package com.ryo.cinemaapplicationdemo.repos;

import com.ryo.cinemaapplicationdemo.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
