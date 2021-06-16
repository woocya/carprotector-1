package com.protector.carprotector.model;

import java.sql.Time;
import java.time.LocalDate;

public class StateOfCar {

    Location location;
    boolean engineState;
    LocalDate dateOfLastStart;
    Time timeOfLastStart;
    boolean motion;

    public StateOfCar(Location location, boolean engineState, LocalDate dateOfLastStart, Time timeOfLastStart, boolean motion) {
        this.location = location;
        this.engineState = engineState;
        this.dateOfLastStart = dateOfLastStart;
        this.timeOfLastStart = timeOfLastStart;
        this.motion = motion;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String isEngineState() {
        if (engineState == false) return "off";
        else return "on";
    }

    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }

    public LocalDate getDateOfLastStart() {
        return dateOfLastStart;
    }

    public void setDateOfLastStart(LocalDate dateOfLastStart) {
        this.dateOfLastStart = dateOfLastStart;
    }

    public Time getTimeOfLastStart() {
        return timeOfLastStart;
    }

    public void setTimeOfLastStart(Time timeOfLastStart) {
        this.timeOfLastStart = timeOfLastStart;
    }

    public String isMotion() {
        if (motion == false) return "no motion detected";
        else return "motion detected";
    }

    public void setMotion(boolean motion) {
        this.motion = motion;
    }

    public void printInfo() {
        System.out.print("State info:\n\nLocation: " + location.returnStringLocation() + "\nEngine state:  " + engineState + "\nDate and time of last start: " + dateOfLastStart + " " + timeOfLastStart + "\nMotion detected: " + motion + "\n\n");
    }
}
