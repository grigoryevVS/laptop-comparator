package com.vgrigore.service;

import com.vgrigore.dao.LaptopManager;
import com.vgrigore.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {

    private LaptopManager laptopManager;


    public List<Laptop> getLaptops() {
        return laptopManager.getAllLaptops();
    }

    public Laptop getLaptop(Long laptopId) {
        return laptopManager.getLaptopById(laptopId);
    }




    public LaptopManager getLaptopManager() {
        return laptopManager;
    }

    public void setLaptopManager(LaptopManager laptopManager) {
        this.laptopManager = laptopManager;
    }

}
