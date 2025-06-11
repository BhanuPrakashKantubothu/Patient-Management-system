package com.pm.patientservice.repository;

import org.springframework.stereotype.Repository;


import com.pm.patientservice.model.Patient;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {
    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, UUID id);
}
