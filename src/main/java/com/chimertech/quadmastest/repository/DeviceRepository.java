package com.chimertech.quadmastest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chimertech.quadmastest.model.Device;

public interface DeviceRepository extends JpaRepository<Device, Long> {

    // Additional custom queries can be added here if needed
}
