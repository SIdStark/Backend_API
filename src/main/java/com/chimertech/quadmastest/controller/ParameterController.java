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

import com.chimertech.quadmastest.model.Parameter;
import com.chimertech.quadmastest.service.ParameterService;

@RestController
@RequestMapping("/parameters")
public class ParameterController {

    private final ParameterService parameterService;

    @Autowired
    public ParameterController(ParameterService parameterService) {
        this.parameterService = parameterService;
    }

    @PostMapping
    public ResponseEntity<Parameter> addParameter(@RequestBody Parameter parameter) {
        Parameter newParameter = parameterService.addParameter(parameter);
        return new ResponseEntity<>(newParameter, HttpStatus.CREATED);
    }

    @DeleteMapping("/{parameterId}")
    public ResponseEntity<Void> deleteParameter(@PathVariable Long parameterId) {
        parameterService.deleteParameter(parameterId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public ResponseEntity<List<Parameter>> listAllParameters() {
        List<Parameter> parameters = parameterService.listAllParameters();
        return new ResponseEntity<>(parameters, HttpStatus.OK);
    }
}
