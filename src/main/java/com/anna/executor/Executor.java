package com.anna.executor;

import com.anna.service.LaptopService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor

@Component
public class Executor {

    private final LaptopService laptopService;

    @PostConstruct
    public  void start() {
        laptopService.fillData();

        System.out.println("All laptops in database:");
        laptopService.printAll().forEach(System.out::println);

        System.out.println("Laptops with memory bigger than 16GB:");
        laptopService.printByRam().forEach(System.out::println);

        System.out.println("Second hand  laptops:");
        laptopService.printUsedLaptops().forEach(System.out::println);

        System.out.println("Laptops sorted by producer");
        laptopService.sortedByProducer().forEach(System.out::println);
    }
}

