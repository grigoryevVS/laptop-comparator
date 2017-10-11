package com.vgrigore.controller;

import com.vgrigore.model.Laptop;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.vgrigore.service.LaptopService;

import java.util.List;

@Controller
@RequestMapping("/laptop")
public class LaptopController {

    private LaptopService laptopService;


    public List<Laptop> getLaptops() {
        return laptopService.getLaptops();
    }

    @GetMapping("/{laptopId}")
    public Laptop getLaptop(@PathVariable Long laptopId) {
        return laptopService.getLaptop(laptopId);
    }







    public LaptopService getLaptopService() {
        return laptopService;
    }

    public void setLaptopService(LaptopService laptopService) {
        this.laptopService = laptopService;
    }
}
