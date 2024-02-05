package com.chimertech.quadmastest.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CattleData")
public class CattleData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dataID;

    @ManyToOne
    @JoinColumn(name = "cattleID", nullable = false)
    private Cattle cattle;

    @ManyToOne
    @JoinColumn(name = "deviceID", nullable = false)
    private Device device;

    @ManyToOne
    @JoinColumn(name = "parameterID", nullable = false)
    private Parameter parameter;

    private LocalDateTime timestamp;
    private BigDecimal value;

    // Getters and setters
}
