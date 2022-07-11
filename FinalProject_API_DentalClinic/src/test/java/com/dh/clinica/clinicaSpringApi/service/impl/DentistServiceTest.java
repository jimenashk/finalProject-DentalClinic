package com.dh.clinica.clinicaSpringApi.service.impl;

import com.dh.clinica.clinicaSpringApi.DTO.DentistDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DentistServiceTest {

    @Autowired
    private DentistService dentistService;

    @Test
    public void testCreateDentist(){
        DentistDTO dentistDTO = new DentistDTO();
        dentistDTO.setId(3);
        dentistDTO.setName("Jimena");
        dentistDTO.setSurname("Horba");
        dentistDTO.setRegister(456);
        dentistService.create(dentistDTO);

        dentistService.findById(3);

        assertEquals(dentistService.findById(3).getName(), "Jimena");

    }


    @Test
    public void testFindById() {
        DentistDTO dentistDTO = new DentistDTO();
        dentistDTO.setId(2);
        dentistDTO.setName("Jimena");
        dentistDTO.setSurname("Horba");
        dentistDTO.setRegister(456);
        dentistService.create(dentistDTO);

        dentistService.findById(1);

        assertEquals("Jimena", dentistService.findById(2).getName());
    }

    @Test
    public void testUpdateDentist(){
        DentistDTO dentistDTO = new DentistDTO();
        dentistDTO.setId(4);
        dentistDTO.setName("Jimena");
        dentistDTO.setSurname("Horba");
        dentistDTO.setRegister(456);
        dentistService.create(dentistDTO);

        dentistService.update(dentistDTO);

        assertEquals("Jimena", dentistService.findById(4).getName());
    }

    @Test
    public void testFindAll(){
        DentistDTO dentistDTO = new DentistDTO();
        dentistDTO.setId(1);
        dentistDTO.setName("Jimena");
        dentistDTO.setSurname("Horba");
        dentistDTO.setRegister(456);
        dentistService.create(dentistDTO);

        dentistService.findAll();

        assertTrue(dentistService.findAll().size()>0);
    }

    @Test
    public void testDeleteDentist(){

        dentistService.deleteById(1);

        DentistDTO dentistTest = dentistService.findById(1);

        assertNull(dentistTest);
    }
}