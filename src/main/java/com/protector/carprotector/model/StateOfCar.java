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

    public void printInfo() {
        System.out.print("State info:\n\nLocation: " + location.returnStringLocation() + "\nEngine state:  " + engineState + "\nDate and time of last start: " + dateOfLastStart + " " + timeOfLastStart + "\nMotion detected: " + motion + "\n\n");
    }
}
