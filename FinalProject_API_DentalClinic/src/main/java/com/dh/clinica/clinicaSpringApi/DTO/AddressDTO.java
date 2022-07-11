package com.dh.clinica.clinicaSpringApi.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;

@Data
@NoArgsConstructor
public class AddressDTO {

    private Integer id;
    private String street;
    private Integer number;
    private String city;

    public AddressDTO(String street, Integer number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }
}
