package com.dh.clinica.clinicaSpringApi.entities.repository;

import com.dh.clinica.clinicaSpringApi.entities.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDentistRepository extends JpaRepository<Dentist, Integer> {

}