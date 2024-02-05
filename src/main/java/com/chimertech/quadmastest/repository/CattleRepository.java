package com.chimertech.quadmastest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chimertech.quadmastest.model.Cattle;

public interface CattleRepository extends JpaRepository<Cattle, Long> {

    // Additional custom queries can be added here if needed
}

