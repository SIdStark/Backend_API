package com.chimertech.quadmastest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chimertech.quadmastest.model.Parameter;

public interface ParameterRepository extends JpaRepository<Parameter, Long> {

    // Additional custom queries can be added here if needed
}
