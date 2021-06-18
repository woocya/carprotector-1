package com.protector.carprotector.controller;

import com.protector.carprotector.model.Car;
import com.protector.carprotector.model.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
public class HomeController {

    /*@GetMapping("/hejka")
    public String homeControl() {
        return "/home";
    }*/
    /*@Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);
        return "home";
    }*/
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
    public String submitChanges(@RequestParam String carModel, @RequestParam Integer carYearOfProduction, @RequestParam String carVersion, @RequestParam String carRegNumber, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate carInsurance, Model model) {
        Car myCar = carService.getMyCar();
        myCar.setModel(carModel);
        myCar.setYearOfProduction(carYearOfProduction);
        myCar.setVersion(carVersion);
        myCar.setRegistrationNumber(carRegNumber);
        myCar.setInsuranceValid(carInsurance);
        model.addAttribute("car", myCar);
        return "mainpage";
    }
}
