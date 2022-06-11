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

    boolean engineState;
    boolean motion;
    LocalDate dateOfLastStart;
    LocalTime timeOfLastStart;

    public Engine(boolean engineState, boolean motion, LocalDate dateOfLastStart, LocalTime timeOfLastStart) {
        this.engineState = engineState;
        this.motion = motion;
        this.dateOfLastStart = dateOfLastStart;
        this.timeOfLastStart = timeOfLastStart;
    }

    public String isEngineState() {
        if (engineState == false) return "off";
        else return "on";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }

    public boolean isMotion() {
        return motion;
    }

    public void setMotion(boolean motion) {
        this.motion = motion;
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
