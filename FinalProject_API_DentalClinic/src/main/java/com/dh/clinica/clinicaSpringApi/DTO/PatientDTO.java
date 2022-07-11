package com.dh.clinica.clinicaSpringApi.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;

@Data
@NoArgsConstructor
public class PatientDTO {
    private Integer id;
    private String name;
    private String surname;
    private Integer dni;
    private String email;
    private LocalDate initDate= LocalDate.now();
    private AddressDTO address;

    public PatientDTO(String name, String surname, Integer dni, String email, LocalDate initDate, AddressDTO address) {
        this.name = name;
        this.surname = surname;
        this.dni = dni;
        this.email = email;
        this.initDate = initDate;
        this.address = address;
    }
}
