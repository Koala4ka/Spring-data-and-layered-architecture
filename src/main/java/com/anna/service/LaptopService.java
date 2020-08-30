package com.anna.service;

import com.anna.entety.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop save(Laptop laptop);

    List<Laptop> printAll();

    void fillData();

}
