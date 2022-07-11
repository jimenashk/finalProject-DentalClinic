package com.dh.clinica.clinicaSpringApi.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class DentistDTO {

    private Integer id;
    private String name;
    private String surname;
    private Integer register;

    public DentistDTO(String name, String surname, Integer register) {
        this.name = name;
        this.surname = surname;
        this.register = register;
    }
}


