package com.protector.carprotector.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Engine {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    float vehicleSpeed;
    boolean engineStatus;
    LocalDate dateOfLastStart; //may not work
    LocalTime timeOfLastStart; //may not work

    public Engine(float vehicleSpeed, boolean engineStatus, LocalDate dateOfLastStart, LocalTime timeOfLastStart) {
        this.vehicleSpeed = vehicleSpeed;
        this.engineStatus = engineStatus;
        this.dateOfLastStart = dateOfLastStart;
        this.timeOfLastStart = timeOfLastStart;
    }

    public Engine() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(float vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    public boolean isEngineStatus() {
        return engineStatus;
    }

    public void setEngineStatus(boolean engineStatus) {
        this.engineStatus = engineStatus;
    }

    public LocalDate getDateOfLastStart() {
        return dateOfLastStart;
    }

    public void setDateOfLastStart(LocalDate dateOfLastStart) {
        this.dateOfLastStart = dateOfLastStart;
    }

    public LocalTime getTimeOfLastStart() {
        return timeOfLastStart;
    }

    public void setTimeOfLastStart(LocalTime timeOfLastStart) {
        this.timeOfLastStart = timeOfLastStart;
    }
}
