package com.dh.clinica.clinicaSpringApi.entities.repository;

import com.dh.clinica.clinicaSpringApi.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepository extends JpaRepository<Patient, Integer> {


    @Query(value = "SELECT * FROM patient WHERE patient.email = ?1", nativeQuery = true)
    Patient findByEmail(String email);


}
