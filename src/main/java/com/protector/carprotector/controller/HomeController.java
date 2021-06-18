package com.protector.carprotector.controller;

import com.protector.carprotector.model.Car;
import com.protector.carprotector.model.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.time.LocalDate;

@Controller
public class HomeController {
    @Autowired
    CarService carService;

    @GetMapping("/mainpage")
    public String showMyCar(Model model) {
        Car myCar = carService.getMyCar();
        model.addAttribute("car", myCar);
        return "mainpage";
    }

    @GetMapping("/editCar")
    public String showMyCarToEdit(Model model) {
        Car myCar = carService.getMyCar();
        model.addAttribute("car", myCar);
        return "editCar";
    }

    @PostMapping("/editCar")
    public String submitChanges(@RequestParam String carModel, @RequestParam Integer carYearOfProduction, @RequestParam String carVersion, @RequestParam String carRegNumber, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate carInsurance, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime carStartTime, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.TIME) LocalTime carEndTime, @RequestParam Double carStartLatitude, @RequestParam String carStartLatitudeDir, @RequestParam Double carStartLongitude, @RequestParam String carStartLongitudeDir, @RequestParam Double carEndLatitude, @RequestParam String carEndLatitudeDir, @RequestParam Double carEndLongitude, @RequestParam String carEndLongitudeDir, @RequestParam boolean carAllowedMotion, Model model) {
        Car myCar = carService.getMyCar();
        myCar.setModel(carModel);
        myCar.setYearOfProduction(carYearOfProduction);
        myCar.setVersion(carVersion);
        myCar.setRegistrationNumber(carRegNumber);
        myCar.setInsuranceValid(carInsurance);
        myCar.setLimits(carStartTime, carEndTime, carStartLatitude, carStartLatitudeDir, carStartLongitude, carStartLongitudeDir, carEndLatitude, carEndLatitudeDir, carEndLongitude, carEndLongitudeDir, carAllowedMotion);
        model.addAttribute("car", myCar);
        return "/mainpage";
    }
}
