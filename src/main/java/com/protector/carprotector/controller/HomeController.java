package com.protector.carprotector.controller;

import com.protector.carprotector.model.Car;
import com.protector.carprotector.model.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return "/mainpage";
    }
}
