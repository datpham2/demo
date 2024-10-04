package com.example.demo.repositories;

import com.example.demo.models.Vessel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VesselRepository extends JpaRepository<Vessel, Long> {
}
