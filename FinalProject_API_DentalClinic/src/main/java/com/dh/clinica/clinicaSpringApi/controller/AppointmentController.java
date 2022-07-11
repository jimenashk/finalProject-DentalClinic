package com.dh.clinica.clinicaSpringApi.controller;

import com.dh.clinica.clinicaSpringApi.DTO.AppointmentDTO;
import com.dh.clinica.clinicaSpringApi.exceptions.ResourceNotFoundException;
import com.dh.clinica.clinicaSpringApi.service.impl.AppointmentService;
import com.dh.clinica.clinicaSpringApi.service.impl.DentistService;
import com.dh.clinica.clinicaSpringApi.service.impl.PatientService;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;



@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final static Logger logger = org.apache.logging.log4j.LogManager.getLogger(AppointmentController.class);


    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private PatientService patientService;
    @Autowired
    private DentistService dentistService;

    @PostMapping("/register")
    public ResponseEntity<AppointmentDTO> create(@RequestBody AppointmentDTO appointmentDTO)  {
        AppointmentDTO newAppointmentDTO = appointmentService.create(appointmentDTO);
        logger.info("Adding appointment: " + appointmentDTO.getDate()+ ", Patient: " + appointmentDTO.getPatient().getId() + ", Dentist: " + appointmentDTO.getDentist().getId());
        return new ResponseEntity<>(newAppointmentDTO, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<AppointmentDTO>  findAppointmentById(@PathVariable Integer id){
        logger.info("Getting appointment by id: " + id);
        if (appointmentService.findById(id) == null) {
            logger.error("Appointment not found");
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(appointmentService.findById(id));

    }


    @PutMapping("/update")
    public ResponseEntity<AppointmentDTO> update(@RequestBody AppointmentDTO appointmentDTO){
        AppointmentDTO newAppointmentDTO = appointmentService.update(appointmentDTO);
        logger.info("Updating appointment: " + appointmentDTO.getDate()+ ", Patient: " + appointmentDTO.getPatient().getId() + ", Dentist: " + appointmentDTO.getDentist().getId());
        return new ResponseEntity<>(newAppointmentDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id) throws ResourceNotFoundException {
        appointmentService.deleteById(id);
        return new ResponseEntity<>("Appointment Deleted", HttpStatus.OK);
    }

    @GetMapping("/list")
    public ResponseEntity<Collection<AppointmentDTO>> findAll() throws ResourceNotFoundException{
        Collection<AppointmentDTO> list = appointmentService.findAll();
        logger.info("Getting all appointments");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}