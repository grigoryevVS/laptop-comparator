package com.vgrigore.dao;

import com.vgrigore.model.Laptop;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class LaptopManager {



    public List<Laptop> getAllLaptops() {
        List<Laptop> resultStub = new ArrayList<>();
        Laptop l1 = new Laptop();

        return Collections.emptyList();
    }

    public Laptop getLaptopById(Long laptopId) {
        return null;
    }
}
