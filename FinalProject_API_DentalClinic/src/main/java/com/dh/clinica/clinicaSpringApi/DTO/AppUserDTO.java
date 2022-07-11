package com.dh.clinica.clinicaSpringApi.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppUserDTO {

    private String email;
    private String name;
    private String username;
    private String password;


}