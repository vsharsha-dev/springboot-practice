package com.springpractice.SpringServerLayers.service;

import com.springpractice.SpringServerLayers.repo.LaptopRepository;
import com.springpractice.SpringServerLayers.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        repo.save(lap);
    }

    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }
}
