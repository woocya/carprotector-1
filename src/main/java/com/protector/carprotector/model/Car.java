package com.protector.carprotector.model;

import java.time.LocalDate;

public class Car {
    String model;
    Integer yearOfProduction;
    String version;
    String registrationNumber;
    LocalDate insuranceValid;
    StateOfCar state;
    Limitations limits;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", version='" + version + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", insuranceValid=" + insuranceValid +
                ", state=" + state +
                ", limits=" + limits +
                '}';
    }

    public Car(String model, int yearOfProduction, String version, String registrationNumber, LocalDate insuranceValid, StateOfCar state, Limitations limits) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.version = version;
        this.registrationNumber = registrationNumber;
        this.insuranceValid = insuranceValid;
        this.state = state;
        this.limits = limits;
    }

    public void printInfo() {
        System.out.print("Info about my car:\n\nModel: " + model + "\nYear of profuction: " + yearOfProduction + "\nVersion: " + version +"\nRegistration number: " + registrationNumber +"\nInsurance valid till: " + insuranceValid + "\n\n");
        state.printInfo();
        limits.printLimitations();
    }
}
