package com.anna.controller;

import com.anna.service.impl.LaptopServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laptops")
@AllArgsConstructor
public class LaptopController {

    private final LaptopServiceImpl laptopService;

}
