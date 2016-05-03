package com.example.rated.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rated.domain.Location;
import com.example.rated.repository.LocationRepository;

@Service
public class LocationService {
    @Autowired
    private LocationRepository locationRepository;
    
    public Location getLocation(String name) {
        return locationRepository.findByName(name);
    }
}
