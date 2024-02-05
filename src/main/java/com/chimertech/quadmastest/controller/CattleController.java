package com.chimertech.quadmastest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chimertech.quadmastest.model.Cattle;
import com.chimertech.quadmastest.service.CattleService;

@RestController
@RequestMapping("/cattles")
public class CattleController {

    private final CattleService cattleService;

    @Autowired
    public CattleController(CattleService cattleService) {
        this.cattleService = cattleService;
    }

    @PostMapping
    public ResponseEntity<Cattle> addCattle(@RequestBody Cattle cattle) {
        Cattle newCattle = cattleService.addCattle(cattle);
        return new ResponseEntity<>(newCattle, HttpStatus.CREATED);
    }

    @DeleteMapping("/{cattleId}")
    public ResponseEntity<Void> deleteCattle(@PathVariable Long cattleId) {
        cattleService.deleteCattle(cattleId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Cattle>> listAllCattles() {
        List<Cattle> cattles = cattleService.listAllCattles();
        return new ResponseEntity<>(cattles, HttpStatus.OK);
    }
}

