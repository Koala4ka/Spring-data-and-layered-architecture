package com.anna.repository;

import com.anna.entety.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

    @Query("From Laptop l where l.used =TRUE")
    List<Laptop> filterByUsed();

    @Query("From Laptop l where l.ram >16 order by l.ram ")
    List<Laptop> printByRam();
}
