package com.springpractice.SpringServerLayers.repo;

import com.springpractice.SpringServerLayers.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Saved in Database!");
    }
}
