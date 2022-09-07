package com.example.BikeShop.service;

import com.example.BikeShop.model.Bike;

import java.util.List;

public interface BikeService {
    List<Bike> getAllBike();

    Bike getBikeById(long id);

    Bike createBikeInformation(Bike bike);

    Bike updateBikeInformationBasedOnId(Bike bike, long id);

    void deleteBikeById(long id);
}

