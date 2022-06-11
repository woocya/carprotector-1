/*
package com.protector.carprotector.bootstrap;

import com.protector.carprotector.model.*;
import com.protector.carprotector.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Month;

@Component
public class BootStrapData implements CommandLineRunner {
    private final CoordinatesRepository coordinatesRepository;
    private final StateOfCarRepository stateOfCarRepository;

    public BootStrapData(CoordinatesRepository coordinatesRepository, StateOfCarRepository stateOfCarRepository) {
        this.coordinatesRepository = coordinatesRepository;
        this.stateOfCarRepository = stateOfCarRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Coordinates coordinates = new Coordinates(51.102030, "N", 19.102030, "E");
        Location location = new Location(coordinates, "Dowolna");
        Generators generator = new Generators();
        Engine engine = new Engine(false, false, generator.generateDate(2022, Month.MAY, 01, 2022, Month.MAY, 01), generator.generateTime());
        StateOfCar state = new StateOfCar(location, engine);
    }

}
*/
