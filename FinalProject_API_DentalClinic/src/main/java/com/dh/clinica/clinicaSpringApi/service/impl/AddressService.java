package com.dh.clinica.clinicaSpringApi.service.impl;

import com.dh.clinica.clinicaSpringApi.DTO.AddressDTO;
import com.dh.clinica.clinicaSpringApi.entities.repository.IAddressRepository;
import com.dh.clinica.clinicaSpringApi.service.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AddressService implements IAddressService {
    @Autowired
    private IAddressRepository addressRepository;

    @Override
    public AddressDTO findById(Integer id) {
        return null;
    }

    @Override
    public AddressDTO create(AddressDTO addressDTO) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public AddressDTO update(AddressDTO addressDTO) {
        return null;
    }

    @Override
    public Set<AddressDTO> findAll() {
        return null;
    }

   }