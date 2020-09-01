package com.anna.service;

import com.anna.entety.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop save(Laptop laptop);

    List<Laptop> printAll();

    List<Laptop> sortedByProducer();

    List<Laptop> printByRam();

    List<Laptop> printUsedLaptops();

    void fillData();


}
