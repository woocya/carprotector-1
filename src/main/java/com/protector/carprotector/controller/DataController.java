/*
package com.protector.carprotector.controller;

import com.protector.carprotector.model.Car;
import com.protector.carprotector.repositories.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

@Controller
public class DataController {

    private CarRepo myCar;

    @Autowired
    public DataController(CarRepo car) {
        this.myCar = car;
    }

    @PutMapping("/mainpage")
    public String modifyCoordinates(@RequestParam Long id, @RequestParam double latitude, @RequestParam String dirLatitude, @RequestParam double longitude, @RequestParam String dirLongitude) {
        //Car myCar = carService.getMyCar();
        Optional<Car> foundCar = myCar.findById(id);
        if (foundCar.isPresent()) {
            Car _car = foundCar.get();
            _car.setCoordinates(latitude, dirLatitude, longitude, dirLongitude);
        }
        return "mainpage";
    }

    @GetMapping("/editCar")
    public String showMyCarToEdit(Model model) {
        //Car myCar = carService.getMyCar();
        Optional<Car> foundCar = myCar.findById(1L);
        if (foundCar.isPresent()) {
            Car _car = foundCar.get();
            model.addAttribute("car", _car);
        }

        return "editCar";
    }

    @PostMapping("/editCar")
    public String submitChanges(@RequestParam String carModel, @RequestParam Integer carYearOfProduction, @RequestParam String carVersion, @RequestParam String carRegNumber, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate carInsurance, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime carStartTime, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime carEndTime, @RequestParam Double carStartLatitude, @RequestParam String carStartLatitudeDir, @RequestParam Double carStartLongitude, @RequestParam String carStartLongitudeDir, @RequestParam Double carEndLatitude, @RequestParam String carEndLatitudeDir, @RequestParam Double carEndLongitude, @RequestParam String carEndLongitudeDir, @RequestParam boolean carAllowedMotion, Model model) {
        //Car myCar = carService.getMyCar();
        Optional<Car> foundCar = myCar.findById(1L);
        if (foundCar.isPresent()) {
            Car _car = foundCar.get();
            model.addAttribute("car", _car);
            _car.setModel(carModel);
            _car.setYearOfProduction(carYearOfProduction);
            _car.setVersion(carVersion);
            _car.setRegistrationNumber(carRegNumber);
            _car.setInsuranceValid(carInsurance);
            _car.setLimits(carStartTime, carEndTime, carStartLatitude, carStartLatitudeDir, carStartLongitude, carStartLongitudeDir, carEndLatitude, carEndLatitudeDir, carEndLongitude, carEndLongitudeDir, carAllowedMotion);
            model.addAttribute("car", _car);
        }
        return "/mainpage";
    }


}
*/
