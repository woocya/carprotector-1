package com.protector.carprotector.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Car {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private String model;
    private Integer yearOfProduction;
    private String version;
    private String registrationNumber;
    private LocalDate insuranceValid;
    // private StateOfCar state;
    private Limitations limits;
    private Engine engineState;
    private Coordinates coordinates;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="model")
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Column(name="yearOfProduction")
    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Column(name="version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Column(name="registrationNumber")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Column(name="insuranceValid")
    public LocalDate getInsuranceValid() {
        return insuranceValid;
    }

    public void setInsuranceValid(LocalDate insuranceValid) {
        this.insuranceValid = insuranceValid;
    }

    /*public StateOfCar getState() {
        return state;
    }

    public void setState(StateOfCar state) {
        this.state = state;
    }*/

    @OneToOne(optional = false)
    @JoinColumn(name="coordinates")
    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCoordinates(double latitude, String dirLatitude, double longitude, String dirLongitude) {
        this.coordinates.setLatitude(latitude);
        this.coordinates.setLongitude(longitude);
        coordinates.fullCoordinates.put(dirLatitude, latitude);
        coordinates.fullCoordinates.put(dirLongitude, longitude);
        this.coordinates.setDirLatitude(dirLatitude);
        this.coordinates.setDirLongitude(dirLongitude);
    }

    @OneToOne(optional = false)
    @JoinColumn(name="engine")
    public Engine getEngineState() {
        return engineState;
    }

    public void setEngineState(Engine engineState) {
        this.engineState = engineState;
    }

    @Column(name="limits")
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
                ", limits=" + limits +
                '}';
    }

    public Car(Long id, String model, int yearOfProduction, String version, String registrationNumber, LocalDate insuranceValid, Limitations limits) {
        this.id = id;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.version = version;
        this.registrationNumber = registrationNumber;
        this.insuranceValid = insuranceValid;
        this.limits = limits;
    }

    public void printInfo() {
        System.out.print("Info about my car:\n\nModel: " + model + "\nYear of profuction: " + yearOfProduction + "\nVersion: " + version +"\nRegistration number: " + registrationNumber +"\nInsurance valid till: " + insuranceValid + "\n\n");
        limits.printLimitations();
    }
}
