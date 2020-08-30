package com.anna.entety;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@ToString
@NoArgsConstructor
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

    public Laptop(String model, String producer, String processor, int ram, boolean used, String shell, BigDecimal price, String dateOfIssue) {
        this.model = model;
        this.producer = producer;
        this.processor = processor;
        this.ram = ram;
        this.used = used;
        this.shell = shell;
        this.price = price;
        this.dateOfIssue = dateOfIssue;
    }
}
