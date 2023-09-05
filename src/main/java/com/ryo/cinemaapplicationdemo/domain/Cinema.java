package com.ryo.cinemaapplicationdemo.domain;

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
public class Cinema {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    //Screening
    @OneToMany
    @Getter
    @Setter
    private List<Screening> screening;


}
