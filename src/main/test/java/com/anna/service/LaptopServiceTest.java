package com.anna.service;

import com.anna.entity.Laptop;
import com.anna.repository.LaptopRepository;
import com.anna.service.impl.LaptopServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@ExtendWith(MockitoExtension.class)
public class LaptopServiceTest {

    @Mock
    private LaptopRepository laptopRepository;

    @InjectMocks
    private LaptopServiceImpl laptopService;

    @Test
    public void testFiltrationOfLaptopByProducer() {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop(1, "MACBOOK AIR", "APPLE", "Cor i5-10300H", 16, false, "metal", new BigDecimal("25000.00"), "11.03.2019"));
        laptops.add(new Laptop(2, "4LS70ES", "HP", "Cor i3-10200H", 8, true, "plastic", new BigDecimal("7000.00"), "15.06.2017"));
        laptops.add(new Laptop(3, "XPS 13", "DELL", "Intel Core i5-1035G1", 12, true, "aluminium", new BigDecimal("9000.00"), "1.06.2018"));
        laptops.add(new Laptop(4, "MacBook Pro 15", "Apple", "Intel Core i7-9750H", 16, false, "aluminium", new BigDecimal("25000.00"), "1.06.2020"));
        Mockito.when(laptopRepository.findAll()).thenReturn(laptops);

        List<Laptop>sortedLaptops=laptopService.sortedByProducer();
        Assertions.assertEquals(2,sortedLaptops.get(0).getId());
        Assertions.assertEquals(3,sortedLaptops.get(1).getId());
        Assertions.assertEquals(4,sortedLaptops.get(2).getId());
        Assertions.assertEquals(1,sortedLaptops.get(3).getId());
    }
}

