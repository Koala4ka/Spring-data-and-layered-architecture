package com.anna.executor;

import com.anna.controller.LaptopController;
import com.anna.service.LaptopService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Component
public class Executor {

    private final LaptopController laptopController;
    private final LaptopService laptopService;

  @PostConstruct
    public  void start() {
        laptopService.fillData();

        System.out.println("All laptops in database:");
        laptopController.getAll().forEach(System.out::println);

        System.out.println("Laptops with memory bigger than 16GB:");
        laptopController.printByRam().forEach(System.out::println);

        System.out.println("Second hand  laptops:");
        laptopController.printUsedLaptops().forEach(System.out::println);

        System.out.println("Laptops sorted by producer");
        laptopController.sortedByProducer().forEach(System.out::println);
    }
}

