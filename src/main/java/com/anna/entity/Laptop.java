package com.anna.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
