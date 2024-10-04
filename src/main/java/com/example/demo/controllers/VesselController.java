package com.example.demo.controllers;

import com.example.demo.models.Vessel;
import com.example.demo.services.VesselService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vessels")
@RequiredArgsConstructor
public class VesselController {
    private final VesselService vesselService;

    @GetMapping("/all")
    public void getAllVessels() {
        vesselService.getAllVessels();
    }

    @GetMapping("/allList")
    public List<Vessel> getAllVesselsList() {
        return vesselService.getAllVesselsList();
    }

    @PostMapping("/add")
    public void addVessel(@RequestBody Vessel vessel) {
        vesselService.addVessel(vessel);
    }
    /*
    Example of json body for POST request:
    {
        "name": "PAULA",
        "country": "Antigua and Barbuda",
        "type": "General Cargo",
        "length": 151,
        "grossTonnage": 8397,
        "yearBuilt": 2000,
        "id": 1
     }

     {
        "name": "PRELUDE",
        "country": "Australia",
        "type": "Offshore Support Vessel",
        "length": 488,
        "grossTonnage": 499167,
        "yearBuilt": 2017,
        "id": 2
        }

        {
        "name": "PIONEERING SPIRIT",
        "country": "Malta",
        "type": "Crane Ship",
        "length": 477,
        "grossTonnage": 403342,
        "yearBuilt": 2014,
        "id": 3
        }

        {
        "name": "CORAL-SUL FLNG",
        "country": "Bahamas",
        "type": "Offshore Support Vessel",
        "length": 276,
        "grossTonnage": 346165,
        "yearBuilt": 2021,
        "id": 4
        }

        Example of json body for PUT request:
        {
            "name": "PAULA",
            "country": "Antigua and Barbuda",
            "type": "General Cargo",
            "length": 151,
            "grossTonnage": 8397,
            "yearBuilt": 2000,
            "id": 1
        }
     */
}
