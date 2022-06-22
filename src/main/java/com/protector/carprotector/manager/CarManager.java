package com.protector.carprotector.manager;

import com.protector.carprotector.model.Car;
import com.protector.carprotector.model.Coordinates;
import com.protector.carprotector.model.Engine;
import com.protector.carprotector.model.Limitations;
import com.protector.carprotector.repositories.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@Service
public class CarManager {

    private CarRepo carRepo;

    @Autowired
    public CarManager(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public Optional<Car> findById(Long id) {
        return carRepo.findById(id);
    }

    public Iterable<Car> findAll() {
        return carRepo.findAll();
    }

    public Car save(Car _car) {
        return carRepo.save(_car);
    }

    public void deleteById(Long id) {
        carRepo.deleteById(id);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Car(1L, "Toyota CHR", 2020, "Hybrid", "EL-345WR", LocalDate.of(2020,01,01), new Limitations(LocalTime.parse("09:00:00"), LocalTime.parse("23:00:00"), new Coordinates(51.65, "N", 19.4, "E"), new Coordinates(51.9, "N", 19.6, "E"), false), new Engine(0, false, LocalDate.of(1990,01,01), LocalTime.parse("00:00:00")), new Coordinates(0.0, "N", 0.0, "E")));
    }
}
