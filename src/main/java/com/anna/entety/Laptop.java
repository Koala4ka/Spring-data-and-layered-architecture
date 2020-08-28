package com.anna.entety;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "laptop")
@NoArgsConstructor
public class Laptop {
    private long id;
    private String model;
    private String producer;
    private String processor;
    private int ram;
    private boolean used;
    private String shell;
    private BigDecimal price;
    private String dateOfIssue;

}
