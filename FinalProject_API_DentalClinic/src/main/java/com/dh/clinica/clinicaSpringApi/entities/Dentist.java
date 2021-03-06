package com.dh.clinica.clinicaSpringApi.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "dentists")

public class Dentist {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        private Integer id;
        private String name;
        private String surname;
        private Integer register;
        @OneToMany(mappedBy = "dentist", fetch = FetchType.LAZY)
        @JsonIgnore
        private Set<Appointment> appointments;


}
