package com.dh.clinica.clinicaSpringApi.DTO;

import com.dh.clinica.clinicaSpringApi.entities.Dentist;
import com.dh.clinica.clinicaSpringApi.entities.Patient;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class AppointmentDTO {

    private Integer id;
    private Patient patient;
    private Dentist dentist;
    private LocalDate date;
    private Time time;


    public AppointmentDTO(Patient patient, Dentist dentist, LocalDate date, Time time) {
        this.patient = patient;
        this.dentist = dentist;
        this.date = date;
        this.time = time;
    }
}
