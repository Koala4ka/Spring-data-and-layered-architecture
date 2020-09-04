package com.anna.controller;

import com.anna.entity.Laptop;
import com.anna.service.impl.LaptopServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/laptops")
@Log
@RequiredArgsConstructor
public class LaptopController {

    private final LaptopServiceImpl laptopService;

    @GetMapping("/printAll")
    public List<Laptop> getAll() {
        log.info("Handling print all laptops request");
        return laptopService.printAll();
    }

    @GetMapping("/sortedByProducer")
    public List<Laptop> sortedByProducer() {
        log.info("Handling sorted by producer name laptops request");
        return laptopService.sortedByProducer();
    }

    @GetMapping("/filteredByUsed")
    public List<Laptop> printUsedLaptops() {
        log.info("Handling filtered by used laptops request");
        return laptopService.printUsedLaptops();
    }

    @GetMapping("/filteredByRam")
    public List<Laptop> printByRam() {
        log.info("Handling filtered by ram of laptops request");
        return laptopService.printByRam();
    }

    @PostMapping("/employees")
    Laptop newLaptop(@RequestBody Laptop newLaptop) {
        return laptopService.save(newLaptop);
    }
}
