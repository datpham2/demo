package com.example.demo.services;

public interface IVesselService {
    public void addVessel(String name, String country, String type, int length, int grossTonnage, int yearBuilt);
    public void deleteVessel(Long id);
    public void updateVessel(Long id, String name, String country, String type, int length, int grossTonnage, int yearBuilt);
    public void getVessel(Long id);
    public void getAllVessels();
}
