package com.example.rated.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rated.domain.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
    public Location findByName(String name);
}
