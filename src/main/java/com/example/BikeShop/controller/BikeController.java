package com.example.BikeShop.controller;

import com.example.BikeShop.model.Bike;
import com.example.BikeShop.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bike")
public class BikeController {
    @Autowired
    private BikeService bikeService;

    @GetMapping
    public ResponseEntity<List<Bike>> getAllBike() {
        return new ResponseEntity<>(bikeService.getAllBike(), HttpStatus.OK);
    }

    @PostMapping("/createBike")
    public ResponseEntity<Bike> createBike(@RequestBody Bike bike) {
        return new ResponseEntity<Bike>(bikeService.createBikeInformation(bike), HttpStatus.OK);
    }

    @PutMapping("/updateBike/{id}")
    public ResponseEntity<Bike> updateBikeBasedOnId(@RequestBody Bike bike, @PathVariable(name = "id") long id) {
        return new ResponseEntity<>(bikeService.updateBikeInformationBasedOnId(bike,id), HttpStatus.OK);
    }

    @DeleteMapping("/deleteBike/{id}")
    public ResponseEntity<String> deleteBikeById(@PathVariable(name = "id") long id){
        bikeService.deleteBikeById(id);
        return new ResponseEntity<>("",HttpStatus.OK);
    }
}
