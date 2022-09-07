package com.example.BikeShop.serviceImpl;

import com.example.BikeShop.model.Bike;
import com.example.BikeShop.repository.BikeRepository;
import com.example.BikeShop.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class BikeServiceImpl implements BikeService {
    @Autowired
    private BikeRepository bikeRepository;

    @Override
    public List<Bike> getAllBike() {
        return bikeRepository.findAll();
    }

    @Override
    public Bike getBikeById(long id) {
        Optional<Bike> bike = bikeRepository.findById(id);
        if (bike.isPresent()) {
            return bike.get();
        } else {
            throw new RuntimeException("Bike not found");
        }
    }

    public Bike createBikeInformation(Bike bike) {
        bike.setPurchaseDate(new Date());
        return bikeRepository.save(bike);
    }

    /**
     * @this updateBikeInformationBasedOnId method is being implemented due to wanna test using postman
     */
    @Override
    public Bike updateBikeInformationBasedOnId(Bike bike, long id) {
        Bike bikeEntityIfExist = getBikeById(id);
        if((bikeEntityIfExist.getName()).equals(bike.getName())){
            bikeEntityIfExist.setPurchaseDate(new Date());
            bikeEntityIfExist.setName(bike.getName());
            bikeEntityIfExist.setEmail(bike.getEmail());
            bikeEntityIfExist.setPhoneNumber(bike.getPhoneNumber());
            bikeEntityIfExist.setSerialNumber(bike.getSerialNumber());
            bikeEntityIfExist.setPurchasePrice(bike.getPurchasePrice());
            bikeEntityIfExist.setContact(bike.getContact());
            return bikeRepository.save(bikeEntityIfExist);
        }else{
            throw new RuntimeException("Bike not found");
        }
    }

    public Bike updateBikeInformation(Bike bike) {
        return bikeRepository.save(bike);
    }

    @Override
    public void deleteBikeById(long id) {
        bikeRepository.deleteById(id);
    }

    //        Optional<Bike> bikeOptional = bikeRepository.findById(id);
//        if (bikeOptional.isPresent()) {
//            Bike bike1 = bikeOptional.get();
//            bike1.setPurchaseDate(new Date());
//            bike1.setBikeName(bike.getBikeName());
//            bike1.setBikeType(bike.getBikeType());
//            bike1.setBikePrice(bike.getBikePrice());
//            bike1.setBikeDescription(bike.getBikeDescription());
//            bike1.setBikeImage(bike.getBikeImage());
//            bike1.setBikeStatus(bike.getBikeStatus());
//            bike1.setBikeQuantity(bike.getBikeQuantity());
//            bikeRepository.save(bike1);
//            return bike1;
//        } else {
//            throw new RuntimeException("Bike not found");
//        }
}
