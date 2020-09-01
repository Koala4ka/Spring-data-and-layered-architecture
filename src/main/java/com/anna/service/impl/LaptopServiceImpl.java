package com.anna.service.impl;

import com.anna.entety.Laptop;
import com.anna.repository.LaptopRepository;
import com.anna.service.LaptopService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LaptopServiceImpl implements LaptopService {

    final LaptopRepository laptopRepository;

    @Override
    public Laptop save(Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    @Override
    public List<Laptop> printAll() {
        return laptopRepository.findAll();
    }

    @Override
    public List<Laptop> sortedByProducer() {
        return laptopRepository.findAll().stream()
                .sorted(Comparator.comparing(Laptop::getProducer)
                        .reversed()).collect(Collectors.toList());
    }

    @Override
    public List<Laptop> printByRam() {
        return laptopRepository.printByRam();
    }

    @Override
    public List<Laptop> printUsedLaptops() {
        return laptopRepository.filterByUsed();
    }

    @Override
    public void fillData() {
        save(new Laptop("MACBOOK AIR", "APPLE", "Cor i5-10300H", 16, false, "metal", new BigDecimal("25000.00"), "11.03.2019"));
        save(new Laptop("4LS70ES", "HP", "Cor i3-10200H", 8, true, "plastic", new BigDecimal("7000.00"), "15.06.2017"));
        save(new Laptop("XPS 13", "DELL", "Intel Core i5-1035G1", 12, true, "aluminium", new BigDecimal("9000.00"), "1.06.2018"));
        save(new Laptop("MacBook Pro 15", "Apple", "Intel Core i7-9750H", 16, false, "aluminium", new BigDecimal("25000.00"), "1.06.2020"));
        save(new Laptop("TUF Gaming", "ASUS", "AMD Ryzen 5 3550H", 8, true, "plastic", new BigDecimal("12000.00"), "1.06.2020"));
        save(new Laptop("Mi Notebook Pro", "Xiaomi", "Intel Core i5-8250U", 14, false, "plastic", new BigDecimal("13000.00"), "1.07.2019"));
        save(new Laptop("MateBook D 14", "Huawei", "Intel Core i5-8250U", 16, true, "plastic", new BigDecimal("5000.00"), "25.04.2016"));
        save(new Laptop("ROG Strix G17", "Acer", "AMD Ryzen 5 3500U", 8, false, "plastic", new BigDecimal("700.00"), "14.08.2020"));
    }
}

