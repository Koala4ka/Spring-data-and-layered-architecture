package com.anna.controller;

import com.anna.service.LaptopService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(LaptopController.class)
public class LaptopControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private LaptopService laptopService;

    @Test
    void getAll() {

    }

    @Test
    void sortedByProducer() {
    }
    @Test
    void printUsedLaptops() {
    }

    @Test
    void printByRam() {
    }

    @Test
    void newLaptop() {
    }

}
