package com.dh.clinica.clinicaSpringApi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "patients")

public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;
    private int dni;
    private String email;
    private LocalDate initDate= LocalDate.now();

    // relation with Address
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_address", referencedColumnName = "id")
    private Address address;

    @OneToMany(mappedBy = "patient")
    @JsonIgnore
    private Set<Appointment> appointments;


}
