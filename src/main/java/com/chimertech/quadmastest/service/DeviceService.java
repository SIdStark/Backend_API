package com.chimertech.quadmastest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chimertech.quadmastest.model.Device;
import com.chimertech.quadmastest.repository.DeviceRepository;

@Service
public class DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    // Add a new device
    public Device addDevice(Device device) {
        return deviceRepository.save(device);
    }

    // Remove a device by ID
    public void removeDevice(Long deviceId) {
        deviceRepository.deleteById(deviceId);
    }
    
 // List all devices
    public List<Device> getAllDevices() {
        return deviceRepository.findAll();
    }

    // Additional methods can be added based on your requirements
}

