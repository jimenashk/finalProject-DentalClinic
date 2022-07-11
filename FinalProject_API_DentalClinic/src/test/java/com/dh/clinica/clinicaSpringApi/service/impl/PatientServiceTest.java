package com.dh.clinica.clinicaSpringApi.service.impl;

import com.dh.clinica.clinicaSpringApi.DTO.PatientDTO;
import com.dh.clinica.clinicaSpringApi.service.IPatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientServiceTest {

    @Autowired
    private IPatientService patientService;

    @Test
    public void testCreatePatient() {

        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setName("Jimena");
        patientDTO.setSurname("Horba");
        patientDTO.setDni(1324);
        patientService.create(patientDTO);

        PatientDTO patientJime = patientService.findById(1);


        assertTrue(patientJime != null);

    }

    @Test
    public void testUpdatePatient() {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setName("Jimena");
        patientDTO.setSurname("Horba");
        patientDTO.setDni(1324);

        patientService.create(patientDTO);

        PatientDTO patientJime = patientService.findById(1);
        patientJime.setName("Jimena");
        patientJime.setSurname("Horba");
        patientJime.setDni(1324);

        patientService.update(patientJime);

        PatientDTO patientJime2 = patientService.findById(1);

        assertTrue(patientJime2.getName().equals("Jimena"));
    }

    @Test
    public void testFindAll() {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setName("Jimena");
        patientDTO.setSurname("Horba");

        patientService.create(patientDTO);

        PatientDTO patientJime = patientService.findById(1);

        assertTrue(patientJime != null);
    }

    @Test
    public void testFindById() {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setName("Jimena");
        patientDTO.setSurname("Horba");
        patientDTO.setDni(1324);

        patientService.create(patientDTO);

        PatientDTO patientJime = patientService.findById(1);

        assertTrue(patientJime != null);
    }

    @Test
    public void testDeletePatient() {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(1);
        patientDTO.setName("Jimena");
        patientDTO.setSurname("Horba");

        patientService.create(patientDTO);
        patientService.deleteById(1);

        PatientDTO patientJime = patientService.findById(1);

        assertTrue(patientJime == null);

    }

}