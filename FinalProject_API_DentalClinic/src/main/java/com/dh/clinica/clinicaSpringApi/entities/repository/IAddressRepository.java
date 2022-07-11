package com.dh.clinica.clinicaSpringApi.entities.repository;

import com.dh.clinica.clinicaSpringApi.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends JpaRepository<Address, Integer> {
}
