package com.dh.clinica.clinicaSpringApi.controller;
//esta clase es el nexo que se encarga d comunicarse con la vista
// y con el modelo dnd estan los datos

import com.dh.clinica.clinicaSpringApi.DTO.PatientDTO;
import com.dh.clinica.clinicaSpringApi.entities.Patient;
import com.dh.clinica.clinicaSpringApi.service.impl.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/register")
    public ResponseEntity<?> create (@RequestBody PatientDTO patientDTO) {
        patientService.create(patientDTO);
        return ResponseEntity.ok(HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientDTO> findPatientById(@PathVariable Integer id) {
        PatientDTO patientDTO  = patientService.findById(id);
        return new ResponseEntity<>(patientDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<?> update (@RequestBody PatientDTO patientDTO) {
        patientService.update(patientDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete (@PathVariable Integer id) {
        patientService.deleteById(id);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/list")
    public Collection<PatientDTO> findAll() {
        return patientService.findAll();

    }
}
