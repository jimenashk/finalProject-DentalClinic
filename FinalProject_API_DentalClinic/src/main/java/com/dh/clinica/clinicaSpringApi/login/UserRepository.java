package com.dh.clinica.clinicaSpringApi.login;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<AppUser, Integer> {

    Optional<AppUser> findByEmail(String email);

}