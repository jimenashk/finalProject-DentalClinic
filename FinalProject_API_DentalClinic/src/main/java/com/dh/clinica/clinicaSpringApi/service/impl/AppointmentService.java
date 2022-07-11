package com.dh.clinica.clinicaSpringApi.service.impl;

import com.dh.clinica.clinicaSpringApi.DTO.AppointmentDTO;
import com.dh.clinica.clinicaSpringApi.entities.Appointment;
import com.dh.clinica.clinicaSpringApi.entities.repository.IAppointmentRepository;
import com.dh.clinica.clinicaSpringApi.service.IAppointmentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class AppointmentService implements IAppointmentService {

    @Autowired
    private IAppointmentRepository appointmentRepository;

    @Autowired
    public AppointmentService(IAppointmentRepository appointmentRepository, ObjectMapper objectMapper) {
        this.appointmentRepository = appointmentRepository;
        this.objectMapper = objectMapper;
    }

    @Autowired
    ObjectMapper objectMapper;


    @Override
    public AppointmentDTO findById(Integer id) {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        Optional<Appointment> appointment = appointmentRepository.findById(id);
        AppointmentDTO appointmentDTO = null;
        if(appointment.isPresent())
            appointmentDTO = objectMapper.convertValue(appointment, AppointmentDTO.class);
        return appointmentDTO;
    }

    @Override
    public AppointmentDTO create(AppointmentDTO appointmentDTO) {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        Appointment appointment = objectMapper.convertValue(appointmentDTO, Appointment.class);
        appointmentRepository.save(appointment);
        return appointmentDTO;
    }

    @Override
    public void deleteById(Integer id) {
        appointmentRepository.deleteById(id);

    }

    @Override
    public AppointmentDTO update(AppointmentDTO appointmentDTO) {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        Appointment appointment = objectMapper.convertValue(appointmentDTO, Appointment.class);
        appointmentRepository.save(appointment);
        return appointmentDTO;
    }

    @Override
    public Set<AppointmentDTO> findAll() {
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        List<Appointment> appointments = appointmentRepository.findAll();
        Set<AppointmentDTO> appointmentDTOS = new HashSet<>();
        for (Appointment appointment : appointments) {
            appointmentDTOS.add(objectMapper.convertValue(appointment, AppointmentDTO.class));
        }
        return appointmentDTOS;
    }
}