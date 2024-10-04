package com.example.demo.services;

import com.example.demo.models.Vessel;
import com.example.demo.repositories.VesselRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VesselService {
    private final VesselRepository vesselRepository;

    public void addVessel(String name, String country, String type, int length, int grossTonnage, int yearBuilt) {
        Vessel vessel = new Vessel(name, country, type, length, grossTonnage, yearBuilt);
        vesselRepository.save(vessel);
    }

    public void addVessel(@RequestBody Vessel vessel) {
        vesselRepository.save(vessel);
    }

    public void deleteVessel(Long id) {
        vesselRepository.deleteById(id);
    }

    public void updateVessel(Long id, String name, String country, String type, int length, int grossTonnage, int yearBuilt) {
        Vessel vessel = vesselRepository.findById(id).orElseThrow();
        vessel.setName(name);
        vessel.setCountry(country);
        vessel.setType(type);
        vessel.setLength(length);
        vessel.setGrossTonnage(grossTonnage);
        vessel.setYearBuilt(yearBuilt);
        vesselRepository.save(vessel);
    }

    public void getVessel(Long id) {
        Vessel vessel = vesselRepository.findById(id).orElseThrow();
        System.out.println(vessel);
    }

    public void getAllVessels() {
        vesselRepository.findAll().forEach(System.out::println);
    }

    public List<Vessel> getAllVesselsList() {
        return vesselRepository.findAll();
    }
}
