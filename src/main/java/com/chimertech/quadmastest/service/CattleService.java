package com.chimertech.quadmastest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chimertech.quadmastest.model.Cattle;
import com.chimertech.quadmastest.repository.CattleRepository;

@Service
public class CattleService {

    private final CattleRepository cattleRepository;

    @Autowired
    public CattleService(CattleRepository cattleRepository) {
        this.cattleRepository = cattleRepository;
    }

    // Add a new cattle
    public Cattle addCattle(Cattle cattle) {
        return cattleRepository.save(cattle);
    }

    // Remove a cattle by ID
    public void deleteCattle(Long cattleId) {
        cattleRepository.deleteById(cattleId);
    }

    // List all cattles
    public List<Cattle> listAllCattles() {
        return cattleRepository.findAll();
    }

    // Additional methods can be added based on your requirements
}
