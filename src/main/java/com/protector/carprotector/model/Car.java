package com.protector.carprotector.model;

import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public class Car {
    private String model;
    private Integer yearOfProduction;
    private String version;
    private String registrationNumber;
    private LocalDate insuranceValid;
    private StateOfCar state;
    private Limitations limits;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public LocalDate getInsuranceValid() {
        return insuranceValid;
    }

    public void setInsuranceValid(LocalDate insuranceValid) {
        this.insuranceValid = insuranceValid;
    }

    public StateOfCar getState() {
        return state;
    }

    public void setState(StateOfCar state) {
        this.state = state;
    }

    public Limitations getLimits() {
        return limits;
    }

    public void setLimits(LocalTime startTimeOfUse, LocalTime endTimeOfUse, Double carStartLatitude, String carStartLatitudeDir, Double carStartLongitude, String carStartLongitudeDir, Double carEndLatitude, String carEndLatitudeDir, Double carEndLongitude, String carEndLongitudeDir, boolean allowedMotion) {
        this.limits.startTimeOfUse = startTimeOfUse;
        this.limits.endTimeOfUse = endTimeOfUse;
        //---------------------------------------------------------------------
        this.limits.allowedRangeMin.setLatitude(carStartLatitude);
        this.limits.allowedRangeMin.setDirLatitude(carStartLatitudeDir);
        this.limits.allowedRangeMin.setLongitude(carStartLongitude);
        this.limits.allowedRangeMin.setDirLongitude(carStartLongitudeDir);
        //---------------------------------------------------------------------
        this.limits.allowedRangeMax.setLatitude(carEndLatitude);
        this.limits.allowedRangeMax.setDirLatitude(carEndLatitudeDir);
        this.limits.allowedRangeMax.setLongitude(carEndLongitude);
        this.limits.allowedRangeMax.setDirLongitude(carEndLongitudeDir);

        this.limits.allowedMotion = allowedMotion;
    }

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
