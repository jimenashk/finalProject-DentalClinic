package com.dh.clinica.clinicaSpringApi.entities;

import lombok.Data;
import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "appointments")

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private LocalDate date;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "dentist_id", nullable = false)
    private Dentist dentist;




}



