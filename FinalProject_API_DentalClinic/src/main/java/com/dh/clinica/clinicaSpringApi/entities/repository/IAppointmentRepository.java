package com.dh.clinica.clinicaSpringApi.entities.repository;

import com.dh.clinica.clinicaSpringApi.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppointmentRepository extends JpaRepository<Appointment, Integer> {
}
