package com.chimertech.quadmastest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chimertech.quadmastest.model.Parameter;
import com.chimertech.quadmastest.repository.ParameterRepository;

@Service
public class ParameterService {

    private final ParameterRepository parameterRepository;

    @Autowired
    public ParameterService(ParameterRepository parameterRepository) {
        this.parameterRepository = parameterRepository;
    }

    // Add a new parameter
    public Parameter addParameter(Parameter parameter) {
        return parameterRepository.save(parameter);
    }

    // Remove a parameter by ID
    public void deleteParameter(Long parameterId) {
        parameterRepository.deleteById(parameterId);
    }

    // List all parameters
    public List<Parameter> listAllParameters() {
        return parameterRepository.findAll();
    }

    // Additional methods can be added based on your requirements
}
